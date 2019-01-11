package com.example.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.Table;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.orm.hibernate5.HibernateOperations;
import org.springframework.stereotype.Repository;

import com.example.entity.Account;
import com.example.entity.FinanceAccount;
import com.example.entity.SubTechAccount;
import com.example.entity.TechAccount;

public interface PersonRepository extends JpaRepository<TechAccount, UUID>{
//	public TechAccount findById(Long id);
    
    public Account save(Account user);
    
//    public List<SubTechAccount> findAccounts();

	
    public List<TechAccount> findAll();
    
    

}
