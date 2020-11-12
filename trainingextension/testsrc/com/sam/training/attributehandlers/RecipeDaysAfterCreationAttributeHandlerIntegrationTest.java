package com.sam.training.attributehandlers;

import com.sam.training.model.RecipeModel;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

@IntegrationTest
public class RecipeDaysAfterCreationAttributeHandlerIntegrationTest  extends ServicelayerTransactionalTest
{
    @Resource
    private ModelService modelService;

    @Test
    public void testGetRecipeDaysAfterCreation()
    {
        final RecipeModel recipeModel = modelService.create(RecipeModel.class);
        final Date pastDate = new Date(new Date().getTime() - 49 * 60 * 60 * 1000);
        recipeModel.setCreationtime(pastDate);
        Assert.assertEquals(2L, recipeModel.getDaysAfterCreation().longValue());
    }

    @Test
    public void testGetNullRecipeDaysAfterCreation()
    {
        final RecipeModel recipeModel = modelService.create(RecipeModel.class);
        Assert.assertNull(recipeModel.getDaysAfterCreation());
    }

    @Test
    public void testGetFutureRecipeDaysAfterCreation()
    {
        final RecipeModel recipeModel = modelService.create(RecipeModel.class);
        final Date futureDate = new Date(new Date().getTime() + 49 * 60 * 60 * 1000);
        recipeModel.setCreationtime(futureDate);
        Assert.assertEquals(0L, recipeModel.getDaysAfterCreation().longValue());
    }
}
