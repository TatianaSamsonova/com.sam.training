package com.sam.training.attributehandlers;

import com.sam.training.model.RecipeModel;
import de.hybris.bootstrap.annotations.UnitTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

@UnitTest
public class RecipeDaysAfterCreationAttributeHandlerTest
{

    @Test
    public void testGetRecipeDaysAfterCreation()
    {
        final RecipeModel recipeModel = new RecipeModel();
        final RecipeDaysAfterCreationAttributeHandler handler = new RecipeDaysAfterCreationAttributeHandler();
        final Date pastDate = new Date(new Date().getTime() - 49 * 60 * 60 * 1000);
        recipeModel.setCreationtime(pastDate);
        Assert.assertEquals(2L, handler.get(recipeModel).longValue());
    }

    @Test
    public void testGetNullRecipeDaysAfterCreation()
    {
        final RecipeModel recipeModel = new RecipeModel();
        final RecipeDaysAfterCreationAttributeHandler handler = new RecipeDaysAfterCreationAttributeHandler();
        Assert.assertNull(handler.get(recipeModel));
    }

    @Test
    public void testGetFutureRecipeDaysAfterCreation()
    {
        final RecipeModel recipeModel = new RecipeModel();
        final RecipeDaysAfterCreationAttributeHandler handler = new RecipeDaysAfterCreationAttributeHandler();
        final Date futureDate = new Date(new Date().getTime() + 49 * 60 * 60 * 1000);
        recipeModel.setCreationtime(futureDate);
        Assert.assertEquals(0L, handler.get(recipeModel).longValue());
    }
}
