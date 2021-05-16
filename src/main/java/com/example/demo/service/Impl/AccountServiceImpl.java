package com.example.demo.service.Impl;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl {


    @Autowired
    AccountRepository accountRepository;

    public List<Account> findAll(){
        return accountRepository.findAll();
    }

    @Autowired
    public Optional findById(String username){
        return accountRepository.findById(username);
    }


}
