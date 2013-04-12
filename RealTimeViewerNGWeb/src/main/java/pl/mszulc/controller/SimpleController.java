package pl.mszulc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 12.04.13
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class SimpleController {

    @RequestMapping("/home")
    @ResponseBody
    public String index() {
        return "Siema Siema";
    }
}
