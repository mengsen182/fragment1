package cn.bdqn.controller;

import cn.bdqn.entity.Complaint;
import cn.bdqn.service.ComplaintService;
import cn.bdqn.service.PublishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/3.
 */
@Controller
public class ComplaintController {
    @Resource
    private PublishService publishService;
    @Resource
    ComplaintService complaintService;
    @RequestMapping("/toComplaint")
    public String toComplatint(){

        return  "complaint";
    }
    @RequestMapping("toindex")
    public  String  toindex(Complaint complaint, Model model){
    int n =complaintService.add(complaint);
    if (n>0){
        model.addAttribute("publishQueryAll",publishService.queryAll());
        return  "/index";
    }
        return "complaint.html";
    }



}
