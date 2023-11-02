package com.bookstore.bookstore.service;

import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository myBook;

    public void saveMyBooks(MyBookList book) {
        myBook.save(book);
    }

    public List<MyBookList> getAllMyBooks() {
        return myBook.findAll();
    }

    public void deleteById(int id) {
        myBook.deleteById(id);
    }
}
