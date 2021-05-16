package com.example.demo.service;

import com.example.demo.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findById(String username);
}
