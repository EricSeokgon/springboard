package spring.board;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.board.service.MainService;

@Controller
public class BoardController {

	@Autowired
	private MainService mainService;
	
	
	@RequestMapping("/hello.do")
	public void hello(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		model.put("title", "���� ù��° ������");
	}
	
	@RequestMapping("/today.do")
	public void today(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		model.put("today", mainService.getToday());
	}
}
