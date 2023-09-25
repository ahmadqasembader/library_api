package com.ahmad.library.Services;

import com.ahmad.library.Entity.Book;
import com.ahmad.library.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService {

    private BookRepo repo;

    public BookServiceImp(){    };
    @Autowired
    BookServiceImp(BookRepo repo){
        this.repo = repo;
    }
    @Override
    public List<Book> findAll() {
        return repo.findAll();
    }

    @Override
    public Book add(@RequestBody Book book) {
        // create a new instance of book
        book.setId(0);
        Book dbBook = repo.save(book);
        return dbBook;
    }


    @Override
    public ResponseEntity<?> remove(@RequestBody int id) {
        if(doesBookExist(id)){
            repo.deleteById(id);
            return new ResponseEntity<>("Book is deleted", HttpStatus.CREATED);
        }else{
            System.out.println("here" + doesBookExist(id));
            return new ResponseEntity<>("Id is invalid", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public boolean doesBookExist(int id) {
        return repo.existsById(id);
    }
}
