package com.sam.training.events;

import com.sam.training.model.TrainingProductModel;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Date;

public class PastDateProductListener extends AbstractEventListener<PastDateProductEvent> {
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    protected void onEvent(final PastDateProductEvent pastDateProductEvent) {
        if (pastDateProductEvent != null && pastDateProductEvent.getTrainingProductModel() != null)
        {
            TrainingProductModel product = pastDateProductEvent.getTrainingProductModel();
            if (product.getOnlineDate().before(new Date()))
            {
                product.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
                modelService.save(product);
            }
        }
    }
}
