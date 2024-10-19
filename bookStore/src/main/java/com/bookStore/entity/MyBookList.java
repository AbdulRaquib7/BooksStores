package com.bookStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "my_book_list")
public class MyBookList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_book_list_seq")
    @SequenceGenerator(name = "my_book_list_seq", sequenceName = "MY_BOOK_LIST_SEQ", allocationSize = 1)
    private Long id; // or Integer, depending on your requirement

    private String author;
    private String name;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
