package com.sam.training.facades.impl;

import com.sam.training.converters.IngredientConverter;
import com.sam.training.converters.RecipeConverter;
import com.sam.training.converters.RecipeDetailsConverter;
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
import java.util.Objects;
import java.util.stream.Collectors;

public class DefaultRecipeFacade implements RecipeFacade {
    private RecipeService recipeService;
    private RecipeConverter recipeConverter;
    private RecipeDetailsConverter recipeDetailsConverter;
    private IngredientConverter ingredientConverter;

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

        return recipeDetailsConverter.convert(recipeModel);
    }

    @Override
    public List<RecipeData> getAllRecipes()
    {
        final List<RecipeModel> recipeModels = recipeService.getRecipes();
        final List<RecipeData> recipeDataList = new ArrayList<>();

        for (final RecipeModel model: recipeModels)
        {
            final RecipeData recipeData = recipeConverter.convert(model);

            final List<IngredientModel> ingredientModels = (List<IngredientModel>) model.getIngredients();
            final List<IngredientData> ingredientDataList = ingredientModels
                    .stream()
                    .map(ingredientConverter::convert)
                    .collect(Collectors.toList());

            Objects.requireNonNull(recipeData).setIngredients(ingredientDataList);
            recipeDataList.add(recipeData);
        }

        return recipeDataList;
    }

    @Required
    public void setRecipeService(final RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }

    @Required
    public void setRecipeConverter(final RecipeConverter recipeConverter) {
        this.recipeConverter = recipeConverter;
    }

    @Required
    public void setIngredientConverter(final IngredientConverter ingredientConverter) {
        this.ingredientConverter = ingredientConverter;
    }

    @Required
    public void setRecipeDetailsConverter(final RecipeDetailsConverter recipeDetailsConverter) {
        this.recipeDetailsConverter = recipeDetailsConverter;
    }
}
