/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9 Dec 2020, 7:47:36                         ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.jalo.Supplier;
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
	/** Qualifier of the <code>TrainingProduct.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingProduct.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, "supplier".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingProduct.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingProduct.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, "supplier".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingProduct.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
