package cn.bdqn.service;

import cn.bdqn.entity.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TUserServicesImplTest {
    @Resource
    private TUserServices tUserServices;
    @Test
    public void login() throws Exception {
        TUser tUser = new TUser();
        tUser.setUserName("admin");
        tUser.setPassword("123");
        TUser loginUser = tUserServices.login(tUser);
        System.out.println(loginUser);
    }

    @Test
    public void addTuser() throws Exception {
        TUser tUser = new TUser();
        tUser.setUserName("admin2");
        tUser.setPassword("323");
        tUser.setNickName("第三代");
        tUser.setPhone("12132131");
        int n = tUserServices.addTuser(tUser);
        System.out.println(n);
    }

}