package com.sam.training.converters;

import com.sam.training.data.RecipeData;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class RecipeConverter  implements Converter<RecipeModel, RecipeData> {


    @Override
    public RecipeData convert(final RecipeModel source) throws ConversionException {
        final RecipeData data = new RecipeData();
        return convert(source, data);
    }

    @Override
    public RecipeData convert(final RecipeModel source, final RecipeData prototype) throws ConversionException {
        prototype.setId(source.getCode());
        prototype.setName(source.getName());
        return prototype;
    }
}
