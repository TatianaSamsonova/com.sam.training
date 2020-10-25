/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sam.training.setup;

import static com.sam.training.constants.TrainingextensionConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.sam.training.constants.TrainingextensionConstants;
import com.sam.training.service.TrainingextensionService;


@SystemSetup(extension = TrainingextensionConstants.EXTENSIONNAME)
public class TrainingextensionSystemSetup
{
	private final TrainingextensionService trainingextensionService;

	public TrainingextensionSystemSetup(final TrainingextensionService trainingextensionService)
	{
		this.trainingextensionService = trainingextensionService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		trainingextensionService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TrainingextensionSystemSetup.class.getResourceAsStream("/trainingextension/sap-hybris-platform.png");
	}
}
