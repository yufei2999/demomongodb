package com.yufei.action;

import com.yufei.model.User;
import com.yufei.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2016-12-13.
 */
@Controller
@RequestMapping(value = "/test")
public class TestAction {

    private static final Logger logger = LoggerFactory.getLogger(TestAction.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserList")
    public String getUserList(Model model) {
        Map<String, Object> params = new HashMap<>();
        params.put("maxAge", 50);
        List<User> list = userService.findAll(params, "user");
        model.addAttribute("list", list);
        return "/test";
    }

}
