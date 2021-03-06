package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "redirect:post/";
    }

    @RequestMapping("/bs-sample")
    public ModelAndView bsSample(){
        MockAmigo mock = new MockAmigo();
        List<Amigo> list = mock.getAmigo();

        return new ModelAndView("bbs/bs_sample")
                .addObject("list", list);
    }

    @RequestMapping("/bs-sample/detail")
    public ModelAndView bsSampleDetail(@RequestParam String search){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bs_sample_detail");
        mav.addObject("search", search);
        return mav;
    }
}