package cn.bdqn.service;

import cn.bdqn.entity.Discuss;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DiscussServiceImplTest {
    @Resource
    private DiscussService discussService;
    @Test
    public void queryListDiscuss() throws Exception {
        List<Discuss>list=discussService.queryListDiscuss(1);
        for (Discuss discuss : list) {
            System.out.println(discuss);
        }
    }

}