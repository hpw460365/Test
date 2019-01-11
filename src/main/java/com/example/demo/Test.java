package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PersonRepository;
import com.example.entity.Account;
import com.example.entity.FinanceAccount;
import com.example.entity.SubTechAccount;
import com.example.entity.TechAccount;

@RestController("/hello")
public class Test{
	
	@Autowired
	private PersonRepository personRepo;

    @GetMapping
    public List<Map<String, Object>> queryUser() {
        List<Map<String, Object>> queryForList = new ArrayList<Map<String,Object>>();

//       SubTechAccount sub = new SubTechAccount();
//       sub.setAccountNo((long) 1);
//       personRepo.save(sub);
//       
//       TechAccount tech = new TechAccount();
//       tech.setAccountNo((long) 2);
//       personRepo.save(tech);
//       
//       FinanceAccount finance = new FinanceAccount();
//       finance.setAccountNo((long) 3);
//       personRepo.save(finance);
       
        List<TechAccount> findAccounts = personRepo.findAll();
        System.out.println(findAccounts.size());
       
        return queryForList;
    }
	
}
