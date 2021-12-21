package com.busenurtopuz.caloriecounter.controllers;

import com.busenurtopuz.caloriecounter.model.Food;
import com.busenurtopuz.caloriecounter.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/api/food/getAll")
    public Iterable<Food> getAll(@RequestParam String filter) {
        return foodRepository.findAllByFoodNameContaining(filter);
    }

    @PostMapping("api/food/saveFood")
    public Long saveFood(@RequestBody Food food) {
        foodRepository.save(food);

        return 1L;
    }
}
