/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Sensor Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.DistanceSensorTrigger#getDistance <em>Distance</em>}</li>
 *   <li>{@link rover.DistanceSensorTrigger#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getDistanceSensorTrigger()
 * @model
 * @generated
 */
public interface DistanceSensorTrigger extends TriggeredTransition {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' reference.
	 * @see #setDistance(Distance)
	 * @see rover.RoverPackage#getDistanceSensorTrigger_Distance()
	 * @model required="true"
	 * @generated
	 */
	Distance getDistance();

	/**
	 * Sets the value of the '{@link rover.DistanceSensorTrigger#getDistance <em>Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' reference.
	 * @see #setLength(Length)
	 * @see rover.RoverPackage#getDistanceSensorTrigger_Length()
	 * @model required="true"
	 * @generated
	 */
	Length getLength();

	/**
	 * Sets the value of the '{@link rover.DistanceSensorTrigger#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Length value);

} // DistanceSensorTrigger
