package com.vn.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vn.entities.NhanVien;
import com.vn.utils.HibernateUtils;

public class NhanVienDaoImpl implements NhanVienDao {
	
	static SessionFactory factory = HibernateUtils.buildSessionFactory();
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NhanVien> getAll() {
		List<NhanVien> list = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			javax.persistence.Query query = session.createQuery("From NhanVien");

			// 4. Execute Query (3);
			list = (List<NhanVien>) query.getResultList();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public NhanVien create(NhanVien nhanvien) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(nhanvien);

			transaction.commit();
			session.close();
			return nhanvien;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public NhanVien update(NhanVien nhanvien) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(nhanvien);

			transaction.commit();
			session.close();
			return nhanvien;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public NhanVien delete(NhanVien nhanvien) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.delete(nhanvien);

			transaction.commit();
			session.close();
			return nhanvien;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
