package com.sam.training.controller;

import com.sam.training.data.RecipeData;
import com.sam.training.data.RecipeSummaryData;
import com.sam.training.facades.RecipeFacade;
import de.hybris.platform.catalog.CatalogVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller
public class RecipeController
{
    private static final String CATALOG_ID = "trainingextensionProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";
    private CatalogVersionService catalogVersionService;
    private RecipeFacade recipeFacade;

    @RequestMapping(value = "/recipes")
    public String showRecipes(final Model model)
    {
        final List<RecipeData> recipes = recipeFacade.getAllRecipes();
        model.addAttribute("recipes", recipes);
        return "RecipeList";
    }

    @RequestMapping(value = "/recipes/{recipeId}")
    public String showRecipeDetails(@PathVariable final String recipeId, final Model model) throws UnsupportedEncodingException {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        final String decodedRecipeId = URLDecoder.decode(recipeId, "UTF-8");
        final RecipeSummaryData recipeSummaryData = recipeFacade.getRecipeDetails(recipeId);
        model.addAttribute("recipe", recipeSummaryData);
        return "RecipeDetails";
    }

    @Autowired
    public void setCatalogVersionService(final CatalogVersionService catalogVersionService)
    {
        this.catalogVersionService = catalogVersionService;
    }
    @Autowired
    public void setRecipeFacade(final RecipeFacade recipeFacade)
    {
        this.recipeFacade = recipeFacade;
    }
}
