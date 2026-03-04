package com.klu;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    private List<Book> bookList = new ArrayList<>();

    // 1. Welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System";
    }

    // 2. Count
    @GetMapping("/count")
    public int count() {
        return 100;
    }

    // 3. Price
    @GetMapping("/price")
    public double price() {
        return 499.99;
    }

    // 4. Books List
    @GetMapping("/books")
    public List<String> books() {
        return Arrays.asList("Spring Boot", "Java Basics", "Data Structures");
    }

    // 5. Book by ID
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book with ID: " + id;
    }

    // 6. Search using RequestParam
    @GetMapping("/search")
    public String search(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    // 7. Author PathVariable
    @GetMapping("/author/{name}")
    public String author(@PathVariable String name) {
        return "Books written by author: " + name;
    }

    // 8. Add Book (POST)
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully!";
    }

    // 9. View Added Books
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}