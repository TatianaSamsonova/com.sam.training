/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5 Nov 2020, 17:29:01                        ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.constants.TrainingextensionConstants;
import com.sam.training.jalo.Ingredient;
import com.sam.training.jalo.TrainingUser;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Recipe.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Recipe extends GenericItem
{
	/** Qualifier of the <code>Recipe.complexity</code> attribute **/
	public static final String COMPLEXITY = "complexity";
	/** Qualifier of the <code>Recipe.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>Recipe.ingredients</code> attribute **/
	public static final String INGREDIENTS = "ingredients";
	/** Relation ordering override parameter constants for IngredientRecipeRelation from ((trainingextension))*/
	protected static String INGREDIENTRECIPERELATION_SRC_ORDERED = "relation.IngredientRecipeRelation.source.ordered";
	protected static String INGREDIENTRECIPERELATION_TGT_ORDERED = "relation.IngredientRecipeRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for IngredientRecipeRelation from ((trainingextension))*/
	protected static String INGREDIENTRECIPERELATION_MARKMODIFIED = "relation.IngredientRecipeRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPLEXITY, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.author</code> attribute.
	 * @return the author - RecipeAuthor
	 */
	public TrainingUser getAuthor(final SessionContext ctx)
	{
		return (TrainingUser)getProperty( ctx, "author".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.author</code> attribute.
	 * @return the author - RecipeAuthor
	 */
	public TrainingUser getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.author</code> attribute. 
	 * @param value the author - RecipeAuthor
	 */
	public void setAuthor(final SessionContext ctx, final TrainingUser value)
	{
		setProperty(ctx, "author".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.author</code> attribute. 
	 * @param value the author - RecipeAuthor
	 */
	public void setAuthor(final TrainingUser value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.complexity</code> attribute.
	 * @return the complexity - RecipeComplexityRate
	 */
	public EnumerationValue getComplexity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "complexity".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.complexity</code> attribute.
	 * @return the complexity - RecipeComplexityRate
	 */
	public EnumerationValue getComplexity()
	{
		return getComplexity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.complexity</code> attribute. 
	 * @param value the complexity - RecipeComplexityRate
	 */
	public void setComplexity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "complexity".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.complexity</code> attribute. 
	 * @param value the complexity - RecipeComplexityRate
	 */
	public void setComplexity(final EnumerationValue value)
	{
		setComplexity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.ingredients</code> attribute.
	 * @return the ingredients - Ingredients
	 */
	public Collection<Ingredient> getIngredients(final SessionContext ctx)
	{
		final List<Ingredient> items = getLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			"Ingredient",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.ingredients</code> attribute.
	 * @return the ingredients - Ingredients
	 */
	public Collection<Ingredient> getIngredients()
	{
		return getIngredients( getSession().getSessionContext() );
	}
	
	public long getIngredientsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			"Ingredient",
			null
		);
	}
	
	public long getIngredientsCount()
	{
		return getIngredientsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.ingredients</code> attribute. 
	 * @param value the ingredients - Ingredients
	 */
	public void setIngredients(final SessionContext ctx, final Collection<Ingredient> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.ingredients</code> attribute. 
	 * @param value the ingredients - Ingredients
	 */
	public void setIngredients(final Collection<Ingredient> value)
	{
		setIngredients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ingredients. 
	 * @param value the item to add to ingredients - Ingredients
	 */
	public void addToIngredients(final SessionContext ctx, final Ingredient value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ingredients. 
	 * @param value the item to add to ingredients - Ingredients
	 */
	public void addToIngredients(final Ingredient value)
	{
		addToIngredients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ingredients. 
	 * @param value the item to remove from ingredients - Ingredients
	 */
	public void removeFromIngredients(final SessionContext ctx, final Ingredient value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ingredients. 
	 * @param value the item to remove from ingredients - Ingredients
	 */
	public void removeFromIngredients(final Ingredient value)
	{
		removeFromIngredients( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Ingredient");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED);
		}
		return true;
	}
	
}
