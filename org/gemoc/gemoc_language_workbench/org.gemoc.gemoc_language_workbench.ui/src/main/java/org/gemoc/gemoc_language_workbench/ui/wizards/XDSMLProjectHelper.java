package org.gemoc.gemoc_language_workbench.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.gemoc_language_workbench.conf.LanguageDefinition;
import org.gemoc.gemoc_language_workbench.ui.Activator;

public class XDSMLProjectHelper {

	public static LanguageDefinition getLanguageDefinition(IProject searchedProject){

		if(searchedProject != null){
			IFile configFile = searchedProject.getFile(new Path(
					Activator.GEMOC_PROJECT_CONFIGURATION_FILE));
			if (configFile.exists()) {
				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();
				// get the resource
				Resource resource = resSet
						.getResource(URI.createURI(configFile.getLocationURI()
								.toString()), true);
				
				
				return (LanguageDefinition) resource
						.getContents().get(0);
			}
		}
		return null;
	}
}
