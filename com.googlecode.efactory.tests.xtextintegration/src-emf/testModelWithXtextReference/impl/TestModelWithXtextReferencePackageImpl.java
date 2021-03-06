/**
 */
package testModelWithXtextReference.impl;

import com.googlecode.efactory.xtextintegration.myDsl.MyDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testModelWithXtextReference.TestModelWithXtextReference;
import testModelWithXtextReference.TestModelWithXtextReferenceFactory;
import testModelWithXtextReference.TestModelWithXtextReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestModelWithXtextReferencePackageImpl extends EPackageImpl implements TestModelWithXtextReferencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testModelWithXtextReferenceEClass = null;

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
	 * @see testModelWithXtextReference.TestModelWithXtextReferencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestModelWithXtextReferencePackageImpl() {
		super(eNS_URI, TestModelWithXtextReferenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TestModelWithXtextReferencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestModelWithXtextReferencePackage init() {
		if (isInited) return (TestModelWithXtextReferencePackage)EPackage.Registry.INSTANCE.getEPackage(TestModelWithXtextReferencePackage.eNS_URI);

		// Obtain or create and register package
		TestModelWithXtextReferencePackageImpl theTestModelWithXtextReferencePackage = (TestModelWithXtextReferencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestModelWithXtextReferencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestModelWithXtextReferencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MyDslPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTestModelWithXtextReferencePackage.createPackageContents();

		// Initialize created meta-data
		theTestModelWithXtextReferencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestModelWithXtextReferencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestModelWithXtextReferencePackage.eNS_URI, theTestModelWithXtextReferencePackage);
		return theTestModelWithXtextReferencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestModelWithXtextReference() {
		return testModelWithXtextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestModelWithXtextReference_Model() {
		return (EReference)testModelWithXtextReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestModelWithXtextReference_Name() {
		return (EAttribute)testModelWithXtextReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestModelWithXtextReferenceFactory getTestModelWithXtextReferenceFactory() {
		return (TestModelWithXtextReferenceFactory)getEFactoryInstance();
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
		testModelWithXtextReferenceEClass = createEClass(TEST_MODEL_WITH_XTEXT_REFERENCE);
		createEReference(testModelWithXtextReferenceEClass, TEST_MODEL_WITH_XTEXT_REFERENCE__MODEL);
		createEAttribute(testModelWithXtextReferenceEClass, TEST_MODEL_WITH_XTEXT_REFERENCE__NAME);
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

		// Obtain other dependent packages
		MyDslPackage theMyDslPackage = (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(testModelWithXtextReferenceEClass, TestModelWithXtextReference.class, "TestModelWithXtextReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestModelWithXtextReference_Model(), theMyDslPackage.getModel(), null, "model", null, 0, 1, TestModelWithXtextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestModelWithXtextReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestModelWithXtextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TestModelWithXtextReferencePackageImpl
