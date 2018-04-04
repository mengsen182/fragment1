package cn.bdqn.service;

import cn.bdqn.entity.Discuss;

import java.util.List;

/**
 * Created by Administrator on 2018/4/4.
 */
public interface DiscussService {
    public List<Discuss> queryListDiscuss(Integer publishId);
}
