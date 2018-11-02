/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Rover#getName <em>Name</em>}</li>
 *   <li>{@link rover.Rover#getComponent <em>Component</em>}</li>
 *   <li>{@link rover.Rover#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getRover()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraint1_atLeastOneMotor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot constraint1_atLeastOneMotor='self.motor -&gt; size () &gt; 0'"
 * @generated
 */
public interface Rover extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rover.RoverPackage#getRover_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rover.Rover#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see rover.RoverPackage#getRover_Component()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Motor</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor</em>' containment reference list.
	 * @see rover.RoverPackage#getRover_Motor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Motor> getMotor();

} // Rover
