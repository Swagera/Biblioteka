package com.biblioteczka.S.BLibrary.Repository;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Integer> {

}
