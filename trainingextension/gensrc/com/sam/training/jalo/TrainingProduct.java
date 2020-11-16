/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16 Nov 2020, 15:34:26                       ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type TrainingProduct.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class TrainingProduct extends Product
{
	/** Qualifier of the <code>TrainingProduct.rating</code> attribute **/
	public static final String RATING = "rating";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RATING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingProduct.rating</code> attribute.
	 * @return the rating
	 */
	public Long getRating(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "rating".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingProduct.rating</code> attribute.
	 * @return the rating
	 */
	public Long getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingProduct.rating</code> attribute. 
	 * @return the rating
	 */
	public long getRatingAsPrimitive(final SessionContext ctx)
	{
		Long value = getRating( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingProduct.rating</code> attribute. 
	 * @return the rating
	 */
	public long getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingProduct.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "rating".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingProduct.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final Long value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingProduct.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final long value)
	{
		setRating( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingProduct.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final long value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
}
