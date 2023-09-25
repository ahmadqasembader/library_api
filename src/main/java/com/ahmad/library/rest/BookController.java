package com.ahmad.library.rest;

import com.ahmad.library.Entity.Book;
import com.ahmad.library.Services.BookService;
import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    private BookService book;

    public BookController(BookService theBook){
        this.book = theBook;
    }

    @GetMapping("/books")
    public ResponseEntity<?> findAll(){
        if(book.findAll().isEmpty()){
            return new ResponseEntity<>("No book was found", HttpStatus.NOT_FOUND);
        }else {
            return ResponseEntity.ok(book.findAll());
        }
    }

    @PostMapping("/books/new_book")
    public ResponseEntity<?> add(@RequestBody Book temp){
        temp = book.add(temp);

        // check if the book isn't null
        if(temp.getAuthor() != null || temp.getBook_title() != null){
            return new ResponseEntity<Book>(temp, HttpStatus.CREATED);

        }else{
            return new ResponseEntity<String>("Book information is required", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/books/remove/{id}")
    public ResponseEntity<?> remove(@PathVariable("id") int id){
        return book.remove(id);
    }
}
