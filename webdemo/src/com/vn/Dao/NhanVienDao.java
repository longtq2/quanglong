package com.vn.Dao;

import java.util.List;

import com.vn.entities.NhanVien;

public interface NhanVienDao {
	public List<NhanVien> getAll();

	public NhanVien create(NhanVien nhanvien);

	public NhanVien update(NhanVien nhanvien);

	public NhanVien delete(NhanVien nhanvien);
}
