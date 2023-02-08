package com.biblioteczka.S.BLibrary.Controller;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.BookServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        BookModel bookModel = bookService.getBookById(id);
        model.addAttribute("book", bookModel);
        return "update-book";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, @Valid BookModel bookModel, Model model) {
        bookService.updateBook(bookModel);
        return "redirect:/book-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id, Model model) {
        BookModel bookModel = bookService.getBookById(id);
        bookService.deleteBook(bookModel);
        return "redirect:/book-list";
    }
}
