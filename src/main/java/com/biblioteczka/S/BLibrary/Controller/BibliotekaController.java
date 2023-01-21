package com.biblioteczka.S.BLibrary.Controller;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BibliotekaController {
    @Autowired
private IBookService iBookService;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/dodaj")
    public String addBook(){
        return "add-book";
    }

    @GetMapping("/lista")
    public ResponseEntity<List<BookModel>> getAllBooks(){
        return ResponseEntity.ok().body(iBookService.getAllBooks());
    }
    @GetMapping("/lista/{id}")
    public ResponseEntity<BookModel> getBookById(@PathVariable Long id){
        return ResponseEntity.ok().body(iBookService.getBookById(id));
    }
    @PostMapping("/lista")
    public ResponseEntity<BookModel> createBook(@RequestBody BookModel bookModel){
        return ResponseEntity.ok().body(this.iBookService.createBook(bookModel));
    }
    @PutMapping("/lista/{id}")
    public ResponseEntity<BookModel> updateBook(@PathVariable Long id, @RequestBody BookModel bookModel){
        bookModel.setId(id);
        return ResponseEntity.ok().body(this.iBookService.updateBook(bookModel));
    }
    @DeleteMapping("/lista/{id}")
    public HttpStatus deleteBook(@PathVariable Long id){
        this.iBookService.deleteBook(id);
        return HttpStatus.OK;
    }
}
