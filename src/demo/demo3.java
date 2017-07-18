package demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping("ceshi") 如果在这家requestMapping 则访问路径要变成/ceshi/demo3.action
public class demo3 {
    @RequestMapping("/demo3.action") // 这块可以写成demo3 访问demo3.action一样可以找到
    public ModelAndView items() {
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setCreatetime(new Date());
        items_1.setDetail("联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setCreatetime(new Date());
        items_2.setDetail("苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

        ModelAndView modelAndView = new ModelAndView();
        // 将数据填充到request
        // request.setAttribute("itemsList", itemsList);
        modelAndView.addObject("itemsList", itemsList);
        // 指定转发的jsp页面
        modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");
        return modelAndView;

    }
}
