package com.biblioteczka.S.BLibrary.Service;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {

    private BookRepository bookRepository;
    public BookServiceImpl (BookRepository bookRepository){
        super();
        this.bookRepository = bookRepository;
    }
    @Override
    public BookModel createBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    @Override
    public BookModel updateBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    @Override
    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookModel getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public String deleteBook(BookModel bookModel) {
    bookRepository.delete(bookModel);
    return "book with id: " +bookModel.getId() + " deleted!";
    }
}
