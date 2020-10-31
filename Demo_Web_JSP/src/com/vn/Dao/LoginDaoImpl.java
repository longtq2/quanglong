package com.vn.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.vn.entities.NhanVien;
import com.vn.entities.User;
import com.vn.utils.HibernateUtils;

public class LoginDaoImpl implements LoginDao {
	
	static SessionFactory factory = HibernateUtils.buildSessionFactory();
	
	public User getUser(int id) {
		User user = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			user = (User) session.createQuery("From user where id = '" + id + "'").uniqueResult();

			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@SuppressWarnings("unchecked")
	public boolean checkLogin(String username , String password) {
		List<User> list = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			list = (List<User>) session.createQuery("From User where username = '" + username + "' and password = '" + password + "'").getResultList();
			if(list.size() >=1) {
				return true;
			}
			
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean checkUsername(String username) {
		List<User> list = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			list = (List<User>) session.createQuery("From user where username = '" + username +"'").getResultList();
			if(list.size() >=1) {
				return true;
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
