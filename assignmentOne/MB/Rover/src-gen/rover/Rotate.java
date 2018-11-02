/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Rotate#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getRotate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OCL_constraint_02_2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OCL_constraint_02_2='self.incomingTransition.source &lt;&gt; self'"
 * @generated
 */
public interface Rotate extends Command {
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
	 * @see rover.RoverPackage#getRotate_Angle()
	 * @model required="true"
	 * @generated
	 */
	Angle getAngle();

	/**
	 * Sets the value of the '{@link rover.Rotate#getAngle <em>Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Angle value);

} // Rotate
