package com.sam.training.converters.populator;

import com.sam.training.data.RecipeSummaryData;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecipeDetailsPopulator implements Populator<RecipeModel, RecipeSummaryData> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeDetailsPopulator.class);

    @Override
    public void populate(final RecipeModel source, final RecipeSummaryData target) throws ConversionException {
        LOGGER.info("Recipe Details Data Populator");
        target.setId(source.getCode());
        target.setName(source.getName());
        target.setDateOfCreation(source.getCreationtime());
        target.setComplexity(source.getComplexity().getCode());
        target.setNumberOfIngredients(String.valueOf(source.getIngredients().size()));
        target.setLifeSpan(source.getDaysAfterCreation());
    }
}
