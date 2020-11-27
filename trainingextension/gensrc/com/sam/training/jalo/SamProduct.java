/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27 Nov 2020, 9:51:13                        ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type SamProduct.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class SamProduct extends Product
{
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
}
