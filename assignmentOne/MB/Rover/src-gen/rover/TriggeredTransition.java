/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggered Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.TriggeredTransition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getTriggeredTransition()
 * @model abstract="true"
 * @generated
 */
public interface TriggeredTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see rover.Operator
	 * @see #setOperator(Operator)
	 * @see rover.RoverPackage#getTriggeredTransition_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link rover.TriggeredTransition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see rover.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // TriggeredTransition
