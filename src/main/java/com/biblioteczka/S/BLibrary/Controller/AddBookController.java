package com.biblioteczka.S.BLibrary.Controller;


import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.BookServiceImpl;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add-book")
public class AddBookController {
    private BookServiceImpl bookService;

    public AddBookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

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
