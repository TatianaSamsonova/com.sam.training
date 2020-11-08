package com.sam.training.facades.impl;

import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

@IntegrationTest
public class DefaultRecipeFacadeIntegrationTest extends ServicelayerTransactionalTest
{
    @Resource
    private RecipeService recipeService;
    @Resource
    private ModelService modelService;
    private RecipeModel recipeModel;
    private static final String CODE = "test";

    @Before
    public void setUp(){
        recipeModel = modelService.create(RecipeModel.class);
        recipeModel.setCode(CODE);
    }

    @Test
    public void shouldReturnRecipeWithGivenCode()
    {

    }
}
