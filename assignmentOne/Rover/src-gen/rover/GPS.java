/**
 */
package rover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.GPS#getCurrentPosition <em>Current Position</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getGPS()
 * @model
 * @generated
 */
public interface GPS extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' attribute.
	 * @see #setCurrentPosition(float)
	 * @see rover.RoverPackage#getGPS_CurrentPosition()
	 * @model
	 * @generated
	 */
	float getCurrentPosition();

	/**
	 * Sets the value of the '{@link rover.GPS#getCurrentPosition <em>Current Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' attribute.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(float value);

} // GPS
