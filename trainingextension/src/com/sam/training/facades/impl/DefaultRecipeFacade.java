package com.sam.training.facades.impl;

import com.sam.training.data.IngredientData;
import com.sam.training.data.RecipeData;
import com.sam.training.data.RecipeSummaryData;
import com.sam.training.facades.RecipeFacade;
import com.sam.training.model.IngredientModel;
import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;

public class DefaultRecipeFacade implements RecipeFacade {
    private RecipeService recipeService;

    @Override
    public RecipeSummaryData getRecipeDetails(String recipeCode) {

        if (recipeCode == null)
        {
            throw new IllegalArgumentException("RecipeCode cannot be null");
        }

        final RecipeModel recipeModel = recipeService.getRecipeByCode(recipeCode);
        if (recipeModel == null)
        {
            return null;
        }

        RecipeSummaryData recipeSummaryData = new RecipeSummaryData();
        recipeSummaryData.setId(recipeModel.getPk().toString());
        recipeSummaryData.setComplexity(recipeModel.getComplexity().getCode());
        recipeSummaryData.setDateOfCreation(recipeModel.getCreationtime());
        recipeSummaryData.setName(recipeModel.getName());
        recipeSummaryData.setNumberOfIngredients(Integer.toString(recipeModel.getIngredients().size()));

        return recipeSummaryData;
    }

    @Override
    public List<RecipeData> getAllRecipes()
    {
        final List<RecipeModel> recipeModels = recipeService.getRecipes();
        final List<RecipeData> recipeDataList = new ArrayList<>();

        for (final RecipeModel model: recipeModels)
        {
            final RecipeData recipeData = new RecipeData();
            recipeData.setId(model.getPk().toString());
            recipeData.setName(model.getName());

            final List<IngredientModel> ingredientModels = (List<IngredientModel>) model.getIngredients();
            final List<IngredientData> ingredientDataList = new ArrayList<>();

            for (IngredientModel ingredientModel:ingredientModels) {
                IngredientData ingredientData = new IngredientData();
                ingredientData.setId(ingredientModel.getPk().toString());
                ingredientData.setName(ingredientModel.getName());
                ingredientDataList.add(ingredientData);
            }

            recipeData.setIngredients(ingredientDataList);
            recipeDataList.add(recipeData);
        }

        return recipeDataList;
    }

    @Required
    public void setRecipeService(final RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }
}
