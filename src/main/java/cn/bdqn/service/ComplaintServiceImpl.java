package cn.bdqn.service;

import cn.bdqn.dao.ComplaintMapper;
import cn.bdqn.entity.Complaint;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/3.
 */
    @Service
public class ComplaintServiceImpl implements ComplaintService {
    @Resource
    private ComplaintMapper complaintMapper;
    @Override
    public int add(Complaint complaint) {
        return complaintMapper.add(complaint);
    }
}
