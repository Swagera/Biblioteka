package com.biblioteczka.S.BLibrary.Service;

import com.biblioteczka.S.BLibrary.Model.BookModel;

import java.util.List;

public interface IBookService {
     BookModel createBook (BookModel bookModel);
    BookModel updateBook (BookModel bookModel);
    List<BookModel> getAllBooks();
    BookModel getBookById(Long id);
    void deleteBook (Long id);

}
