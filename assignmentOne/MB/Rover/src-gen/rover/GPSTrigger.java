/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.GPSTrigger#getGps <em>Gps</em>}</li>
 *   <li>{@link rover.GPSTrigger#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getGPSTrigger()
 * @model
 * @generated
 */
public interface GPSTrigger extends TriggeredTransition {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' reference.
	 * @see #setGps(GPS)
	 * @see rover.RoverPackage#getGPSTrigger_Gps()
	 * @model required="true"
	 * @generated
	 */
	GPS getGps();

	/**
	 * Sets the value of the '{@link rover.GPSTrigger#getGps <em>Gps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' reference.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(GPS value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see rover.RoverPackage#getGPSTrigger_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link rover.GPSTrigger#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // GPSTrigger
