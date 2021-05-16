package com.example.demo.dao;

import com.example.demo.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Account;

import javax.persistence.NoResultException;

@Transactional
@Repository
public class AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// Pega o username da sessão e faz um find dele retornando um Account
	public Account findAccount(String userName) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.find(Account.class, userName);
	}

	public Account findUser(String username) {
		try {
			String sql = "Select e from " + Account.class.getName() + " e Where e.user_name =:username ";

			Session session = this.sessionFactory.getCurrentSession();
			Query<Account> query = session.createQuery(sql, Account.class);
			query.setParameter("username", username);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
