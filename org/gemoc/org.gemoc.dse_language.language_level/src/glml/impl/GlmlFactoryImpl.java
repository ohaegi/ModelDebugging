/**
 */
package glml.impl;

import glml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlmlFactoryImpl extends EFactoryImpl implements GlmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlmlFactory init() {
		try {
			GlmlFactory theGlmlFactory = (GlmlFactory)EPackage.Registry.INSTANCE.getEFactory(GlmlPackage.eNS_URI);
			if (theGlmlFactory != null) {
				return theGlmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GlmlPackage.DOMAIN_SPECIFIC_EVENT_FILE: return createDomainSpecificEventFile();
			case GlmlPackage.IMPORT_STATEMENT: return createImportStatement();
			case GlmlPackage.DOMAIN_SPECIFIC_EVENT: return createDomainSpecificEvent();
			case GlmlPackage.IDENTITY: return createIdentity();
			case GlmlPackage.SPATIAL_COINCIDENCE: return createSpatialCoincidence();
			case GlmlPackage.DOMAIN_SPECIFIC_ACTION: return createDomainSpecificAction();
			case GlmlPackage.ECL_EVENT: return createECLEvent();
			case GlmlPackage.MODEL_SPECIFIC_EVENT: return createModelSpecificEvent();
			case GlmlPackage.MODEL_SPECIFIC_ACTION: return createModelSpecificAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GlmlPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GlmlPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEventFile createDomainSpecificEventFile() {
		DomainSpecificEventFileImpl domainSpecificEventFile = new DomainSpecificEventFileImpl();
		return domainSpecificEventFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEvent createDomainSpecificEvent() {
		DomainSpecificEventImpl domainSpecificEvent = new DomainSpecificEventImpl();
		return domainSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity createIdentity() {
		IdentityImpl identity = new IdentityImpl();
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialCoincidence createSpatialCoincidence() {
		SpatialCoincidenceImpl spatialCoincidence = new SpatialCoincidenceImpl();
		return spatialCoincidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificAction createDomainSpecificAction() {
		DomainSpecificActionImpl domainSpecificAction = new DomainSpecificActionImpl();
		return domainSpecificAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLEvent createECLEvent() {
		ECLEventImpl eclEvent = new ECLEventImpl();
		return eclEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEvent createModelSpecificEvent() {
		ModelSpecificEventImpl modelSpecificEvent = new ModelSpecificEventImpl();
		return modelSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificAction createModelSpecificAction() {
		ModelSpecificActionImpl modelSpecificAction = new ModelSpecificActionImpl();
		return modelSpecificAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlmlPackage getGlmlPackage() {
		return (GlmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlmlPackage getPackage() {
		return GlmlPackage.eINSTANCE;
	}

} //GlmlFactoryImpl
