/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23 Nov 2020, 17:26:38                       ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.constants.TrainingextensionConstants;
import com.sam.training.jalo.Author;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Book.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Book extends GenericItem
{
	/** Qualifier of the <code>Book.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Book.cover</code> attribute **/
	public static final String COVER = "cover";
	/** Qualifier of the <code>Book.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>Book.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>Book.authors</code> attribute **/
	public static final String AUTHORS = "authors";
	/** Relation ordering override parameter constants for BookAuthorRelations from ((trainingextension))*/
	protected static String BOOKAUTHORRELATIONS_SRC_ORDERED = "relation.BookAuthorRelations.source.ordered";
	protected static String BOOKAUTHORRELATIONS_TGT_ORDERED = "relation.BookAuthorRelations.target.ordered";
	/** Relation disable markmodifed parameter constants for BookAuthorRelations from ((trainingextension))*/
	protected static String BOOKAUTHORRELATIONS_MARKMODIFIED = "relation.BookAuthorRelations.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(COVER, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.authors</code> attribute.
	 * @return the authors - Authors
	 */
	public Collection<Author> getAuthors(final SessionContext ctx)
	{
		final List<Author> items = getLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			"Author",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.authors</code> attribute.
	 * @return the authors - Authors
	 */
	public Collection<Author> getAuthors()
	{
		return getAuthors( getSession().getSessionContext() );
	}
	
	public long getAuthorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			"Author",
			null
		);
	}
	
	public long getAuthorsCount()
	{
		return getAuthorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.authors</code> attribute. 
	 * @param value the authors - Authors
	 */
	public void setAuthors(final SessionContext ctx, final Collection<Author> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.authors</code> attribute. 
	 * @param value the authors - Authors
	 */
	public void setAuthors(final Collection<Author> value)
	{
		setAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to authors. 
	 * @param value the item to add to authors - Authors
	 */
	public void addToAuthors(final SessionContext ctx, final Author value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to authors. 
	 * @param value the item to add to authors - Authors
	 */
	public void addToAuthors(final Author value)
	{
		addToAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from authors. 
	 * @param value the item to remove from authors - Authors
	 */
	public void removeFromAuthors(final SessionContext ctx, final Author value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from authors. 
	 * @param value the item to remove from authors - Authors
	 */
	public void removeFromAuthors(final Author value)
	{
		removeFromAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.content</code> attribute.
	 * @return the content
	 */
	public Media getContent(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, "content".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.content</code> attribute.
	 * @return the content
	 */
	public Media getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, "content".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final Media value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.cover</code> attribute.
	 * @return the cover
	 */
	public Media getCover(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, "cover".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.cover</code> attribute.
	 * @return the cover
	 */
	public Media getCover()
	{
		return getCover( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.cover</code> attribute. 
	 * @param value the cover
	 */
	public void setCover(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, "cover".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.cover</code> attribute. 
	 * @param value the cover
	 */
	public void setCover(final Media value)
	{
		setCover( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Author");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "title".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "title".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.year</code> attribute.
	 * @return the year
	 */
	public Long getYear(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "year".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.year</code> attribute.
	 * @return the year
	 */
	public Long getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.year</code> attribute. 
	 * @return the year
	 */
	public long getYearAsPrimitive(final SessionContext ctx)
	{
		Long value = getYear( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.year</code> attribute. 
	 * @return the year
	 */
	public long getYearAsPrimitive()
	{
		return getYearAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "year".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Long value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final long value)
	{
		setYear( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final long value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
