package com.example.repository;

import com.example.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // パスワード項追加に伴う変更 20180429
    @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName, x.passWord")
    List<Customer> findAllOrderByName();

    // パスワード項追加に伴う変更 20180429
    @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName, x.passWord")
    Page<Customer> findAllOrderByName(Pageable pageable);
}

