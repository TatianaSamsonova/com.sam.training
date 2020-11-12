/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12 Nov 2020, 16:01:01                       ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type TrainingUser.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class TrainingUser extends User
{
	/** Qualifier of the <code>TrainingUser.gender</code> attribute **/
	public static final String GENDER = "gender";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingUser.gender</code> attribute.
	 * @return the gender - TrainingUserGender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "gender".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingUser.gender</code> attribute.
	 * @return the gender - TrainingUserGender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingUser.gender</code> attribute. 
	 * @param value the gender - TrainingUserGender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "gender".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingUser.gender</code> attribute. 
	 * @param value the gender - TrainingUserGender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
}
