package com.thoughtworks.cathywu.controller;

import com.google.common.base.Strings;
import com.thoughtworks.cathywu.common.ItemCollection;
import com.thoughtworks.cathywu.common.ItemPool;
import com.thoughtworks.cathywu.model.Book;
import com.thoughtworks.cathywu.model.User;
import com.thoughtworks.cathywu.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/list")
public class ListController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("title", "list");
        model.addAttribute("message", "select one type to display.");
        return "redirect:/test/message";
    }

    @RequestMapping(value="/{type}", method = RequestMethod.GET)
    public String displayInfo(@PathVariable String type, Model model) {
        readyForBooks();
        readyForUsers();

        model.addAttribute("title", type);
        if ("book".equals(type)) {
            ItemCollection<Book> bookItemCollection = ItemPool.getPool().getItems(Book.class);
            model.addAttribute("datas", bookItemCollection.getAllItems());
            return "booklist";
        } else if ("user".equals(type)) {
            ItemCollection<User> userItemCollection = ItemPool.getPool().getItems(User.class);
            model.addAttribute("datas", userItemCollection.getAllItems());
            return "userlist";
        } else {
            model.addAttribute("message", "wrong parameter.");
            return "redirect:/test/message";
        }
    }

    private void readyForBooks() {
        Book book1 = new Book();
        book1.setAuthor("Cathy");
        book1.setName("Thinking in Java");
        book1.setIntroduction("abcd...");

        Book book2 = new Book();
        book2.setAuthor("Jason");
        book2.setName("Thinking in Ruby");
        book2.setIntroduction("abcd...");

        ItemCollection<Book> bookItemCollection = new ItemCollection<Book>();
        bookItemCollection.addItem(book1);
        bookItemCollection.addItem(book2);

        ItemPool pool = ItemPool.getPool();
        pool.addCollection(Book.class, bookItemCollection);
    }

    private void readyForUsers() {
        User user1 = new User();
        user1.setName("Cathy");
        user1.setEmail("lotuswlz@163.com");
        user1.setAge(31);

        User user2 = new User();
        user2.setName("Jason");
        user2.setEmail("jason@123.com");
        user2.setAge(20);

        User user3 = new User();
        user3.setName("Sam");
        user3.setEmail("sam@123.com");
        user3.setAge(25);

        ItemCollection<User> userItemCollection = new ItemCollection<User>();
        userItemCollection.addItem(user1);
        userItemCollection.addItem(user2);
        userItemCollection.addItem(user3);

        ItemPool pool = ItemPool.getPool();
        pool.addCollection(User.class, userItemCollection);
    }
}
