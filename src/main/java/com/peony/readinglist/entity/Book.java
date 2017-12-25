package com.peony.readinglist.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Create by Intellij IDEA
 * User:black
 * description:实体类
 */
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String  reader;
    @Min(value = 1000,message = "isbn不能是小于1000的数字")
    private String  isbn;
    private String  title;
    private String  author;
    private String  description;

}
