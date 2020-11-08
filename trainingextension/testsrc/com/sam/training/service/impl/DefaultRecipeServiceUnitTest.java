package com.sam.training.service.impl;

import com.sam.training.daos.RecipeDAO;
import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import de.hybris.bootstrap.annotations.UnitTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

@UnitTest
public class DefaultRecipeServiceUnitTest
{
    @InjectMocks
    private DefaultRecipeService defaultRecipeService;
    @Mock
    private RecipeDAO recipeDAO;
    private static final Complexity COMPLEXITY = Complexity.HIGH;
    private static final String CODE = "test";

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRecipes()
    {
        final RecipeModel recipe1 = new RecipeModel();
        final RecipeModel recipe2 = new RecipeModel();
        final RecipeModel recipe3 = new RecipeModel();
        final RecipeModel recipe4 = new RecipeModel();

        Mockito.when(recipeDAO.findRecipes()).thenReturn(Arrays.asList(recipe1, recipe2, recipe3, recipe4));

        List<RecipeModel> result = defaultRecipeService.getRecipes();
        Assert.assertEquals(4, result.size());
        Assert.assertEquals(recipe1, result.get(0));
        Assert.assertEquals(recipe2, result.get(1));
        Assert.assertEquals(recipe3, result.get(2));
        Assert.assertEquals(recipe4, result.get(3));

        Mockito.verify(recipeDAO).findRecipes();
    }

    @Test
    public void testGetRecipesByComplexity()
    {
        final RecipeModel recipe1 = new RecipeModel();
        recipe1.setComplexity(COMPLEXITY);
        final RecipeModel recipe2 = new RecipeModel();
        recipe2.setComplexity(COMPLEXITY);

        Mockito.when(recipeDAO.findByComplexity(COMPLEXITY)).thenReturn(Arrays.asList(recipe1, recipe2));

        List<RecipeModel> result = defaultRecipeService.getRecipesByComplexity(COMPLEXITY);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(COMPLEXITY, result.get(0).getComplexity());
        Assert.assertEquals(COMPLEXITY, result.get(1).getComplexity());

        Mockito.verify(recipeDAO).findByComplexity(COMPLEXITY);
    }

    @Test
    public void testGetRecipeByCode()
    {
        final RecipeModel recipe1 = new RecipeModel();
        recipe1.setCode(CODE);

        Mockito.when(recipeDAO.findByCode(CODE)).thenReturn(recipe1);

        RecipeModel result = defaultRecipeService.getRecipeByCode(CODE);
        Assert.assertEquals(CODE, result.getCode());

        Mockito.verify(recipeDAO).findByCode(CODE);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetRecipeByComplexity_NullParam()
    {
        Mockito.when(recipeDAO.findByComplexity(null)).thenThrow(new IllegalArgumentException());
        defaultRecipeService.getRecipesByComplexity(null);
    }

}
