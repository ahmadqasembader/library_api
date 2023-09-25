package com.ahmad.library.Repo;

import com.ahmad.library.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
