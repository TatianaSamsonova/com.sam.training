package com.sam.training.service.impl;

import com.sam.training.daos.RecipeDAO;
import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultRecipeService implements RecipeService {

    private RecipeDAO recipeDAO;

    @Override
    public List<RecipeModel> getRecipes() {
        return recipeDAO.findRecipes();
    }

    @Override
    public List<RecipeModel> getRecipesByComplexity(Complexity complexity) {
        return recipeDAO.findByComplexity(complexity);
    }

    @Override
    public RecipeModel getRecipeByCode(String code) {
        return recipeDAO.findByCode(code);
    }

    @Required
    public void setRecipeDAO(final RecipeDAO recipeDAO){
        this.recipeDAO = recipeDAO;
    }
}
