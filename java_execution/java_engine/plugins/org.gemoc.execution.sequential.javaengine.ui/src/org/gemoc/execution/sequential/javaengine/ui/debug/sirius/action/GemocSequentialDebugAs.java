/*******************************************************************************
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.gemoc.execution.sequential.javaengine.ui.debug.sirius.action;


import org.gemoc.execution.sequential.javaengine.ui.launcher.Launcher;

import fr.obeo.dsl.debug.ide.sirius.ui.action.AbstractDebugAsAction;

public class GemocSequentialDebugAs extends AbstractDebugAsAction {

	@Override
	protected String getLaunchConfigurationTypeID() {
		return Launcher.TYPE_ID;
	}
	
}
