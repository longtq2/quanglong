package com.vn.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vn.entities.Product;
import com.vn.utils.HibernateUtils;

public class ProductDAOImpl implements ProductDAO {

	static SessionFactory factory = HibernateUtils.buildSessionFactory();

	@Override
	public Product create(Product product) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(product);

			transaction.commit();
			session.close();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findAll() {
		List<Product> list = null;
		try {
			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			javax.persistence.Query query = session.createQuery("From Product");

			// 4. Execute Query (3);
			list = (List<Product>) query.getResultList();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
