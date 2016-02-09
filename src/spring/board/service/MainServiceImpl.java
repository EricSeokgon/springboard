package spring.board.service;

import spring.board.dao.MainDao;

public class MainServiceImpl implements MainService {
	

	private MainDao mainDao;


	public void setMainDao(MainDao mainDao) {
		this.mainDao = mainDao;
	}


	public String getToday() {
		return mainDao.getToday();
	}

}
