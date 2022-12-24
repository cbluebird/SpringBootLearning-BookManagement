package com.springbootlearning.DaoTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springbootlearning.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDao {
    @Autowired
    private com.springbootlearning.dao.BookDao bookdao;

    @Test
    void testGetById(){
        System.out.println(bookdao.selectById(1));
    }

    @Test
    void testSave(){
        Book book=new Book();
        book.setName("c++设计方法");
        book.setDescription("c++");
        book.setType("计算机语言");
        bookdao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book=new Book();
        book.setId(5);
        book.setName("java设计方法");
        book.setDescription("java");
        book.setType("计算机语言");
        bookdao.updateById(book);
    }

    @Test
    void testDelete(){
        bookdao.deleteById(5);
    }

    @Test
    void testGetAll(){
        System.out.println(bookdao.selectList(null));
    }

    @Test
    void testGetPage(){
        IPage page =new Page(1,2);
        bookdao.selectPage(page,null);
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("name","spring");
        bookdao.selectList(qw);
    }
    @Test
    void testGetBy2(){
        String name="spring";
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();
        lqw.like(name!=null,Book::getName,name);
        bookdao.selectList(lqw);
    }
}
