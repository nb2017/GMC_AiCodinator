package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.ProductItem;
import com.example.repository.ShopRepository;

@Service
@Transactional
public class ShopService {
    @Autowired
    ShopRepository shopRepository;

    public List<ProductItem> findAll() {
        return shopRepository.findAllOrderByName();
    }

    public Page<ProductItem> findAll(Pageable pageable) {
        return shopRepository.findAllOrderByName(pageable);
    }

    public ProductItem findOne(Integer id) {
        return shopRepository.findOne(id);
    }

    public ProductItem create(ProductItem item) {
        return shopRepository.save(item);
    }

    public ProductItem update(ProductItem item) {
        return shopRepository.save(item);
    }

    public void delete(Integer id) {
    	shopRepository.delete(id);
    }
}
