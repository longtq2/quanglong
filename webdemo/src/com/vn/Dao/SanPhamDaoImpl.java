package com.vn.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vn.entities.SanPham;
import com.vn.utils.HibernateUtils;

public class SanPhamDaoImpl implements SanPhamDao {
	static SessionFactory factory = HibernateUtils.buildSessionFactory();
	@Override
	public List<SanPham> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanPham create(SanPham sanpham) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(sanpham);

			transaction.commit();
			session.close();
			return sanpham;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SanPham update(SanPham sanpham) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanPham delete(SanPham sanpham) {
		// TODO Auto-generated method stub
		return null;
	}

}
