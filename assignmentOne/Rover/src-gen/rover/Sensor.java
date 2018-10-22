/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Sensor#getGps <em>Gps</em>}</li>
 *   <li>{@link rover.Sensor#getDistancesensor <em>Distancesensor</em>}</li>
 *   <li>{@link rover.Sensor#getCompass <em>Compass</em>}</li>
 *   <li>{@link rover.Sensor#getTriggered <em>Triggered</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Component {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' containment reference.
	 * @see #setGps(GPS)
	 * @see rover.RoverPackage#getSensor_Gps()
	 * @model containment="true"
	 * @generated
	 */
	GPS getGps();

	/**
	 * Sets the value of the '{@link rover.Sensor#getGps <em>Gps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' containment reference.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(GPS value);

	/**
	 * Returns the value of the '<em><b>Distancesensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distancesensor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distancesensor</em>' containment reference.
	 * @see #setDistancesensor(DistanceSensor)
	 * @see rover.RoverPackage#getSensor_Distancesensor()
	 * @model containment="true"
	 * @generated
	 */
	DistanceSensor getDistancesensor();

	/**
	 * Sets the value of the '{@link rover.Sensor#getDistancesensor <em>Distancesensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distancesensor</em>' containment reference.
	 * @see #getDistancesensor()
	 * @generated
	 */
	void setDistancesensor(DistanceSensor value);

	/**
	 * Returns the value of the '<em><b>Compass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass</em>' reference.
	 * @see #setCompass(directionFacing)
	 * @see rover.RoverPackage#getSensor_Compass()
	 * @model
	 * @generated
	 */
	directionFacing getCompass();

	/**
	 * Sets the value of the '{@link rover.Sensor#getCompass <em>Compass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass</em>' reference.
	 * @see #getCompass()
	 * @generated
	 */
	void setCompass(directionFacing value);

	/**
	 * Returns the value of the '<em><b>Triggered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered</em>' reference.
	 * @see #setTriggered(Tansition)
	 * @see rover.RoverPackage#getSensor_Triggered()
	 * @model
	 * @generated
	 */
	Tansition getTriggered();

	/**
	 * Sets the value of the '{@link rover.Sensor#getTriggered <em>Triggered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered</em>' reference.
	 * @see #getTriggered()
	 * @generated
	 */
	void setTriggered(Tansition value);

} // Sensor
