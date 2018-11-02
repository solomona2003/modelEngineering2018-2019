/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.System#getRover <em>Rover</em>}</li>
 *   <li>{@link rover.System#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Rover</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Rover}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rover</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rover</em>' containment reference list.
	 * @see rover.RoverPackage#getSystem_Rover()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rover> getRover();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see rover.RoverPackage#getSystem_Program()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Program> getProgram();

} // System
