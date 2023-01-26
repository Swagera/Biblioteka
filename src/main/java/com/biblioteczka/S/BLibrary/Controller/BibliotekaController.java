package com.biblioteczka.S.BLibrary.Controller;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.BookServiceImpl;
import com.biblioteczka.S.BLibrary.Service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@Controller
public class BibliotekaController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("search")
    public String search(){
        return "search";
    }
    @PostMapping("/add-book")
    public String addBook(@RequestBody BookModel Book) {
        bookService.createBook(Book);
        return "add-book";
    }

    @GetMapping("/book-list")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book-list";
    }

    @GetMapping("/book-list/{id}")
    public String findBookById(@PathVariable int id) {
        bookService.getBookById(id);
        return "book-list";
    }

    @PutMapping("/book-list/update")
    public String updateBook(@RequestBody BookModel Book){
        bookService.updateBook(Book);
        return "book-list";
    }

    @DeleteMapping("/book-list/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }
}
