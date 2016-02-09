package spring.board.service;

import java.util.List;
import java.util.Map;

import spring.board.dao.MainDao;

public class MainServiceImpl implements MainService {
	

	private MainDao mainDao;


	public void setMainDao(MainDao mainDao) {
		this.mainDao = mainDao;
	}


	public String getToday() {
		return mainDao.getToday();
	}
		
	public int writeProc(Map<String, Object> paramMap) {
		return mainDao.writeProc(paramMap);
	}
	
	public List getList(Map<String, Object> paramMap) {
		return mainDao.getList(paramMap);
	}
}
