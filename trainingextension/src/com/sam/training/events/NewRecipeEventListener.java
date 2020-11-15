package com.sam.training.events;

import com.sam.training.model.NewsModel;
import com.sam.training.model.RecipeModel;
import de.hybris.platform.servicelayer.event.events.AfterItemCreationEvent;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Date;

public class NewRecipeEventListener extends AbstractEventListener<AfterItemCreationEvent>
{
    private static final String NEW_RECIPE_HEADLINE = "New recipe, %s";
    private static final String NEW_RECIPE_CONTENT = "There is a new recipe called, %s";
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    protected void onEvent(final AfterItemCreationEvent event) {
        if (event != null && event.getSource() != null)
        {
            final Object object = modelService.get(event.getSource());
            if (object instanceof RecipeModel)
            {
                final RecipeModel recipe = (RecipeModel) object;
                final String headline = String.format(NEW_RECIPE_HEADLINE, recipe.getName());
                final String content = String.format(NEW_RECIPE_CONTENT, recipe.getName());
                final NewsModel news = modelService.create(NewsModel.class);
                news.setDate(new Date());
                news.setHeadline(headline);
                news.setContent(content);
                modelService.save(news);
            }
        }
    }
}
