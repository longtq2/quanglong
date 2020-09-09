package com.vn.dao;

import java.util.List;

import com.vn.entities.SanPham;

public interface SanPhamDAO {
	
	public Integer delete(int id);
	
	public SanPham create(SanPham sanPham );

	public SanPham update(SanPham sanPham);
	
	List<SanPham> LayDanhSachSanPham (int spbatdau , int spketthuc);

}
