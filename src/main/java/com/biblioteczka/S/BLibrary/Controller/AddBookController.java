package com.biblioteczka.S.BLibrary.Controller;


import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add-book")
public class AddBookController {
    private BookServiceImpl bookService;

    @GetMapping
    public String home(){
        return "add-book";
    }


    @PostMapping
    public String addBook(@RequestBody BookModel Book) {
        bookService.createBook(Book);
        return "add-book";
    }
}
