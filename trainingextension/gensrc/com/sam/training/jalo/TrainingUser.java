/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26 Oct 2020, 13:55:05                       ---
 * ----------------------------------------------------------------
 */
package com.sam.training.jalo;

import com.sam.training.jalo.LoyaltyCard;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
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
	/** Qualifier of the <code>TrainingUser.loyaltyCard</code> attribute **/
	public static final String LOYALTYCARD = "loyaltyCard";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOYALTYCARD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingUser.loyaltyCard</code> attribute.
	 * @return the loyaltyCard - LoyaltyCard
	 */
	public LoyaltyCard getLoyaltyCard(final SessionContext ctx)
	{
		return (LoyaltyCard)getProperty( ctx, "loyaltyCard".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingUser.loyaltyCard</code> attribute.
	 * @return the loyaltyCard - LoyaltyCard
	 */
	public LoyaltyCard getLoyaltyCard()
	{
		return getLoyaltyCard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingUser.loyaltyCard</code> attribute. 
	 * @param value the loyaltyCard - LoyaltyCard
	 */
	public void setLoyaltyCard(final SessionContext ctx, final LoyaltyCard value)
	{
		setProperty(ctx, "loyaltyCard".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingUser.loyaltyCard</code> attribute. 
	 * @param value the loyaltyCard - LoyaltyCard
	 */
	public void setLoyaltyCard(final LoyaltyCard value)
	{
		setLoyaltyCard( getSession().getSessionContext(), value );
	}
	
}
