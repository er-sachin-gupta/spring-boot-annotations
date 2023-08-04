package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Radhe Krishna";
    }


    @RequestMapping("/book")
    @ResponseBody
    public Book getBook() {
        Book book = new Book(1, "Bhagwad Geeta", "How to Live");
        return book;
    }

}
