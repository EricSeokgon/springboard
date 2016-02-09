package spring.board.service;

import java.util.List;
import java.util.Map;

public interface MainService {

	public String getToday();
	
	public int writeProc(Map<String, Object> paramMap);
	
	public List getList(Map<String, Object> paramMap);
}
