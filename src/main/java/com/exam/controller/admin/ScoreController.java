package com.exam.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exam.entity.vo.scoreVo;
import com.exam.service.ScoreService;

@Controller
@RequestMapping("/admin")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping(value="/score.html",method = RequestMethod.GET)
	public ModelAndView findUserExamInfo(){
		List<scoreVo> listScore=scoreService.findUserExamInfo();
		System.out.println("---------------------");
		System.out.println(listScore);
		System.out.println("---------------------");
		ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("listScore", listScore);
    	modelAndView.setViewName("_admin/score"); 
		return modelAndView;
	}

}
