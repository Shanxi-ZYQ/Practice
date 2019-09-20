package com.vacation.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.vacation.ssh.entity.User;

public class UserDaoImpl implements UserDao {

	//得到hibernateTemplate对象
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	//添加操作
	@Override
	public void add() {
		//hibernateTemplate对hibernate进行了封装,所以传入sessionFactory方法
//		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		
//		User user = new User();
//		user.setUsername("小张");
//		user.setPassword("123456");
		
		//调用save方法实现添加
//		hibernateTemplate.save(user);
		
		//1 get方法,根据id查询
//		User user = hibernateTemplate.get(User.class, 1);
//		System.out.println(user);
		
		//2 find方法查询所有记录
//		List<User> list = (List<User>) hibernateTemplate.find("from User");
//		for (User user : list) {
//			System.out.println(user.getUsername()+"::"+user.getPassword());
//		}
		
		//3 find方法条件查询
		//查询username值"小张"
		List<User> list = (List<User>) hibernateTemplate.find("from User where username=?", "小张");
		for (User user : list) {
			System.out.println(user.getUsername()+"::"+user.getPassword());
		}
		
	}

}
