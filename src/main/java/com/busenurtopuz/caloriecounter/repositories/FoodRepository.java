package com.busenurtopuz.caloriecounter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.busenurtopuz.caloriecounter.model.Food;


public interface FoodRepository extends JpaRepository<Food,Long> {
    public Iterable<Food> findAllByFoodNameContaining(String filter);
}

