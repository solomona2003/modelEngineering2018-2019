/**
 */
package rover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>direction Facing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.directionFacing#getCurrentlyFacing <em>Currently Facing</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getdirectionFacing()
 * @model
 * @generated
 */
public interface directionFacing extends EObject {
	/**
	 * Returns the value of the '<em><b>Currently Facing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currently Facing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently Facing</em>' attribute.
	 * @see #setCurrentlyFacing(float)
	 * @see rover.RoverPackage#getdirectionFacing_CurrentlyFacing()
	 * @model
	 * @generated
	 */
	float getCurrentlyFacing();

	/**
	 * Sets the value of the '{@link rover.directionFacing#getCurrentlyFacing <em>Currently Facing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently Facing</em>' attribute.
	 * @see #getCurrentlyFacing()
	 * @generated
	 */
	void setCurrentlyFacing(float value);

} // directionFacing
