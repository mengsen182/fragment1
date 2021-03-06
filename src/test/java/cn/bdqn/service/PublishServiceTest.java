package cn.bdqn.service;

import cn.bdqn.entity.Publish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PublishServiceTest {
    @Resource
    private PublishService publishService;
    @Test
    public void queryAll() throws Exception {
        for (Publish publish : publishService.queryAll()) {
            System.out.println(publish);
        }
    }

}