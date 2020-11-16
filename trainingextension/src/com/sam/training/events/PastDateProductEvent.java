package com.sam.training.events;

import com.sam.training.model.TrainingProductModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class PastDateProductEvent extends AbstractEvent
{
    private TrainingProductModel trainingProductModel;

    public PastDateProductEvent(final TrainingProductModel trainingProductModel) {
        super();
        this.trainingProductModel = trainingProductModel;
    }

    public TrainingProductModel getTrainingProductModel() {
        return trainingProductModel;
    }
}
