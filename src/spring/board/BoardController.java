package spring.board;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.board.service.MainService;

@Controller
public class BoardController {

	@Autowired
	private MainService mainService;
	
	
	@RequestMapping("/list.do")
	public void list(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		model.put("results", mainService.getList(paramMap));
	}
	
	@RequestMapping("/hello.do")
	public void hello(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		model.put("title", "나의 첫번째 스프링");
	}
	
	@RequestMapping("/today.do")
	public void today(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		model.put("today", mainService.getToday());
	}
	
	@RequestMapping("/writeForm.do")
	public void writeForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{

	}
	
	@RequestMapping("/writeProc.do")
	public ModelAndView  writeProc(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{

		//Form 에서 넘어 오는 값  찍기  	paramMap 안에 Form 에서 넘어 오는 값이 있음	
		System.out.println("title = " + paramMap.get("title"));
		System.out.println("content = " + paramMap.get("content"));
		
		//저장하기 위하여 paramMap 을 넘긴다.
		int writeCnt = mainService.writeProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다/");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/writeForm.do");
		return mav;

	}
		

	

}
