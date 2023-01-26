package com.biblioteczka.S.BLibrary.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class BookModel {
@Id
@GeneratedValue
    private int id;
    private String title;
    private String year;
    private String grade;
}
