package com.sam.training.converters.populator;

import com.sam.training.data.RecipeData;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecipePopulator implements Populator<RecipeModel, RecipeData> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipePopulator.class);

    @Override
    public void populate(final RecipeModel source, final RecipeData target) throws ConversionException {
        LOGGER.info("Recipe Data Populator");
        target.setId(source.getCode());
        target.setName(source.getName());
        //target.setIngredients((List<IngredientData>) source.getIngredients());
    }

}
