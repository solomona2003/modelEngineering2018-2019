/**
 */
package rover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tansition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Tansition#getSourceCommand <em>Source Command</em>}</li>
 *   <li>{@link rover.Tansition#getTargetCommand <em>Target Command</em>}</li>
 *   <li>{@link rover.Tansition#getComparedQuantity <em>Compared Quantity</em>}</li>
 *   <li>{@link rover.Tansition#getOperationUsed <em>Operation Used</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getTansition()
 * @model
 * @generated
 */
public interface Tansition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rover.Command#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Command</em>' reference.
	 * @see #setSourceCommand(Command)
	 * @see rover.RoverPackage#getTansition_SourceCommand()
	 * @see rover.Command#getOutgoingTransition
	 * @model opposite="outgoingTransition"
	 * @generated
	 */
	Command getSourceCommand();

	/**
	 * Sets the value of the '{@link rover.Tansition#getSourceCommand <em>Source Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Command</em>' reference.
	 * @see #getSourceCommand()
	 * @generated
	 */
	void setSourceCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Target Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rover.Command#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Command</em>' reference.
	 * @see #setTargetCommand(Command)
	 * @see rover.RoverPackage#getTansition_TargetCommand()
	 * @see rover.Command#getIncomingTransition
	 * @model opposite="incomingTransition"
	 * @generated
	 */
	Command getTargetCommand();

	/**
	 * Sets the value of the '{@link rover.Tansition#getTargetCommand <em>Target Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Command</em>' reference.
	 * @see #getTargetCommand()
	 * @generated
	 */
	void setTargetCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Compared Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compared Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared Quantity</em>' attribute.
	 * @see #setComparedQuantity(String)
	 * @see rover.RoverPackage#getTansition_ComparedQuantity()
	 * @model
	 * @generated
	 */
	String getComparedQuantity();

	/**
	 * Sets the value of the '{@link rover.Tansition#getComparedQuantity <em>Compared Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compared Quantity</em>' attribute.
	 * @see #getComparedQuantity()
	 * @generated
	 */
	void setComparedQuantity(String value);

	/**
	 * Returns the value of the '<em><b>Operation Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Used</em>' attribute.
	 * @see #setOperationUsed(String)
	 * @see rover.RoverPackage#getTansition_OperationUsed()
	 * @model
	 * @generated
	 */
	String getOperationUsed();

	/**
	 * Sets the value of the '{@link rover.Tansition#getOperationUsed <em>Operation Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Used</em>' attribute.
	 * @see #getOperationUsed()
	 * @generated
	 */
	void setOperationUsed(String value);

} // Tansition
