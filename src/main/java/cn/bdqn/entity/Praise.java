package cn.bdqn.entity;

import lombok.Data;

/**
 * Created by Administrator on 2018/4/2/002.
 */
@Data
public class Praise {

    private  int praiseId,discussId,publishId,selectId,userId;
    private  String praiseName;
}
