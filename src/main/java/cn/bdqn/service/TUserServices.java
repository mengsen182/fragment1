package cn.bdqn.service;

import cn.bdqn.entity.TUser;

/**
 * Created by Administrator on 2018/4/3/003.
 */
public interface TUserServices {
    //登陆
    public TUser login(TUser tUser);
    //注册
    public Integer addTuser(TUser tUser);
}
