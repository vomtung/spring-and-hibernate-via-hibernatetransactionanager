package tma.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import tma.dao.*;
import tma.entities.*;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;

	public void create(Account account) {
		accountDAO.create(account);
	}

	public List<Account> findAll() {
		return accountDAO.findAll();
	}

	public void remove(Account account) {
		accountDAO.remove(account);
	}

	@Override
	public void edit(Account account) {
		accountDAO.edit(account);
	}

	@Override
	public Account find(String username) {
		return accountDAO.find(username);
	}

}
