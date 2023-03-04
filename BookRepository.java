package com.jspiders.springbootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.springbootApp.BookPOJO.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

   

	
}
