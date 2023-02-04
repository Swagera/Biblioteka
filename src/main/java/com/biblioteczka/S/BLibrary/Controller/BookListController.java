package com.biblioteczka.S.BLibrary.Controller;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book-list")
public class BookListController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book-list";
    }

    @GetMapping("/{id}")
    public String findBookById(@PathVariable int id) {
        bookService.getBookById(id);
        return "book-list";
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody BookModel Book){
        bookService.updateBook(Book);
        return "book-list";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }
}
