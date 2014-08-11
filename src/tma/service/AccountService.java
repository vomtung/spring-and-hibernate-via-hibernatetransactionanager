package tma.service;

import java.util.*;

import tma.entities.*;

public interface AccountService {
	public void create(Account account);
	public void remove(Account account);
	public void edit(Account account);
    public List<Account> findAll();
    public Account find(String username);
}
