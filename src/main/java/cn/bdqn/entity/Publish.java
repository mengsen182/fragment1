package cn.bdqn.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/2/002.
 */
@Data
public class Publish {
    private int userId,selectId,publishId;
    private String publishContent;
    private Date createDate;
    private TUser tUser;
}
