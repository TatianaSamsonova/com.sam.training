package com.sam.training.attributehandlers;

import com.sam.training.model.RecipeModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class RecipeDaysAfterCreationAttributeHandler extends AbstractDynamicAttributeHandler<Long, RecipeModel>
{
    @Override
    public Long get(final RecipeModel model) {
        if (model.getCreationtime() == null)
        {
            return null;
        }
        final ZonedDateTime recipeCreationDate = model.getCreationtime().toInstant().atZone(ZoneId.systemDefault());
        final ZonedDateTime now = ZonedDateTime.now();
        if (recipeCreationDate.isAfter(now))
        {
            return Long.valueOf(0L);
        }
        final Duration duration = Duration.between(recipeCreationDate, now);

        return Long.valueOf(duration.toDays());
    }
}
