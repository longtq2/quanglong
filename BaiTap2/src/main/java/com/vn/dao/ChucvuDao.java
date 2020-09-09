package com.vn.dao;

import java.util.List;

import com.vn.entities.ChucVu;

public interface ChucvuDao {

	public Integer delete(int id);

	public List<ChucVu> findAll();
}
