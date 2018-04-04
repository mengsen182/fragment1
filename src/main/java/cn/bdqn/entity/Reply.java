package cn.bdqn.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/2/002.
 */
@Data
public class Reply {
        private int replyId,selectId,userId;
        private String replyContent;
        private Date createDate;
}
