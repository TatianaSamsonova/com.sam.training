/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9 Dec 2020, 7:47:36                         ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.jalo.SamProduct;
import com.sam.training.jalo.TrainingProduct;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type ProductBundle.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class ProductBundle extends Product
{
	/** Qualifier of the <code>ProductBundle.firstProduct</code> attribute **/
	public static final String FIRSTPRODUCT = "firstProduct";
	/** Qualifier of the <code>ProductBundle.secondProduct</code> attribute **/
	public static final String SECONDPRODUCT = "secondProduct";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FIRSTPRODUCT, AttributeMode.INITIAL);
		tmp.put(SECONDPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductBundle.firstProduct</code> attribute.
	 * @return the firstProduct
	 */
	public SamProduct getFirstProduct(final SessionContext ctx)
	{
		return (SamProduct)getProperty( ctx, "firstProduct".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductBundle.firstProduct</code> attribute.
	 * @return the firstProduct
	 */
	public SamProduct getFirstProduct()
	{
		return getFirstProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductBundle.firstProduct</code> attribute. 
	 * @param value the firstProduct
	 */
	public void setFirstProduct(final SessionContext ctx, final SamProduct value)
	{
		setProperty(ctx, "firstProduct".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductBundle.firstProduct</code> attribute. 
	 * @param value the firstProduct
	 */
	public void setFirstProduct(final SamProduct value)
	{
		setFirstProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductBundle.secondProduct</code> attribute.
	 * @return the secondProduct
	 */
	public TrainingProduct getSecondProduct(final SessionContext ctx)
	{
		return (TrainingProduct)getProperty( ctx, "secondProduct".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductBundle.secondProduct</code> attribute.
	 * @return the secondProduct
	 */
	public TrainingProduct getSecondProduct()
	{
		return getSecondProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductBundle.secondProduct</code> attribute. 
	 * @param value the secondProduct
	 */
	public void setSecondProduct(final SessionContext ctx, final TrainingProduct value)
	{
		setProperty(ctx, "secondProduct".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductBundle.secondProduct</code> attribute. 
	 * @param value the secondProduct
	 */
	public void setSecondProduct(final TrainingProduct value)
	{
		setSecondProduct( getSession().getSessionContext(), value );
	}
	
}
