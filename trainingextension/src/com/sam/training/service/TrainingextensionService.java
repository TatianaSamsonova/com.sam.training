/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sam.training.service;

public interface TrainingextensionService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
