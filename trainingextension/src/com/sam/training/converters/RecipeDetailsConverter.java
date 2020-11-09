package com.sam.training.converters;

import com.sam.training.data.RecipeSummaryData;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class RecipeDetailsConverter implements Converter<RecipeModel, RecipeSummaryData> {
    @Override
    public RecipeSummaryData convert(final RecipeModel source) throws ConversionException {
        final RecipeSummaryData data = new RecipeSummaryData();
        return convert(source, data);
    }

    @Override
    public RecipeSummaryData convert(final RecipeModel source, final RecipeSummaryData prototype) throws ConversionException {
        prototype.setId(source.getCode());
        prototype.setName(source.getName());
        prototype.setNumberOfIngredients(Integer.toString(source.getIngredients().size()));
        prototype.setComplexity(source.getComplexity().getCode());
        prototype.setDateOfCreation(source.getCreationtime());
        return prototype;
    }
}
