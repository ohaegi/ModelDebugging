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
package fr.obeo.dsl.debug.ide;

import fr.obeo.dsl.debug.DebugTarget;
import fr.obeo.dsl.debug.DebugTargetUtils;
import fr.obeo.dsl.debug.StackFrame;
import fr.obeo.dsl.debug.Thread;
import fr.obeo.dsl.debug.ThreadUtils;
import fr.obeo.dsl.debug.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * An EMF {@link IModelUpdater}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class ModelUpdater implements IModelUpdater {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#terminateRequest(fr.obeo.dsl.debug.DebugTarget)
	 */
	public void terminateRequest(DebugTarget target) {
		DebugTargetUtils.terminateRequest(target);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#disconnectRequest(fr.obeo.dsl.debug.DebugTarget)
	 */
	public void disconnectRequest(DebugTarget target) {
		DebugTargetUtils.disconnectRequest(target);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#spawnRunningThreadReply(fr.obeo.dsl.debug.DebugTarget,
	 *      java.lang.String, org.eclipse.emf.ecore.EObject)
	 */
	public void spawnRunningThreadReply(DebugTarget target, String threadName, EObject threadContext) {
		DebugTargetUtils.spawnRunningThreadReply(target, threadName, threadContext);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#terminatedReply(fr.obeo.dsl.debug.DebugTarget)
	 */
	public void terminatedReply(DebugTarget target) {
		DebugTargetUtils.terminatedReply(target);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#deleteVariableReply(fr.obeo.dsl.debug.Thread,
	 *      java.lang.String)
	 */
	public void deleteVariableReply(Thread thread, String name) {
		ThreadUtils.deleteVariableReply(thread, name);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#popStackFrameReply(fr.obeo.dsl.debug.Thread)
	 */
	public StackFrame popStackFrameReply(Thread thread) {
		return ThreadUtils.popStackFrameReply(thread);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#pushStackFrameReply(fr.obeo.dsl.debug.Thread,
	 *      java.lang.String, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, boolean)
	 */
	public StackFrame pushStackFrameReply(Thread thread, String name, EObject context, EObject instruction,
			boolean canStepInto) {
		return ThreadUtils.pushStackFrameReply(thread, name, context, instruction, canStepInto);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#stepIntoReply(fr.obeo.dsl.debug.Thread)
	 */
	public void stepIntoReply(Thread thread) {
		ThreadUtils.stepIntoReply(thread);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#stepOverReply(fr.obeo.dsl.debug.Thread)
	 */
	public void stepOverReply(Thread thread) {
		ThreadUtils.stepOverReply(thread);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#stepReturnReply(fr.obeo.dsl.debug.Thread)
	 */
	public void stepReturnReply(Thread thread) {
		ThreadUtils.stepReturnReply(thread);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#resumedReply(fr.obeo.dsl.debug.Thread)
	 */
	public void resumedReply(Thread thread) {
		ThreadUtils.resumedReply(thread);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#setCurrentInstructionReply(fr.obeo.dsl.debug.Thread,
	 *      org.eclipse.emf.ecore.EObject, boolean)
	 */
	public void setCurrentInstructionReply(Thread thread, EObject instruction, boolean canStepInto) {
		ThreadUtils.setCurrentInstructionReply(thread, instruction, canStepInto);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#suspendedReply(fr.obeo.dsl.debug.Thread)
	 */
	public void suspendedReply(Thread thread) {
		ThreadUtils.suspendedReply(thread);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#terminatedReply(fr.obeo.dsl.debug.Thread)
	 */
	public void terminatedReply(Thread thread) {
		ThreadUtils.terminatedReply(thread);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#setVariableReply(fr.obeo.dsl.debug.StackFrame,
	 *      java.lang.String, java.lang.String, java.lang.Object, boolean)
	 */
	public void setVariableReply(StackFrame stackFrame, String declarationTypeName, String variableName,
			Object value, boolean supportModifications) {
		ThreadUtils.setVariableReply(stackFrame, declarationTypeName, variableName, value,
				supportModifications);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#setVariableValueReply(fr.obeo.dsl.debug.Variable,
	 *      java.lang.Object)
	 */
	public void setVariableValueReply(Variable variable, Object value) {
		ThreadUtils.setVariableValueReply(variable, value);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.debug.ide.IModelUpdater#terminateRequest(fr.obeo.dsl.debug.Thread)
	 */
	public void terminateRequest(Thread thread) {
		ThreadUtils.terminateRequest(thread);
	}

}
