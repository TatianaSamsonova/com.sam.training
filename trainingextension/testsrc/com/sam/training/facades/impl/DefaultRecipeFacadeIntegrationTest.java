package com.sam.training.facades.impl;

import com.sam.training.data.RecipeData;
import com.sam.training.data.RecipeSummaryData;
import com.sam.training.facades.RecipeFacade;
import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@IntegrationTest
public class DefaultRecipeFacadeIntegrationTest extends ServicelayerTransactionalTest {
    @Resource
    private RecipeFacade recipeFacade;
    @Resource
    private ModelService modelService;
    private RecipeModel recipeModel;
    private static final String RECIPE_CODE = "test";
    private static final String RECIPE_CODE_DOESNT_EXIST = "fail";
    private static final String RECIPE_NAME = "name";

    @Before
    public void setUp() {
        recipeModel = modelService.create(RecipeModel.class);
        recipeModel.setCode(RECIPE_CODE);
        recipeModel.setName(RECIPE_NAME);
    }

    @Test
    public void testInvalidParameter() {

        try{
            recipeFacade.getRecipeDetails(RECIPE_CODE_DOESNT_EXIST);
            Assert.fail();
        } catch (Exception ignored){

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullParameter() {
        recipeFacade.getRecipeDetails(null);
    }

    @Test
    public void shouldReturnRecipe() {
        modelService.save(recipeModel);
        final RecipeSummaryData recipeSummaryData = recipeFacade.getRecipeDetails(RECIPE_CODE);
        Assert.assertNotNull(recipeSummaryData);
        Assert.assertEquals(RECIPE_NAME, recipeSummaryData.getName());
        Assert.assertEquals(recipeModel.getCode(), recipeSummaryData.getId());
        Assert.assertEquals(recipeModel.getComplexity().getCode(), recipeSummaryData.getComplexity());
        Assert.assertEquals(recipeModel.getCreationtime(), recipeSummaryData.getDateOfCreation());
        Assert.assertEquals(Integer.toString(recipeModel.getIngredients().size()), recipeSummaryData.getNumberOfIngredients());
    }

    @Test
    public void shouldReturnAllRecipes()
    {
        List<RecipeData> allRecipes = recipeFacade.getAllRecipes();
        Assert.assertNotNull(allRecipes);
        final int size = allRecipes.size();

        modelService.save(recipeModel);
        allRecipes = recipeFacade.getAllRecipes();
        Assert.assertNotNull(allRecipes);
        Assert.assertEquals(size + 1, allRecipes.size());
        Assert.assertEquals(RECIPE_NAME, allRecipes.get(size).getName());
    }
}
