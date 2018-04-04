package cn.bdqn.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/2/002.
 */
@Data
public class Discuss {
    private int discussId,replyId,userId,publishId,seleteId;
    private String discussContent;
    private Date createDate;
    private TUser tUser;
}
