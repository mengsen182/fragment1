package cn.bdqn.dao;

import cn.bdqn.entity.Discuss;
import cn.bdqn.entity.Publish;

import java.util.List;

/**
 * Created by Administrator on 2018/4/3.
 */
public interface PublishMapper {

    public Publish queryPublishById(Integer publishId);

    public List<Discuss> queryListDiscuss(Integer publishId);
    List<Publish> queryAll();
}
