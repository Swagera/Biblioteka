package com.biblioteczka.S.BLibrary.Service;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookModel createBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    @Override
    public BookModel updateBook(BookModel bookModel) {
        Optional<BookModel> updateById = this.bookRepository.findById(bookModel.getId());

        if(updateById.isPresent()){
            BookModel updatedBook = updateById.get();
            updatedBook.setId(bookModel.getId());
            updatedBook.setGrade(bookModel.getGrade());
            updatedBook.setTitle(bookModel.getTitle());
            updatedBook.setYear(bookModel.getYear());
            bookRepository.save(updatedBook);
            return updatedBook;
        }else {
            throw new RuntimeException("Nie znaleziono ksiazki");
        }
    }

    @Override
    public List<BookModel> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public BookModel getBookById(Long id) {
        Optional<BookModel> bookById = this.bookRepository.findById(id);
        if(bookById.isPresent()){
            return bookById.get();
        } else {
            throw new RuntimeException("Nie ma ksiazki o takim id");
        }

    }

    @Override
    public void deleteBook(Long id) {
        Optional<BookModel> bookDeletion = this.bookRepository.findById(id);
        if(bookDeletion.isPresent()){
            bookRepository.delete(bookDeletion.get());
        } else {
            throw new RuntimeException("Nie mozna usunac ksiazki o takim id bo nie ma takiej");
        }
    }
}
