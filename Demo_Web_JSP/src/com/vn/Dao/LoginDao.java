package com.vn.Dao;

import com.vn.entities.User;

public interface LoginDao {
	public User getUser(int id);
	public boolean checkLogin(String username , String password);
	public boolean checkUsername(String username);
}
