package com.biblioteczka.S.BLibrary.Model;


import jakarta.persistence.*;

@Entity
@Table(name ="books")
public class BookModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
@Column(name = "title")
    private String title;
    @Column(name = "year")
    private int year;
    @Column(name = "grade")
    private int grade;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



}
