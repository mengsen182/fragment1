package cn.bdqn.service;

import cn.bdqn.dao.PublishMapper;
import cn.bdqn.entity.Publish;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/3.
 */
@Service
public class PublishServiceImpl implements PublishService {
    @Resource
    private PublishMapper publishMapper;
    @Override
    public Publish queryPublishById(Integer publishId) {
        return publishMapper.queryPublishById(publishId);
    }

    @Override
    public List<Publish> queryAll() {
        return publishMapper.queryAll();
    }
}
