package cn.bdqn.service;

import cn.bdqn.dao.DiscussMapper;
import cn.bdqn.entity.Discuss;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/4.
 */
@Service
public class DiscussServiceImpl implements DiscussService {
    @Resource
    private DiscussMapper discussMapper;
    @Override
    public List<Discuss> queryListDiscuss(Integer publishId) {
        return discussMapper.queryListDiscuss(publishId);
    }
}
