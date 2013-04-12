package pl.mszulc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mszulc.Shop;

@Controller
@RequestMapping("/wine")
public class SimpleController {

    @RequestMapping("/home")
    @ResponseBody
    public String index() {

        return "Siema Siema";
    }

    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJSON(@PathVariable String name) {

        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

        return shop;

    }

    @RequestMapping(value = "/pets", method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public Shop addPet(@RequestBody Shop shop, Model model) {
        System.out.println(shop.getName());
        System.out.println(shop.getStaffName());
        return shop;
    }
}
