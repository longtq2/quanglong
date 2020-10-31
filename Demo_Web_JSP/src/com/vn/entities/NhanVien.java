package com.vn.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.xml.bind.v2.runtime.Name;

@Entity
@Table(name="nhanvien")
public class NhanVien implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idNhanVien;
	String tenNhanVien;
	int tuoi;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "idSanPham")
//	private List<SanPham> sanpham;
	
//	public List<SanPham> getSanpham() {
//		return sanpham;
//	}
//	public void setSanpham(List<SanPham> sanpham) {
//		this.sanpham = sanpham;
//	}
	public int getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
}
