package com.vacation.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.vacation.ssh.dao.UserDao;

@Transactional
public class UserService {

	//×¢Èëdao
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		System.out.println("service.......");
		userDao.add();
	}
}
