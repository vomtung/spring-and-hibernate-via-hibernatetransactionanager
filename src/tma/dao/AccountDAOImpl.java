package tma.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.hibernate.*;

import tma.entities.*;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void create(Account account) {
		sessionFactory.getCurrentSession().persist(account);
	}

	@SuppressWarnings("unchecked")
	public List<Account> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Account.class)
				.list();
	}

	@Override
	public void remove(Account account) {
		sessionFactory.getCurrentSession().delete(
				sessionFactory.getCurrentSession().merge(account));
	}

	@Override
	public void edit(Account account) {
		sessionFactory.getCurrentSession().merge(account);
	}

	@Override
	public Account find(String username) {
		return (Account) sessionFactory.getCurrentSession()
				.createQuery("from Account where username=:username")
				.setParameter("username", username).uniqueResult();
	}
}
