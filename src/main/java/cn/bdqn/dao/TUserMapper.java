package cn.bdqn.dao;

import cn.bdqn.entity.TUser;

/**
 * Created by Administrator on 2018/4/3/003.
 */
public interface TUserMapper {
    public TUser login(TUser tUser);
    public Integer addTuser(TUser tUser);
}
