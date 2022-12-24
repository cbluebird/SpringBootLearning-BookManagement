package com.springbootlearning.service;

import com.springbootlearning.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTest {
    @Autowired
    private IBookService bookService;
    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave(){
        Book book=new Book();
        book.setName("c++设计方法");
        book.setDescription("c++");
        book.setType("计算机语言");
        bookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book=new Book();
        book.setId(5);
        book.setName("java设计方法");
        book.setDescription("java");
        book.setType("计算机语言");
        bookService.updateById(book);
    }

    @Test
    void testDelete(){
        bookService.removeById(5);
    }

    @Test
    void testGetAll(){
        System.out.println(bookService.list());
    }
}