package com.ch.ebusiness.controller.app;

import com.ch.ebusiness.entity.AUser;
import com.ch.ebusiness.repository.before.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexAppController {
    @Autowired
    private IndexRepository indexRepository;

    @RequestMapping("/index")
    public String index() {

        return "app/index";
    }

    @RequestMapping("/class")
    public String appclass(Model model, Integer tid) {
        if(tid == null)
            tid = 0;
        model.addAttribute("goodsType", indexRepository.selectGoodsType());
        //推荐商品
        model.addAttribute("recommendGoods", indexRepository.selectRecommendGoods(tid));
        //最新商品
        model.addAttribute("lastedGoods", indexRepository.selectLastedGoods(tid));
        model.addAttribute("tid",tid);
        return "app/class";
    }
}
