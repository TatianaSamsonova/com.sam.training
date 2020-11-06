package com.sam.training.service.impl;

import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@IntegrationTest
public class DefaultRecipeServiceIntegrationTest extends ServicelayerTest {
    @Resource
    private RecipeService recipeService;
    @Resource
    private ModelService modelService;
    private RecipeModel recipeModel;
    private static final Complexity RECIPE_COMPLEXITY = Complexity.HIGH;

    @Before
    public void setUp(){
        recipeModel = modelService.create(RecipeModel.class);
        recipeModel.setComplexity(RECIPE_COMPLEXITY);
    }

    @Test
    public void testRecipeService(){
        List<RecipeModel> recipeModels = recipeService.getRecipes();
        final int size = recipeModels.size();
        modelService.save(recipeModel);
        recipeModels = recipeService.getRecipes();

        Assert.assertEquals(size+1, recipeModels.size());

    }

    @Test
    public void shouldReturnRecipeModelWithHighComplexity()
    {
        modelService.save(recipeModel);
        List<RecipeModel> result = recipeService.getRecipesByComplexity(RECIPE_COMPLEXITY);

        Assert.assertEquals(RECIPE_COMPLEXITY, result.get(0).getComplexity());
    }
}
