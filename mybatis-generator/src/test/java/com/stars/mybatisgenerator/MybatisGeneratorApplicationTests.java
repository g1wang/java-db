package com.stars.mybatisgenerator;

import com.stars.mybatisgenerator.mapper.UserMapper;
import com.stars.mybatisgenerator.mapper2book.BookMapper;
import com.stars.mybatisgenerator.model.User;
import com.stars.mybatisgenerator.model2book.Book;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisGeneratorApplication.class)
class MybatisGeneratorApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    BookMapper bookMapper;
    
    

    @Test
    void testInset() {
        User user = new User();
        user.setId(12421);
        user.setUsername("jjk");
        user.setUserId(543);
        User user2 = new User();
        user2.setId(125231);
        user2.setUsername("jjk");
        user2.setUserId(543);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        userMapper.insertMultiple(users);

        Book book = new Book();
        book.setBookName("qweqe");
        bookMapper.insert(book);

    }
}
