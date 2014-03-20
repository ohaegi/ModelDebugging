/**
 */
package org.gemoc.gemoc_language_workbench.conf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.gemoc_language_workbench.conf.AnimatorProject;
import org.gemoc.gemoc_language_workbench.conf.BuildOptions;
import org.gemoc.gemoc_language_workbench.conf.CCSLMoCProject;
import org.gemoc.gemoc_language_workbench.conf.DSAProject;
import org.gemoc.gemoc_language_workbench.conf.DSEProject;
import org.gemoc.gemoc_language_workbench.conf.DomainModelProject;
import org.gemoc.gemoc_language_workbench.conf.ECLFile;
import org.gemoc.gemoc_language_workbench.conf.ECLProject;
import org.gemoc.gemoc_language_workbench.conf.EMFEcoreProject;
import org.gemoc.gemoc_language_workbench.conf.EMFGenmodel;
import org.gemoc.gemoc_language_workbench.conf.EditorProject;
import org.gemoc.gemoc_language_workbench.conf.FileResource;
import org.gemoc.gemoc_language_workbench.conf.GemocLanguageWorkbenchConfiguration;
import org.gemoc.gemoc_language_workbench.conf.K3DSAProject;
import org.gemoc.gemoc_language_workbench.conf.LanguageDefinition;
import org.gemoc.gemoc_language_workbench.conf.MoCProject;
import org.gemoc.gemoc_language_workbench.conf.ModHelXMoCProject;
import org.gemoc.gemoc_language_workbench.conf.ODProject;
import org.gemoc.gemoc_language_workbench.conf.ProjectKind;
import org.gemoc.gemoc_language_workbench.conf.ProjectResource;
import org.gemoc.gemoc_language_workbench.conf.QVToFile;
import org.gemoc.gemoc_language_workbench.conf.SiriusAnimatorProject;
import org.gemoc.gemoc_language_workbench.conf.TreeEditorProject;
import org.gemoc.gemoc_language_workbench.conf.XTextEditorProject;
import org.gemoc.gemoc_language_workbench.conf.confFactory;
import org.gemoc.gemoc_language_workbench.conf.confPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class confPackageImpl extends EPackageImpl implements confPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gemocLanguageWorkbenchConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccslMoCProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animatorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfEcoreProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusAnimatorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modHelXMoCProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEditorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfGenmodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTextEditorProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass k3DSAProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvToFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum projectKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.gemoc_language_workbench.conf.confPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private confPackageImpl() {
		super(eNS_URI, confFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link confPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static confPackage init() {
		if (isInited) return (confPackage)EPackage.Registry.INSTANCE.getEPackage(confPackage.eNS_URI);

		// Obtain or create and register package
		confPackageImpl theconfPackage = (confPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof confPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new confPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theconfPackage.createPackageContents();

		// Initialize created meta-data
		theconfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theconfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(confPackage.eNS_URI, theconfPackage);
		return theconfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGemocLanguageWorkbenchConfiguration() {
		return gemocLanguageWorkbenchConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGemocLanguageWorkbenchConfiguration_LanguageDefinition() {
		return (EReference)gemocLanguageWorkbenchConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGemocLanguageWorkbenchConfiguration_BuildOptions() {
		return (EReference)gemocLanguageWorkbenchConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectResource() {
		return projectResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectResource_ProjectName() {
		return (EAttribute)projectResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectResource_ProjectKind() {
		return (EAttribute)projectResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAProject() {
		return dsaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageDefinition() {
		return languageDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageDefinition_DsaProject() {
		return (EReference)languageDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageDefinition_DomainModelProject() {
		return (EReference)languageDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageDefinition_EditorProjects() {
		return (EReference)languageDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageDefinition_MoCModelProject() {
		return (EReference)languageDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageDefinition_AnimatorProjects() {
		return (EReference)languageDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageDefinition_DSEProject() {
		return (EReference)languageDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageDefinition_Name() {
		return (EAttribute)languageDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditorProject() {
		return editorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorProject_FileExtension() {
		return (EAttribute)editorProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModelProject() {
		return domainModelProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCProject() {
		return moCProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCCSLMoCProject() {
		return ccslMoCProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimatorProject() {
		return animatorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFEcoreProject() {
		return emfEcoreProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFEcoreProject_EmfGenmodel() {
		return (EReference)emfEcoreProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFEcoreProject_DefaultRootEObjectQualifiedName() {
		return (EAttribute)emfEcoreProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODProject() {
		return odProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusAnimatorProject() {
		return siriusAnimatorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusAnimatorProject_ODProject() {
		return (EReference)siriusAnimatorProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModHelXMoCProject() {
		return modHelXMoCProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEProject() {
		return dseProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLProject() {
		return eclProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLProject_EclFile() {
		return (EReference)eclProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLProject_QvtoFile() {
		return (EReference)eclProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeEditorProject() {
		return treeEditorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFGenmodel() {
		return emfGenmodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileResource() {
		return fileResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileResource_LocationURI() {
		return (EAttribute)fileResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTextEditorProject() {
		return xTextEditorProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTextEditorProject_GrammarName() {
		return (EAttribute)xTextEditorProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getK3DSAProject() {
		return k3DSAProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLFile() {
		return eclFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQVToFile() {
		return qvToFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildOptions() {
		return buildOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildOptions_GenerateModelLoaderService() {
		return (EAttribute)buildOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildOptions_GenerateCodeExecutorService() {
		return (EAttribute)buildOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProjectKind() {
		return projectKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public confFactory getconfFactory() {
		return (confFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gemocLanguageWorkbenchConfigurationEClass = createEClass(GEMOC_LANGUAGE_WORKBENCH_CONFIGURATION);
		createEReference(gemocLanguageWorkbenchConfigurationEClass, GEMOC_LANGUAGE_WORKBENCH_CONFIGURATION__LANGUAGE_DEFINITION);
		createEReference(gemocLanguageWorkbenchConfigurationEClass, GEMOC_LANGUAGE_WORKBENCH_CONFIGURATION__BUILD_OPTIONS);

		languageDefinitionEClass = createEClass(LANGUAGE_DEFINITION);
		createEReference(languageDefinitionEClass, LANGUAGE_DEFINITION__DSA_PROJECT);
		createEReference(languageDefinitionEClass, LANGUAGE_DEFINITION__DOMAIN_MODEL_PROJECT);
		createEReference(languageDefinitionEClass, LANGUAGE_DEFINITION__EDITOR_PROJECTS);
		createEReference(languageDefinitionEClass, LANGUAGE_DEFINITION__MO_CMODEL_PROJECT);
		createEReference(languageDefinitionEClass, LANGUAGE_DEFINITION__ANIMATOR_PROJECTS);
		createEReference(languageDefinitionEClass, LANGUAGE_DEFINITION__DSE_PROJECT);
		createEAttribute(languageDefinitionEClass, LANGUAGE_DEFINITION__NAME);

		projectResourceEClass = createEClass(PROJECT_RESOURCE);
		createEAttribute(projectResourceEClass, PROJECT_RESOURCE__PROJECT_NAME);
		createEAttribute(projectResourceEClass, PROJECT_RESOURCE__PROJECT_KIND);

		dsaProjectEClass = createEClass(DSA_PROJECT);

		editorProjectEClass = createEClass(EDITOR_PROJECT);
		createEAttribute(editorProjectEClass, EDITOR_PROJECT__FILE_EXTENSION);

		domainModelProjectEClass = createEClass(DOMAIN_MODEL_PROJECT);

		moCProjectEClass = createEClass(MO_CPROJECT);

		ccslMoCProjectEClass = createEClass(CCSL_MO_CPROJECT);

		animatorProjectEClass = createEClass(ANIMATOR_PROJECT);

		dseProjectEClass = createEClass(DSE_PROJECT);

		emfEcoreProjectEClass = createEClass(EMF_ECORE_PROJECT);
		createEReference(emfEcoreProjectEClass, EMF_ECORE_PROJECT__EMF_GENMODEL);
		createEAttribute(emfEcoreProjectEClass, EMF_ECORE_PROJECT__DEFAULT_ROOT_EOBJECT_QUALIFIED_NAME);

		odProjectEClass = createEClass(OD_PROJECT);

		siriusAnimatorProjectEClass = createEClass(SIRIUS_ANIMATOR_PROJECT);
		createEReference(siriusAnimatorProjectEClass, SIRIUS_ANIMATOR_PROJECT__OD_PROJECT);

		modHelXMoCProjectEClass = createEClass(MOD_HEL_XMO_CPROJECT);

		eclProjectEClass = createEClass(ECL_PROJECT);
		createEReference(eclProjectEClass, ECL_PROJECT__ECL_FILE);
		createEReference(eclProjectEClass, ECL_PROJECT__QVTO_FILE);

		treeEditorProjectEClass = createEClass(TREE_EDITOR_PROJECT);

		k3DSAProjectEClass = createEClass(K3DSA_PROJECT);

		fileResourceEClass = createEClass(FILE_RESOURCE);
		createEAttribute(fileResourceEClass, FILE_RESOURCE__LOCATION_URI);

		emfGenmodelEClass = createEClass(EMF_GENMODEL);

		eclFileEClass = createEClass(ECL_FILE);

		qvToFileEClass = createEClass(QV_TO_FILE);

		xTextEditorProjectEClass = createEClass(XTEXT_EDITOR_PROJECT);
		createEAttribute(xTextEditorProjectEClass, XTEXT_EDITOR_PROJECT__GRAMMAR_NAME);

		buildOptionsEClass = createEClass(BUILD_OPTIONS);
		createEAttribute(buildOptionsEClass, BUILD_OPTIONS__GENERATE_MODEL_LOADER_SERVICE);
		createEAttribute(buildOptionsEClass, BUILD_OPTIONS__GENERATE_CODE_EXECUTOR_SERVICE);

		// Create enums
		projectKindEEnum = createEEnum(PROJECT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dsaProjectEClass.getESuperTypes().add(this.getProjectResource());
		editorProjectEClass.getESuperTypes().add(this.getProjectResource());
		domainModelProjectEClass.getESuperTypes().add(this.getProjectResource());
		moCProjectEClass.getESuperTypes().add(this.getProjectResource());
		ccslMoCProjectEClass.getESuperTypes().add(this.getMoCProject());
		animatorProjectEClass.getESuperTypes().add(this.getProjectResource());
		dseProjectEClass.getESuperTypes().add(this.getProjectResource());
		emfEcoreProjectEClass.getESuperTypes().add(this.getDomainModelProject());
		odProjectEClass.getESuperTypes().add(this.getEditorProject());
		siriusAnimatorProjectEClass.getESuperTypes().add(this.getAnimatorProject());
		modHelXMoCProjectEClass.getESuperTypes().add(this.getMoCProject());
		eclProjectEClass.getESuperTypes().add(this.getDSEProject());
		treeEditorProjectEClass.getESuperTypes().add(this.getEditorProject());
		k3DSAProjectEClass.getESuperTypes().add(this.getDSAProject());
		emfGenmodelEClass.getESuperTypes().add(this.getFileResource());
		eclFileEClass.getESuperTypes().add(this.getFileResource());
		qvToFileEClass.getESuperTypes().add(this.getFileResource());
		xTextEditorProjectEClass.getESuperTypes().add(this.getEditorProject());

		// Initialize classes and features; add operations and parameters
		initEClass(gemocLanguageWorkbenchConfigurationEClass, GemocLanguageWorkbenchConfiguration.class, "GemocLanguageWorkbenchConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGemocLanguageWorkbenchConfiguration_LanguageDefinition(), this.getLanguageDefinition(), null, "languageDefinition", null, 0, 1, GemocLanguageWorkbenchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGemocLanguageWorkbenchConfiguration_BuildOptions(), this.getBuildOptions(), null, "buildOptions", null, 0, 1, GemocLanguageWorkbenchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageDefinitionEClass, LanguageDefinition.class, "LanguageDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageDefinition_DsaProject(), this.getDSAProject(), null, "dsaProject", null, 0, 1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageDefinition_DomainModelProject(), this.getDomainModelProject(), null, "domainModelProject", null, 1, 1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageDefinition_EditorProjects(), this.getEditorProject(), null, "editorProjects", null, 0, -1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageDefinition_MoCModelProject(), this.getMoCProject(), null, "moCModelProject", null, 0, 1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageDefinition_AnimatorProjects(), this.getAnimatorProject(), null, "animatorProjects", null, 0, -1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageDefinition_DSEProject(), this.getDSEProject(), null, "dSEProject", null, 0, 1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, LanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectResourceEClass, ProjectResource.class, "ProjectResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectResource_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, ProjectResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectResource_ProjectKind(), this.getProjectKind(), "projectKind", null, 1, 1, ProjectResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsaProjectEClass, DSAProject.class, "DSAProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(editorProjectEClass, EditorProject.class, "EditorProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditorProject_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 1, -1, EditorProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelProjectEClass, DomainModelProject.class, "DomainModelProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moCProjectEClass, MoCProject.class, "MoCProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ccslMoCProjectEClass, CCSLMoCProject.class, "CCSLMoCProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(animatorProjectEClass, AnimatorProject.class, "AnimatorProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseProjectEClass, DSEProject.class, "DSEProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emfEcoreProjectEClass, EMFEcoreProject.class, "EMFEcoreProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFEcoreProject_EmfGenmodel(), this.getEMFGenmodel(), null, "emfGenmodel", null, 1, 1, EMFEcoreProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFEcoreProject_DefaultRootEObjectQualifiedName(), ecorePackage.getEString(), "defaultRootEObjectQualifiedName", null, 0, 1, EMFEcoreProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odProjectEClass, ODProject.class, "ODProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(siriusAnimatorProjectEClass, SiriusAnimatorProject.class, "SiriusAnimatorProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiriusAnimatorProject_ODProject(), this.getODProject(), null, "oDProject", null, 1, 1, SiriusAnimatorProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modHelXMoCProjectEClass, ModHelXMoCProject.class, "ModHelXMoCProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eclProjectEClass, ECLProject.class, "ECLProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLProject_EclFile(), this.getECLFile(), null, "eclFile", null, 1, 1, ECLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLProject_QvtoFile(), this.getQVToFile(), null, "qvtoFile", null, 1, 1, ECLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeEditorProjectEClass, TreeEditorProject.class, "TreeEditorProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(k3DSAProjectEClass, K3DSAProject.class, "K3DSAProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileResourceEClass, FileResource.class, "FileResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileResource_LocationURI(), ecorePackage.getEString(), "locationURI", null, 0, 1, FileResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfGenmodelEClass, EMFGenmodel.class, "EMFGenmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eclFileEClass, ECLFile.class, "ECLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qvToFileEClass, QVToFile.class, "QVToFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xTextEditorProjectEClass, XTextEditorProject.class, "XTextEditorProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXTextEditorProject_GrammarName(), ecorePackage.getEString(), "grammarName", null, 1, 1, XTextEditorProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildOptionsEClass, BuildOptions.class, "BuildOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildOptions_GenerateModelLoaderService(), ecorePackage.getEBoolean(), "generateModelLoaderService", "true", 0, 1, BuildOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildOptions_GenerateCodeExecutorService(), ecorePackage.getEBoolean(), "generateCodeExecutorService", "true", 0, 1, BuildOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(projectKindEEnum, ProjectKind.class, "ProjectKind");
		addEEnumLiteral(projectKindEEnum, ProjectKind.ECLIPSE_PLUGIN);
		addEEnumLiteral(projectKindEEnum, ProjectKind.MAVEN_JAR);

		// Create resource
		createResource(eNS_URI);
	}

} //confPackageImpl
