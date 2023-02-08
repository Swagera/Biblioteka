package com.biblioteczka.S.BLibrary;

import com.biblioteczka.S.BLibrary.Model.BookModel;
import com.biblioteczka.S.BLibrary.Repository.BookRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotekaMain{

	public static void main(String[] args) {
		SpringApplication.run(BibliotekaMain.class, args);
	}


//	@Override
//	public void run(String... args) throws Exception {
//BookModel book1 = new BookModel("fsfsdfsfsd", "1996", "good");
//		 bookRepository.save(book1);
//		BookModel book2 = new BookModel("cvxghfedgdh", "1996", "good");
//		bookRepository.save(book2);
//		BookModel book3 = new BookModel("erqwergfxd", "1996", "good");
//		bookRepository.save(book3);
//	}
}

