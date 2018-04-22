package com.example.repository;

import com.example.domain.ProductItem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShopRepository extends JpaRepository<ProductItem, Integer> {
    @Query("SELECT x FROM ProductItem x ORDER BY x.itemName, x.imgPath")
    List<ProductItem> findAllOrderByName();

    @Query("SELECT x FROM ProductItem x ORDER BY x.itemName, x.imgPath")
    Page<ProductItem> findAllOrderByName(Pageable pageable);
}

