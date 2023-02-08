package com.biblioteczka.S.BLibrary.Controller;


import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.BookServiceImpl;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/add-book")
public class AddBookController {
    private BookServiceImpl bookService;

    public AddBookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String home(Model model){
        model.addAttribute("book",new BookModel());
        return "add-book";
    }


    @PostMapping
    public String addBook(@ModelAttribute BookModel bookModel, Model model) {
        model.addAttribute("book", bookModel);
        bookService.createBook(bookModel);
        return "redirect:/book-list";
    }
}
