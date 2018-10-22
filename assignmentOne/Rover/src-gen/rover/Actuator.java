/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Actuator#getMotor <em>Motor</em>}</li>
 *   <li>{@link rover.Actuator#getLight <em>Light</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Component {
	/**
	 * Returns the value of the '<em><b>Motor</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor</em>' containment reference list.
	 * @see rover.RoverPackage#getActuator_Motor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Motor> getMotor();

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(Light)
	 * @see rover.RoverPackage#getActuator_Light()
	 * @model containment="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link rover.Actuator#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

} // Actuator
