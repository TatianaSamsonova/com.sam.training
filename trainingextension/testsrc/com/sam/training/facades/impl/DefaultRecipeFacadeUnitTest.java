package com.sam.training.facades.impl;

import com.sam.training.data.RecipeData;
import com.sam.training.data.RecipeSummaryData;
import com.sam.training.enums.Complexity;
import com.sam.training.model.IngredientModel;
import com.sam.training.model.RecipeModel;
import com.sam.training.service.RecipeService;
import de.hybris.bootstrap.annotations.UnitTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@UnitTest
public class DefaultRecipeFacadeUnitTest
{
    @InjectMocks
    private DefaultRecipeFacade defaultRecipeFacade;
    @Mock
    private RecipeService recipeService;
    private static final String RECIPE_CODE = "test";
    private static final String RECIPE_NAME = "name";
    private static final Complexity RECIPE_COMPLEXITY = Complexity.HIGH;
    private static final RecipeModel RECIPE_MODEL = new RecipeModel();
    private static final List<RecipeModel> RECIPE_MODEL_LIST = new ArrayList<>();

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);

        RECIPE_MODEL.setName(RECIPE_NAME);
        RECIPE_MODEL.setCode(RECIPE_CODE);
        RECIPE_MODEL.setComplexity(RECIPE_COMPLEXITY);
        RECIPE_MODEL.setCreationtime(new Date());

        RECIPE_MODEL_LIST.add(RECIPE_MODEL);
    }

    @Test
    public void testGetRecipeDetails()//doesn't work
    {
        Mockito.when(recipeService.getRecipeByCode(RECIPE_CODE)).thenReturn(RECIPE_MODEL);

        final RecipeSummaryData recipeDto = defaultRecipeFacade.getRecipeDetails(RECIPE_CODE);
        Assert.assertNotNull(recipeDto);
        Assert.assertEquals(RECIPE_MODEL.getName(), recipeDto.getName());
        Assert.assertEquals(RECIPE_MODEL.getCreationtime(), recipeDto.getDateOfCreation());
        Assert.assertEquals(RECIPE_MODEL.getComplexity().getCode(), recipeDto.getComplexity());
        Assert.assertEquals(RECIPE_MODEL.getCode(),recipeDto.getId());
    }

    @Test
    public void testGetAllRecipes()//doesnt work
    {
        Mockito.when(recipeService.getRecipes()).thenReturn(RECIPE_MODEL_LIST);

        final List<RecipeData> dto = defaultRecipeFacade.getAllRecipes();
        Assert.assertNotNull(dto);
        Assert.assertEquals(RECIPE_MODEL_LIST.size(), dto.size());
        Assert.assertEquals(RECIPE_MODEL.getCode(), dto.get(0).getId());
        Assert.assertEquals(RECIPE_MODEL.getName(), dto.get(0).getName());
    }
}
