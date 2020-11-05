package com.sam.training.service;

import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;

import java.util.List;

public interface RecipeService {
    List<RecipeModel> getRecipes();
    List<RecipeModel> getRecipesByComplexity(Complexity complexity);
}
