package cn.bdqn.controller.publishController;

import cn.bdqn.entity.Discuss;
import cn.bdqn.entity.Publish;
import cn.bdqn.service.DiscussService;
import cn.bdqn.service.PublishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/4/3.
 */
@Controller
@RequestMapping("publish")
public class PublishController {
    @Resource
    private DiscussService discussService;
    @Resource
    private PublishService publishService;
    @RequestMapping("queryPublishById")
    public String queryPubishById(Integer publishId, Model model, HttpSession session){
        Publish publish=publishService.queryPublishById(publishId);
        List<Discuss> list=discussService.queryListDiscuss(publishId);
        model.addAttribute("discussList",list);
        model.addAttribute("publish",publish);
        return "publish/publish";
    }
}
