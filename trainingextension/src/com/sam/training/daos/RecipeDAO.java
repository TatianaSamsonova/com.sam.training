package com.sam.training.daos;

import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;

import java.util.List;

public interface RecipeDAO
{
    List<RecipeModel> findRecipes();
    List<RecipeModel> findByComplexity(Complexity complexity);
}
