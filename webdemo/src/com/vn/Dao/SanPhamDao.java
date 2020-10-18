package com.vn.Dao;

import java.util.List;

import com.vn.entities.SanPham;


public interface SanPhamDao {
	public List<SanPham> getAll();

	public SanPham create(SanPham sanpham);

	public SanPham update(SanPham sanpham);

	public SanPham delete(SanPham sanpham);
}
