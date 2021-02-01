package com.stars.mybatisannotation;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stars.mybatisannotation.mapper.UserMapper;
import com.stars.mybatisannotation.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisAnnotationApplicationTests {

    @Autowired
    UserMapper userMapper;

    /**
     * PageHelper 做分页
     */
    @Test
    void selectPage() {
        PageHelper.startPage(2,2);
        SelectDSLCompleter selectDSLCompleter = SelectDSLCompleter.allRows();
        List<User> users = userMapper.select(selectDSLCompleter);
        PageInfo<User> pageInfo = new PageInfo<User> (users);
        for (int i = 0; i <pageInfo.getList().size() ; i++) {
            System.out.println(pageInfo.getList().get(i).getId());
        }
    }

}
