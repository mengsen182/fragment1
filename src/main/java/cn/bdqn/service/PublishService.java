package cn.bdqn.service;

import cn.bdqn.entity.Publish;

import java.util.List;

/**
 * Created by Administrator on 2018/4/3.
 */
public interface PublishService
{
    public Publish queryPublishById(Integer publishId);
    List<Publish> queryAll();
}
