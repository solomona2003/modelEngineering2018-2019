/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Distance#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getDistance()
 * @model
 * @generated
 */
public interface Distance extends Sensor {
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
	 * @see rover.RoverPackage#getDistance_Length()
	 * @model required="true"
	 * @generated
	 */
	Length getLength();

	/**
	 * Sets the value of the '{@link rover.Distance#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Length value);

} // Distance
