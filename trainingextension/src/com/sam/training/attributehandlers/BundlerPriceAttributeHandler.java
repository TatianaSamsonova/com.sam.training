package com.sam.training.attributehandlers;

import com.sam.training.model.ProductBundleModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Component;

@Component
public class BundlerPriceAttributeHandler extends AbstractDynamicAttributeHandler<Double, ProductBundleModel> {
    @Override
    public Double get(final ProductBundleModel model) {
        final Double firstProductPrice = model.getFirstProduct().getPrice();
        final Double secondProductPrice = model.getSecondProduct().getPrice();
        return firstProductPrice + secondProductPrice;
    }
}
