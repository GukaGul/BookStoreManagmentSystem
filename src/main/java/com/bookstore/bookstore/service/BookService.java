package com.bookstore.bookstore.service;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.repository.BookRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;
    public void save(Book b) {
        bRepo.save(b);
    }

    public List<Book> getAllBooks() {
        return bRepo.findAll();
    }

    public Book getBookById(int id) {

        //return bRepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        return bRepo.findById(id).get();
    }

    public void deleteById(int id) {
        bRepo.deleteById(id);
    }

 }
