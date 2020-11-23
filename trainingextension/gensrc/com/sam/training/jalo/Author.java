/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23 Nov 2020, 15:56:44                       ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.constants.TrainingextensionConstants;
import com.sam.training.jalo.Book;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Author.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Author extends GenericItem
{
	/** Qualifier of the <code>Author.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Author.dateOfBirth</code> attribute **/
	public static final String DATEOFBIRTH = "dateOfBirth";
	/** Qualifier of the <code>Author.books</code> attribute **/
	public static final String BOOKS = "books";
	/** Relation ordering override parameter constants for BookAuthorRelations from ((trainingextension))*/
	protected static String BOOKAUTHORRELATIONS_SRC_ORDERED = "relation.BookAuthorRelations.source.ordered";
	protected static String BOOKAUTHORRELATIONS_TGT_ORDERED = "relation.BookAuthorRelations.target.ordered";
	/** Relation disable markmodifed parameter constants for BookAuthorRelations from ((trainingextension))*/
	protected static String BOOKAUTHORRELATIONS_MARKMODIFIED = "relation.BookAuthorRelations.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DATEOFBIRTH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books - Books
	 */
	public Collection<Book> getBooks(final SessionContext ctx)
	{
		final List<Book> items = getLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			"Book",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books - Books
	 */
	public Collection<Book> getBooks()
	{
		return getBooks( getSession().getSessionContext() );
	}
	
	public long getBooksCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			"Book",
			null
		);
	}
	
	public long getBooksCount()
	{
		return getBooksCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books - Books
	 */
	public void setBooks(final SessionContext ctx, final Collection<Book> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books - Books
	 */
	public void setBooks(final Collection<Book> value)
	{
		setBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books - Books
	 */
	public void addToBooks(final SessionContext ctx, final Book value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books - Books
	 */
	public void addToBooks(final Book value)
	{
		addToBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books - Books
	 */
	public void removeFromBooks(final SessionContext ctx, final Book value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingextensionConstants.Relations.BOOKAUTHORRELATIONS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books - Books
	 */
	public void removeFromBooks(final Book value)
	{
		removeFromBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, "dateOfBirth".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		return getDateOfBirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, "dateOfBirth".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Book");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BOOKAUTHORRELATIONS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
