package cn.bdqn.entity;

import lombok.Data;

/**
 *     id  way     matter  handle
 * Created by Administrator on 2018/4/3.
 */
@Data
public class Complaint {
    private  int id, handle;
    private  String matter, way;

}
