/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Move#getMotor <em>Motor</em>}</li>
 *   <li>{@link rover.Move#getLength <em>Length</em>}</li>
 *   <li>{@link rover.Move#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Command {
	/**
	 * Returns the value of the '<em><b>Motor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor</em>' reference.
	 * @see #setMotor(Motor)
	 * @see rover.RoverPackage#getMove_Motor()
	 * @model required="true"
	 * @generated
	 */
	Motor getMotor();

	/**
	 * Sets the value of the '{@link rover.Move#getMotor <em>Motor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor</em>' reference.
	 * @see #getMotor()
	 * @generated
	 */
	void setMotor(Motor value);

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
	 * @see rover.RoverPackage#getMove_Length()
	 * @model
	 * @generated
	 */
	Length getLength();

	/**
	 * Sets the value of the '{@link rover.Move#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Length value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' reference.
	 * @see #setVelocity(Velocity)
	 * @see rover.RoverPackage#getMove_Velocity()
	 * @model required="true"
	 * @generated
	 */
	Velocity getVelocity();

	/**
	 * Sets the value of the '{@link rover.Move#getVelocity <em>Velocity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' reference.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(Velocity value);

} // Move
