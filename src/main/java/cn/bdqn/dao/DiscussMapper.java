package cn.bdqn.dao;

import cn.bdqn.entity.Discuss;

import java.util.List;

/**
 * Created by Administrator on 2018/4/4.
 */
public interface DiscussMapper {
    public List<Discuss> queryListDiscuss(Integer publishId);
}
