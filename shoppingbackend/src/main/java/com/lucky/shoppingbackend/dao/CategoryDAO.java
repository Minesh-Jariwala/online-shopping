package com.lucky.shoppingbackend.dao;

import java.util.List;

import com.lucky.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
