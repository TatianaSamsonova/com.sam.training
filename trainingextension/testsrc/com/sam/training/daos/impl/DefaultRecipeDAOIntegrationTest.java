package com.sam.training.daos.impl;

import com.sam.training.daos.RecipeDAO;
import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@IntegrationTest
public class DefaultRecipeDAOIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    private RecipeDAO recipeDAO;
    @Resource
    private ModelService modelService;
    private static final Complexity RECIPE_COMPLEXITY = Complexity.HIGH;

    @Test
    public void recipeDAOTest(){

        List<RecipeModel> allRecipes = recipeDAO.findRecipes();
        final int size = allRecipes.size();

        final RecipeModel recipeModel = modelService.create(RecipeModel.class);
        recipeModel.setComplexity(RECIPE_COMPLEXITY);
        modelService.save(recipeModel);

        allRecipes = recipeDAO.findRecipes();
        Assert.assertEquals(size+1, allRecipes.size());
        Assert.assertTrue("recipe not found", allRecipes.contains(recipeModel));

        List<RecipeModel> recipesByComplexity = recipeDAO.findByComplexity(RECIPE_COMPLEXITY);
        recipesByComplexity
                .forEach(recipeModel1 ->  Assert.assertEquals("Retrieved Recipe's complexity attribute is incorrect",
                        RECIPE_COMPLEXITY,
                        recipeModel1.getComplexity()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRecipes_NullParam(){
        recipeDAO.findByComplexity(null);
    }

}
