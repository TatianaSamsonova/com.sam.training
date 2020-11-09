package com.sam.training.daos.impl;

import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
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
public class DefaultRecipeDAOUnitTest {
    @InjectMocks
    private DefaultRecipeDAO defaultRecipeDAO;
    @Mock
    private FlexibleSearchService flexibleSearchService;
    @Mock
    private RecipeModel recipeModel;

    private static final Complexity COMPLEXITY = Complexity.LOW;
    private static final String RECIPE_CODE = "test";

    @Before
    public void setUp()
    {

        MockitoAnnotations.initMocks(this);
        recipeModel.setCode(RECIPE_CODE);
    }

    @Test
    public void testFindRecipes()//doesn't work
    {
        final RecipeModel recipe1 = new RecipeModel();
        final RecipeModel recipe2 = new RecipeModel();

        final String queryString = "SELECT {p:" + RecipeModel.PK + "} " + "FROM {" + RecipeModel._TYPECODE + " AS p} ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        Mockito.when(flexibleSearchService.<RecipeModel> search(query).getResult()).thenReturn(Arrays.asList(recipe1, recipe2));

        List<RecipeModel> result = defaultRecipeDAO.findRecipes();
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(recipe1, result.get(0));
        Assert.assertEquals(recipe2, result.get(1));

        Mockito.verify(defaultRecipeDAO).findRecipes();
    }

    @Test
    public void testFindRecipesByComplexity()//doesn't work
    {
        final RecipeModel recipe1 = new RecipeModel();
        recipe1.setComplexity(COMPLEXITY);
        final RecipeModel recipe2 = new RecipeModel();
        recipe2.setComplexity(COMPLEXITY);

        final String queryString = "SELECT {p:" + RecipeModel.PK + "} "
                + "FROM {" + RecipeModel._TYPECODE + " AS p} "
                + "WHERE " + "{p:" + RecipeModel.COMPLEXITY + "}=?complexity ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("complexity", COMPLEXITY);

        Mockito.when(flexibleSearchService.<RecipeModel> search(query).getResult()).thenReturn(Arrays.asList(recipe1, recipe2));

        List<RecipeModel> result = defaultRecipeDAO.findByComplexity(COMPLEXITY);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(COMPLEXITY, result.get(0).getComplexity());
        Assert.assertEquals(COMPLEXITY, result.get(1).getComplexity());

        Mockito.verify(defaultRecipeDAO).findByComplexity(COMPLEXITY);
    }

    @Test
    public void testFindRecipeByCode()//doesn't work
    {
        Mockito.when(defaultRecipeDAO.findByCode(RECIPE_CODE)).thenReturn(recipeModel);

        RecipeModel result = defaultRecipeDAO.findByCode(RECIPE_CODE);
        Assert.assertNotNull(result);
        Assert.assertEquals(recipeModel.getCode(), result.getCode());

        Mockito.verify(defaultRecipeDAO).findByCode(RECIPE_CODE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRecipeByComplexity_NullParam()
    {
        Mockito.when(defaultRecipeDAO.findByComplexity(null)).thenThrow(new IllegalArgumentException());
        defaultRecipeDAO.findByComplexity(null);
    }
}
