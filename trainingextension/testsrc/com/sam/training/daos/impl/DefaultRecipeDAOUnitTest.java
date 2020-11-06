package com.sam.training.daos.impl;

import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import de.hybris.bootstrap.annotations.UnitTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

@UnitTest
public class DefaultRecipeDAOUnitTest {
    @InjectMocks
    DefaultRecipeDAO defaultRecipeDAO;

    private static final Complexity COMPLEXITY = Complexity.LOW;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindRecipes()
    {
        final RecipeModel recipe1 = new RecipeModel();
        final RecipeModel recipe2 = new RecipeModel();

        Mockito.when(defaultRecipeDAO.findRecipes()).thenReturn(Arrays.asList(recipe1, recipe2));

        List<RecipeModel> result = defaultRecipeDAO.findRecipes();
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(recipe1, result.get(0));
        Assert.assertEquals(recipe2, result.get(1));

        Mockito.verify(defaultRecipeDAO).findRecipes();
    }

    @Test
    public void testFindRecipesByComplexity()
    {
        final RecipeModel recipe1 = new RecipeModel();
        recipe1.setComplexity(COMPLEXITY);
        final RecipeModel recipe2 = new RecipeModel();
        recipe2.setComplexity(COMPLEXITY);

        Mockito.when(defaultRecipeDAO.findByComplexity(COMPLEXITY)).thenReturn(Arrays.asList(recipe1, recipe2));

        List<RecipeModel> result = defaultRecipeDAO.findByComplexity(COMPLEXITY);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(COMPLEXITY, result.get(0).getComplexity());
        Assert.assertEquals(COMPLEXITY, result.get(1).getComplexity());

        Mockito.verify(defaultRecipeDAO).findByComplexity(COMPLEXITY);
    }
}
