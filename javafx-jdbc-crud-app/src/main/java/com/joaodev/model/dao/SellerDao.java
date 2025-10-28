package com.joaodev.model.dao;

import java.util.List;

import com.joaodev.model.entities.Department;
import com.joaodev.model.entities.Seller;



public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
