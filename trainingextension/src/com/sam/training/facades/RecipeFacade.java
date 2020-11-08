package com.sam.training.facades;

import com.sam.training.data.RecipeData;
import com.sam.training.data.RecipeSummaryData;

import java.util.List;

public interface RecipeFacade
{
    RecipeSummaryData getRecipeDetails(final String recipeCode);
    List<RecipeData> getAllRecipes();
}
