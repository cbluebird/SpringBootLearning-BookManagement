package com.springbootlearning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootlearning.dao.BookDao;
import com.springbootlearning.domain.Book;
import com.springbootlearning.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {
}
