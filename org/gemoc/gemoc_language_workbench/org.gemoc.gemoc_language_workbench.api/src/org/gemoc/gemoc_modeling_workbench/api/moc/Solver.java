package org.gemoc.gemoc_modeling_workbench.api.moc;

import org.gemoc.gemoc_modeling_workbench.api.dse.DomainSpecificEvent;

/**
 * A solver is the visible interface of a constraint system that defines the
 * Model of Computation.
 * 
 * @author flatombe
 */
public interface Solver {
	/**
	 * Forces the underlying MoC structure to forbid the triggering of the given
	 * Domain Specific Event.
	 * 
	 * @param event
	 */
	public void forceEventNonOccurrence(DomainSpecificEvent event);

	/**
	 * Forces the underlying MoC structure to trigger the given Domain Specific
	 * Event.
	 * 
	 * @param event
	 */
	public void forceEventOccurrence(DomainSpecificEvent event);

	/**
	 * Returns the next step on the MoC's agenda.
	 * 
	 * @return
	 */
	public Step getNextStep();
}
