/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Wait#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends Command {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(Time)
	 * @see rover.RoverPackage#getWait_Time()
	 * @model required="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link rover.Wait#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // Wait
