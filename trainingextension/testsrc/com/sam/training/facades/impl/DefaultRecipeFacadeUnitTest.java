package com.sam.training.facades.impl;

import com.sam.training.service.RecipeService;
import de.hybris.bootstrap.annotations.UnitTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@UnitTest
public class DefaultRecipeFacadeUnitTest
{
    @InjectMocks
    private DefaultRecipeFacade defaultRecipeFacade;
    @Mock
    private RecipeService recipeService;
    private static final String CODE = "test";

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRecipeDetails()
    {

    }

    @Test
    public void testGetAllRecipes()
    {

    }
}
