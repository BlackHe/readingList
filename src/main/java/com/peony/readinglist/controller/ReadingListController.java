package com.peony.readinglist.controller;

import com.peony.readinglist.entity.Book;
import com.peony.readinglist.repository.ReadingListRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create by Intellij IDEA
 * User:black
 * description:
 */
@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    @Autowired
    private ReadingListRepositroy readingListRepositroy;

    @GetMapping("/")
    @ResponseBody
    public List<Book> getReadingList(){
        List<Book> bookList = readingListRepositroy.findAll();
        System.out.println(bookList);
        return bookList;
    }

    @GetMapping(value = "/{reader}")
    public String getReadingList(@PathVariable("reader") String reader, Model model){
        if (reader == null) {
            return null;
        }
        System.out.println(reader);
        List<Book> bookList = this.readingListRepositroy.findByReader(reader);
        if (bookList != null) {
            //添加到model的attribute的键是“books”,值为获取到的readingList;
            model.addAttribute("books",bookList);
        }
        System.out.println(bookList);
        return "readingList";
    }

    @PostMapping("/{reader}")
    public String addToReadingList(@PathVariable("reader") String reader,Book book){
        book.setReader(reader);
        readingListRepositroy.save(book);
        return "redirect:/readingList/{reader}";

    }

}
