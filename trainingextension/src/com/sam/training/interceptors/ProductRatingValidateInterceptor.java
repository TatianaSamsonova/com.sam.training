package com.sam.training.interceptors;

import com.sam.training.model.TrainingProductModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class ProductRatingValidateInterceptor implements ValidateInterceptor{
    public static final long MAX_RATING = 5L;
    public static final long MIN_RATING = 0L;

    @Override
    public void onValidate(final Object model, final InterceptorContext interceptorContext) throws InterceptorException {
        if (model instanceof TrainingProductModel)
        {
            final TrainingProductModel productModel = (TrainingProductModel) model;
            final Long rating = productModel.getRating();
            if (rating != null)
            {
                if (rating <= MIN_RATING || rating > MAX_RATING)
                {
                    throw new InterceptorException("Product rating must be more than 0 or less than or equal to 5");
                }
            }


        }
    }
}
