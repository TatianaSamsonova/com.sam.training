/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27 Oct 2020, 12:16:05                       ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.constants.TrainingextensionConstants;
import com.sam.training.jalo.Recipe;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Ingredient.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Ingredient extends GenericItem
{
	/** Qualifier of the <code>Ingredient.recipes</code> attribute **/
	public static final String RECIPES = "recipes";
	/** Relation ordering override parameter constants for IngredientRecipeRelation from ((trainingextension))*/
	protected static String INGREDIENTRECIPERELATION_SRC_ORDERED = "relation.IngredientRecipeRelation.source.ordered";
	protected static String INGREDIENTRECIPERELATION_TGT_ORDERED = "relation.IngredientRecipeRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for IngredientRecipeRelation from ((trainingextension))*/
	protected static String INGREDIENTRECIPERELATION_MARKMODIFIED = "relation.IngredientRecipeRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Recipe");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.recipes</code> attribute.
	 * @return the recipes - Recipes
	 */
	public Collection<Recipe> getRecipes(final SessionContext ctx)
	{
		final List<Recipe> items = getLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			"Recipe",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.recipes</code> attribute.
	 * @return the recipes - Recipes
	 */
	public Collection<Recipe> getRecipes()
	{
		return getRecipes( getSession().getSessionContext() );
	}
	
	public long getRecipesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			"Recipe",
			null
		);
	}
	
	public long getRecipesCount()
	{
		return getRecipesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.recipes</code> attribute. 
	 * @param value the recipes - Recipes
	 */
	public void setRecipes(final SessionContext ctx, final Collection<Recipe> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.recipes</code> attribute. 
	 * @param value the recipes - Recipes
	 */
	public void setRecipes(final Collection<Recipe> value)
	{
		setRecipes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipes. 
	 * @param value the item to add to recipes - Recipes
	 */
	public void addToRecipes(final SessionContext ctx, final Recipe value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipes. 
	 * @param value the item to add to recipes - Recipes
	 */
	public void addToRecipes(final Recipe value)
	{
		addToRecipes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipes. 
	 * @param value the item to remove from recipes - Recipes
	 */
	public void removeFromRecipes(final SessionContext ctx, final Recipe value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.INGREDIENTRECIPERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INGREDIENTRECIPERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipes. 
	 * @param value the item to remove from recipes - Recipes
	 */
	public void removeFromRecipes(final Recipe value)
	{
		removeFromRecipes( getSession().getSessionContext(), value );
	}
	
}