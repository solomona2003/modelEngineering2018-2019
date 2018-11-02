/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compass Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.CompassTrigger#getCompass <em>Compass</em>}</li>
 *   <li>{@link rover.CompassTrigger#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getCompassTrigger()
 * @model
 * @generated
 */
public interface CompassTrigger extends TriggeredTransition {
	/**
	 * Returns the value of the '<em><b>Compass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass</em>' reference.
	 * @see #setCompass(Compass)
	 * @see rover.RoverPackage#getCompassTrigger_Compass()
	 * @model required="true"
	 * @generated
	 */
	Compass getCompass();

	/**
	 * Sets the value of the '{@link rover.CompassTrigger#getCompass <em>Compass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass</em>' reference.
	 * @see #getCompass()
	 * @generated
	 */
	void setCompass(Compass value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' reference.
	 * @see #setAngle(Angle)
	 * @see rover.RoverPackage#getCompassTrigger_Angle()
	 * @model required="true"
	 * @generated
	 */
	Angle getAngle();

	/**
	 * Sets the value of the '{@link rover.CompassTrigger#getAngle <em>Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Angle value);

} // CompassTrigger
