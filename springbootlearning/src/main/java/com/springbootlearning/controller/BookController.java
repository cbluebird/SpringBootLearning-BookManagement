package com.springbootlearning.controller;

import com.springbootlearning.controller.utility.R;
import com.springbootlearning.domain.Book;
import com.springbootlearning.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public R getAll(){
        return new R(true,bookService.getAll());
    }

    @PostMapping
    public R save(@RequestBody Book book){
//        R r=new R();
//        Boolean flag=bookService.save(book);
//        r.setFlag(flag);
        return new R(bookService.save(book));
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.update(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }

    @GetMapping("{id}")
    public R getBYId(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }
}