package cn.bdqn.service;

import cn.bdqn.dao.TUserMapper;
import cn.bdqn.entity.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/3/003.
 */
@Service
public class TUserServicesImpl implements TUserServices {
    @Resource
    private TUserMapper tUserMapper;
    @Override
    public TUser login(TUser tUser) {
        return tUserMapper.login(tUser);
    }

    @Override
    public Integer addTuser(TUser tUser) {
        return tUserMapper.addTuser(tUser);
    }
}
