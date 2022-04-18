package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SuperMarket;

public interface SuperMarketRepo extends JpaRepository<SuperMarket, Integer> {

}
