package cn.bdqn.controller;

import cn.bdqn.entity.TUser;
import cn.bdqn.service.TUserServices;
import cn.bdqn.util.Message;
import cn.bdqn.util.ValidateCode;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/4/3/003.
 */
@Controller
public class TUserController {
    @Resource
    private TUserServices tUserServices;
   /* @RequestMapping("/")
    public String toLogin(){
        return "login";
    }*/
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(TUser tuser, HttpSession session, Model model) {
        TUser loginUser = tUserServices.login(tuser);
        if (null != loginUser) {
            session.setAttribute("loginUser",loginUser);
            System.out.println("======================？》》"+session.getAttribute("loginUser")+"========================>");

            return "redirect:/toindex";
        }
        model.addAttribute("msg","用户名密码错误");
        return "login";
    }

    //注册用户添加
    @ResponseBody
    @RequestMapping(value = "addTuser",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String addTuser(TUser tUser){
        int n = tUserServices.addTuser(tUser);
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }


    //登录使用的“静态验证码”
    @RequestMapping(value="validateCode")
    public String validateCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 设置响应的类型格式为图片格式
        response.setContentType("image/jpeg");
        //禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        HttpSession session = request.getSession();
        ValidateCode validateCode=new ValidateCode(120,40,5,100);
        session.setAttribute("code", validateCode.getCode());
        validateCode.write(response.getOutputStream());
        return null;
    }

}
