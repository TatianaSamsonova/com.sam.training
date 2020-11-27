/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27 Nov 2020, 9:51:13                        ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.constants.TrainingextensionConstants;
import com.sam.training.jalo.Author;
import com.sam.training.jalo.Book;
import com.sam.training.jalo.Ingredient;
import com.sam.training.jalo.LoyaltyCard;
import com.sam.training.jalo.News;
import com.sam.training.jalo.ProductBundle;
import com.sam.training.jalo.Recipe;
import com.sam.training.jalo.SamProduct;
import com.sam.training.jalo.Supplier;
import com.sam.training.jalo.TrainingProduct;
import com.sam.training.jalo.TrainingUser;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingextensionManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class TrainingextensionManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("loyaltyCard", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.User", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("price", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Author createAuthor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Author");
			return (Author)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Author : "+e.getMessage(), 0 );
		}
	}
	
	public Author createAuthor(final Map attributeValues)
	{
		return createAuthor( getSession().getSessionContext(), attributeValues );
	}
	
	public Book createBook(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Book");
			return (Book)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Book : "+e.getMessage(), 0 );
		}
	}
	
	public Book createBook(final Map attributeValues)
	{
		return createBook( getSession().getSessionContext(), attributeValues );
	}
	
	public Ingredient createIngredient(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Ingredient");
			return (Ingredient)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ingredient : "+e.getMessage(), 0 );
		}
	}
	
	public Ingredient createIngredient(final Map attributeValues)
	{
		return createIngredient( getSession().getSessionContext(), attributeValues );
	}
	
	public LoyaltyCard createLoyaltyCard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("LoyaltyCard");
			return (LoyaltyCard)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LoyaltyCard : "+e.getMessage(), 0 );
		}
	}
	
	public LoyaltyCard createLoyaltyCard(final Map attributeValues)
	{
		return createLoyaltyCard( getSession().getSessionContext(), attributeValues );
	}
	
	public News createNews(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("News");
			return (News)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating News : "+e.getMessage(), 0 );
		}
	}
	
	public News createNews(final Map attributeValues)
	{
		return createNews( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductBundle createProductBundle(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("ProductBundle");
			return (ProductBundle)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductBundle : "+e.getMessage(), 0 );
		}
	}
	
	public ProductBundle createProductBundle(final Map attributeValues)
	{
		return createProductBundle( getSession().getSessionContext(), attributeValues );
	}
	
	public Recipe createRecipe(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Recipe");
			return (Recipe)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Recipe : "+e.getMessage(), 0 );
		}
	}
	
	public Recipe createRecipe(final Map attributeValues)
	{
		return createRecipe( getSession().getSessionContext(), attributeValues );
	}
	
	public SamProduct createSamProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("SamProduct");
			return (SamProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SamProduct : "+e.getMessage(), 0 );
		}
	}
	
	public SamProduct createSamProduct(final Map attributeValues)
	{
		return createSamProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Supplier createSupplier(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Supplier");
			return (Supplier)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Supplier : "+e.getMessage(), 0 );
		}
	}
	
	public Supplier createSupplier(final Map attributeValues)
	{
		return createSupplier( getSession().getSessionContext(), attributeValues );
	}
	
	public TrainingProduct createTrainingProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("TrainingProduct");
			return (TrainingProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TrainingProduct : "+e.getMessage(), 0 );
		}
	}
	
	public TrainingProduct createTrainingProduct(final Map attributeValues)
	{
		return createTrainingProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public TrainingUser createTrainingUser(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("TrainingUser");
			return (TrainingUser)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TrainingUser : "+e.getMessage(), 0 );
		}
	}
	
	public TrainingUser createTrainingUser(final Map attributeValues)
	{
		return createTrainingUser( getSession().getSessionContext(), attributeValues );
	}
	
	public static final TrainingextensionManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingextensionManager) em.getExtension(TrainingextensionConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return TrainingextensionConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.loyaltyCard</code> attribute.
	 * @return the loyaltyCard - LoyaltyCard
	 */
	public LoyaltyCard getLoyaltyCard(final SessionContext ctx, final User item)
	{
		return (LoyaltyCard)item.getProperty( ctx, TrainingextensionConstants.Attributes.User.LOYALTYCARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.loyaltyCard</code> attribute.
	 * @return the loyaltyCard - LoyaltyCard
	 */
	public LoyaltyCard getLoyaltyCard(final User item)
	{
		return getLoyaltyCard( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.loyaltyCard</code> attribute. 
	 * @param value the loyaltyCard - LoyaltyCard
	 */
	public void setLoyaltyCard(final SessionContext ctx, final User item, final LoyaltyCard value)
	{
		item.setProperty(ctx, TrainingextensionConstants.Attributes.User.LOYALTYCARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.loyaltyCard</code> attribute. 
	 * @param value the loyaltyCard - LoyaltyCard
	 */
	public void setLoyaltyCard(final User item, final LoyaltyCard value)
	{
		setLoyaltyCard( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, TrainingextensionConstants.Attributes.Product.PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice(final Product item)
	{
		return getPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive(final Product item)
	{
		return getPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, TrainingextensionConstants.Attributes.Product.PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final Product item, final Double value)
	{
		setPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final Product item, final double value)
	{
		setPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final Product item, final double value)
	{
		setPrice( getSession().getSessionContext(), item, value );
	}
	
}
