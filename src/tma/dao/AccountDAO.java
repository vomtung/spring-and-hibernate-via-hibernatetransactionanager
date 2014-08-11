package tma.dao;

import java.util.*;

import tma.entities.*;

public interface AccountDAO {
	public void create(Account account);
	public void remove(Account account);
	public void edit(Account account);
    public List<Account> findAll();
    public Account find(String username);
}
