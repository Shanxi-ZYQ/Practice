package com.vacation.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.vacation.ssh.entity.User;

public class UserDaoImpl implements UserDao {

	//�õ�hibernateTemplate����
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	//��Ӳ���
	@Override
	public void add() {
		//hibernateTemplate��hibernate�����˷�װ,���Դ���sessionFactory����
//		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		
//		User user = new User();
//		user.setUsername("С��");
//		user.setPassword("123456");
		
		//����save����ʵ�����
//		hibernateTemplate.save(user);
		
		//1 get����,����id��ѯ
//		User user = hibernateTemplate.get(User.class, 1);
//		System.out.println(user);
		
		//2 find������ѯ���м�¼
//		List<User> list = (List<User>) hibernateTemplate.find("from User");
//		for (User user : list) {
//			System.out.println(user.getUsername()+"::"+user.getPassword());
//		}
		
		//3 find����������ѯ
		//��ѯusernameֵ"С��"
		List<User> list = (List<User>) hibernateTemplate.find("from User where username=?", "С��");
		for (User user : list) {
			System.out.println(user.getUsername()+"::"+user.getPassword());
		}
		
	}

}
