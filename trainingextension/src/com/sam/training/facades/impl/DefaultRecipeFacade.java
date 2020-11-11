package com.sam.training.facades.impl;

import com.sam.training.data.RecipeData;
import com.sam.training.data.RecipeSummaryData;
import com.sam.training.facades.RecipeFacade;
import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultRecipeFacade implements RecipeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultRecipeFacade.class);

    private RecipeService recipeService;
    private Converter<RecipeModel, RecipeData> recipeConverter;
    private Converter<RecipeModel, RecipeSummaryData> recipeDetailsConverter;

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

        return getRecipeDetailsConverter().convert(recipeModel);
    }

    @Override
    public List<RecipeData> getAllRecipes()
    {
        final List<RecipeModel> recipeModels = recipeService.getRecipes();
        return getRecipeConverter().convertAll(recipeModels);
    }
    @Required
    public void setRecipeService(final RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }
    @Required
    public void setRecipeConverter(final Converter<RecipeModel, RecipeData> recipeConverter) {
        this.recipeConverter = recipeConverter;
    }

    protected Converter<RecipeModel, RecipeData> getRecipeConverter()
    {
        return recipeConverter;
    }

    @Required
    public void setRecipeDetailsConverter(final Converter<RecipeModel, RecipeSummaryData> recipeDetailsConverter) {
        this.recipeDetailsConverter = recipeDetailsConverter;
    }

    protected Converter<RecipeModel, RecipeSummaryData> getRecipeDetailsConverter()
    {
        return recipeDetailsConverter;
    }

}
