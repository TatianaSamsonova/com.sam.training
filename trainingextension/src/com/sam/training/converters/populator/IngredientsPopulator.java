package com.sam.training.converters.populator;

import com.sam.training.data.IngredientData;
import com.sam.training.model.IngredientModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngredientsPopulator implements Populator<IngredientModel, IngredientData> {

    private static final Logger LOGGER = LoggerFactory.getLogger(IngredientsPopulator.class);

    @Override
    public void populate(final IngredientModel source, final IngredientData target) throws ConversionException {
        LOGGER.info("Ingredient Data Populator");
        target.setId(source.getCode());
        target.setName(source.getName());
    }
}
