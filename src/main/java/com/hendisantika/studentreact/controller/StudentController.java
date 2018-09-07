package com.hendisantika.studentreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : student-react
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/09/18
 * Time: 05.57
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class StudentController {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
