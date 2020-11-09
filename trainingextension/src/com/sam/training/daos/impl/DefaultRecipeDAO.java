package com.sam.training.daos.impl;

import com.sam.training.daos.RecipeDAO;
import com.sam.training.enums.Complexity;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "recipeDAO")
public class DefaultRecipeDAO implements RecipeDAO {

    @Autowired
    private FlexibleSearchService flexibleSearchService;


    @Override
    public List<RecipeModel> findRecipes() {
        final String queryString = "SELECT {p:" + RecipeModel.PK + "} " + "FROM {" + RecipeModel._TYPECODE + " AS p} ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        return flexibleSearchService.<RecipeModel> search(query).getResult();
    }

    @Override
    public List<RecipeModel> findByComplexity(Complexity complexity) {
        final String queryString = "SELECT {p:" + RecipeModel.PK + "} "
                                    + "FROM {" + RecipeModel._TYPECODE + " AS p} "
                                    + "WHERE " + "{p:" + RecipeModel.COMPLEXITY + "}=?complexity ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("complexity", complexity);

        return flexibleSearchService.<RecipeModel> search(query).getResult();
    }

    @Override
    public RecipeModel findByCode(String code) {
        final String queryString = "SELECT {p:" + RecipeModel.PK + "} "
                + "FROM {" + RecipeModel._TYPECODE + " AS p} "
                + "WHERE " + "{p:" + RecipeModel.CODE + "}=?code ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("code", code);

        return flexibleSearchService.<RecipeModel> search(query).getResult().get(0);

    }

}
