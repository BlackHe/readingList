package com.peony.readinglist.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    private String  isbn;
    private String  title;
    private String  author;
    private String  description;

}
