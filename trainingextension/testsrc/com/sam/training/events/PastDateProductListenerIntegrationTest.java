package com.sam.training.events;

import com.sam.training.model.TrainingProductModel;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

@IntegrationTest
public class PastDateProductListenerIntegrationTest extends ServicelayerTransactionalTest
{
    @Resource
    private ModelService modelService;
    @Resource
    private EventService eventService;

    @Test
    public void testOnEventSetProductStatusUnapprovedIfOnlineDateIsInPast()//doesn't work
    {
        final TrainingProductModel productModel = modelService.create(TrainingProductModel.class);

        CatalogModel catalogModel = new CatalogModel();
        catalogModel.setId("test_product_catalog_id");
        CatalogVersionModel catalogVersionModel = new CatalogVersionModel();
        catalogVersionModel.setVersion("Online");
        catalogVersionModel.setCatalog(catalogModel);
        productModel.setCatalogVersion(catalogVersionModel);
        productModel.setCode("test_product");
        modelService.save(productModel);

        PastDateProductEvent event = new PastDateProductEvent(productModel);
        eventService.publishEvent(event);

        TrainingProductModel model = modelService.get(productModel);

        Assert.assertEquals(ArticleApprovalStatus.UNAPPROVED, model.getApprovalStatus());
    }
}
