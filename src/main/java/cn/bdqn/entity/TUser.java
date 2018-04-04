package cn.bdqn.entity;

import lombok.Data;

/**
 * Created by Administrator on 2018/4/2/002.
 */
@Data
public class TUser {
    private  int userId ,selectId;
    private String userName,password,nickName;
    private String phone;
}
