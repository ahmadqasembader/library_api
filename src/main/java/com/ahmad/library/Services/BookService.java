package com.ahmad.library.Services;

import com.ahmad.library.Entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book add(@RequestBody Book book);

    ResponseEntity<?> remove(@RequestBody int id);

    public boolean doesBookExist(int id);


}
