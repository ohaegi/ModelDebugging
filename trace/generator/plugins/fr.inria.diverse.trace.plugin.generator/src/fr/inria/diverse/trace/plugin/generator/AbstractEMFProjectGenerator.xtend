package fr.inria.diverse.trace.plugin.generator

import java.util.HashSet
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.ui.PlatformUI
import org.eclipse.xtend.lib.annotations.Accessors

abstract class AbstractEMFProjectGenerator {

	// Inputs
	//protected val URI ecoreURI
	protected val EPackage ecoreModel
	protected val String projectName

	// Outputs
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	protected var IProject project
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	protected val Set<GenPackage> referencedGenPackages = new HashSet
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	protected val Set<EPackage> rootPackages = new HashSet

	// Transient
	protected var GenModel genModel

//	new(String projectName, URI ecoreURI) {
//		this.projectName = projectName
//		this.ecoreURI = ecoreURI
//	}

	new(String projectName, EPackage ecoreModel) {
		this.projectName = projectName
		this.ecoreModel = ecoreModel
	}

	/**
	 * Creates a new EMF project with the ecore file and the genmodel in the "model" folder
	 * also mages project, referencedGenPackages and rootPackages available.
	 */
	def void generateBaseEMFProject(IProgressMonitor m)

	/**
	 * Helper method to generate code without a job.
	 */
	def void generateModelCode() {
		PlatformUI.workbench.activeWorkbenchWindow.run(false, true, [ m |
			generateModelCode(m)
		])
	}

	/**
	 * Generates the code using the genmodel (within a Job).
	 */
	def void generateModelCode(IProgressMonitor m)

}
