/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.debug.ide.event.debugger;

/**
 * Reply sent when the value of a variable has been changed after a request.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class SetVariableValueReply extends AbstractVariableReply {

	/**
	 * The value to set.
	 */
	Object value;

	/**
	 * Constructor for {@link fr.obeo.dsl.debug.Thread Thread}.
	 * 
	 * @param threadName
	 *            the {@link fr.obeo.dsl.debug.Thread#getName() thread name}
	 * @param stackName
	 *            the {@link fr.obeo.dsl.debug.StackFrame#getName() stack frame name}
	 * @param variableName
	 *            the {@link fr.obeo.dsl.debug.Variable#getName() variable name}
	 * @param value
	 *            the value to set
	 */
	public SetVariableValueReply(String threadName, String stackName, String variableName, Object value) {
		super(threadName, stackName, variableName);
		this.value = value;
	}

	/**
	 * Gets the value to set.
	 * 
	 * @return the value to set
	 */
	public Object getValue() {
		return value;
	}
}
