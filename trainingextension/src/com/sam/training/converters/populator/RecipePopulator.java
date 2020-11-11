package com.sam.training.converters.populator;

import com.sam.training.data.IngredientData;
import com.sam.training.data.RecipeData;
import com.sam.training.model.IngredientModel;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

public class RecipePopulator implements Populator<RecipeModel, RecipeData> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipePopulator.class);

    private Converter<IngredientModel, IngredientData> ingredientsConverter;

    @Override
    public void populate(final RecipeModel source, final RecipeData target) throws ConversionException {
        LOGGER.info("Recipe Data Populator");
        target.setId(source.getCode());
        target.setName(source.getName());
        target.setIngredients(getIngredientsConverter().convertAll(source.getIngredients()));
    }


    @Required
    public void setIngredientsConverter(Converter<IngredientModel, IngredientData> ingredientsConverter) {
        this.ingredientsConverter = ingredientsConverter;
    }

    protected Converter<IngredientModel, IngredientData> getIngredientsConverter()
    {
        return ingredientsConverter;
    }

}
