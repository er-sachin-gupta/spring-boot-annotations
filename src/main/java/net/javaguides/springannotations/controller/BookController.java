package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello")
//    @ResponseBody
    public String helloWorld() {
        return "Radhe Krishna";
    }


    /*@RequestMapping(
            value = {"/book", "/java", "/core-java", "/geeta"},
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )*/
    @GetMapping(value = {"/book", "/java", "/core-java", "/geeta"})
//    @ResponseBody
    public Book getBook() {
        Book book = new Book(1, "Bhagwad Geeta", "How to Live");
        return book;
    }

//    @RequestMapping(value = "/books/create", method = RequestMethod.POST)
//    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/books/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

}
