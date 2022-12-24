package com.springbootlearning.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("book")
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
