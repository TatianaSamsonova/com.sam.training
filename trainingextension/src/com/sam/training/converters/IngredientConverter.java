package com.sam.training.converters;

import com.sam.training.data.IngredientData;
import com.sam.training.model.IngredientModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class IngredientConverter implements Converter<IngredientModel, IngredientData> {
    @Override
    public IngredientData convert(final IngredientModel source) throws ConversionException {
        final IngredientData data = new IngredientData();
        return convert(source, data);
    }

    @Override
    public IngredientData convert(final IngredientModel source, final IngredientData prototype) throws ConversionException {
        prototype.setId(source.getCode());
        prototype.setName(source.getName());
        return prototype;
    }
}
