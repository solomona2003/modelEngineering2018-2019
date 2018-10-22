/**
 */
package rover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.DistanceSensor#getRemainingDistance <em>Remaining Distance</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getDistanceSensor()
 * @model
 * @generated
 */
public interface DistanceSensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Remaining Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Distance</em>' attribute.
	 * @see #setRemainingDistance(float)
	 * @see rover.RoverPackage#getDistanceSensor_RemainingDistance()
	 * @model
	 * @generated
	 */
	float getRemainingDistance();

	/**
	 * Sets the value of the '{@link rover.DistanceSensor#getRemainingDistance <em>Remaining Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Distance</em>' attribute.
	 * @see #getRemainingDistance()
	 * @generated
	 */
	void setRemainingDistance(float value);

} // DistanceSensor
