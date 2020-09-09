package com.vn.dao;

import java.util.List;

import com.vn.entities.NhanVien;


public interface NhanVienDAO {
	public Integer delete(int id);

	public List<NhanVien> findAll();
}
