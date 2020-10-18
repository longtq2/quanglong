package com.vn.controller;

import java.util.List;

import com.vn.Dao.NhanVienDao;
import com.vn.Dao.NhanVienDaoImpl;
import com.vn.Dao.SanPhamDao;
import com.vn.Dao.SanPhamDaoImpl;
import com.vn.entities.NhanVien;
import com.vn.entities.SanPham;

public class NHanVien_controller {
	static NhanVienDao nhanVienDao = new NhanVienDaoImpl();
	static SanPhamDao sanPhamDao = new SanPhamDaoImpl();
	public static void main(String[] args) {
		// -------------------INSERT--------------------------------
//		SanPham ins_sp1 = new SanPham();
//		ins_sp1.setTenSanPham("ahaha");
//		ins_sp1.setGiaTien("2000");
//		SanPham ins_sp2 = new SanPham();
//		ins_sp2.setTenSanPham("ahaha");
//		ins_sp2.setGiaTien("2000");
//		
//		List<SanPham> spSanPhams = new List<SanPham>();
//		
		NhanVien ins_nv = new NhanVien();
		ins_nv.setTenNhanVien("thúy");
		ins_nv.setTuoi(25);
		nhanVienDao.create(ins_nv);
		System.out.println("create nhân viên thành công");
		// -------------------LIST USER-----------------------
		for (NhanVien list_nhanvien : nhanVienDao.getAll()) {
			System.out.println("thông tin nhân viên ");
			System.out.println("ID : " + list_nhanvien.getIdNhanVien());
			System.out.println("tên : " + list_nhanvien.getTenNhanVien());
			System.out.println("tuổi : " + list_nhanvien.getTuoi());
		}
//		// -------------------UPDATE--------------------------------
//		NhanVien upd_nv = new NhanVien();
//		upd_nv.setIdNhanVien(3);
//		upd_nv.setTenNhanVien("thúy");
//		upd_nv.setTuoi(15);
//		nhanVienDao.update(upd_nv);
//		System.out.println("update nhân viên thành công");
//		// -------------------DELETE--------------------------------
//		NhanVien del_nv = new NhanVien();
//		del_nv.setIdNhanVien(2);
//		nhanVienDao.delete(del_nv);
//		System.out.println(" nhân viên da bị getout");
	}

}
