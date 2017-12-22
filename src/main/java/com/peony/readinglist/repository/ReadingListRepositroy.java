package com.peony.readinglist.repository;

import com.peony.readinglist.entity.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by Intellij IDEA
 * User:black
 * description:
 */
public interface ReadingListRepositroy extends JpaRepository<Book,Integer>{

    List<Book> findByReader(String reader);

}
