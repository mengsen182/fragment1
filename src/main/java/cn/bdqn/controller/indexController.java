package cn.bdqn.controller;

import cn.bdqn.service.PublishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/3/003.
 */
@Controller
public class indexController {
    @Resource
    private PublishService publishServices;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("publishQueryAll",publishServices.queryAll());
        return "index";
    }
}
