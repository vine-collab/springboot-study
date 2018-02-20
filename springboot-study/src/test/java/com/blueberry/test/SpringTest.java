package com.blueberry.test;

import com.blueberry.springboot.jdbc.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hekai
 * @create 2018-02-20-14:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpringTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAddUser(){
        Assert.assertEquals(1L, userDao.addUser("hekai"));
        Assert.assertEquals(0L, userDao.addUser(null));
    }
}
































