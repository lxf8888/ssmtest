package org.example.controller;

import org.apache.ibatis.annotations.Delete;
import org.example.domain.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }
    @PutMapping
    public boolean update(@RequestBody Book book) {
        return  bookService.update(book);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }
    @GetMapping("/{id}")
    public Book findById(@PathVariable Integer id) {
        return bookService.findById(id);
    }
    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
