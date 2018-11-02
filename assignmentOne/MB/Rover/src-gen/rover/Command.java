/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Command#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link rover.Command#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getCommand()
 * @model abstract="true"
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' reference list.
	 * The list contents are of type {@link rover.Transition}.
	 * It is bidirectional and its opposite is '{@link rover.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' reference list.
	 * @see rover.RoverPackage#getCommand_OutgoingTransition()
	 * @see rover.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link rover.Transition}.
	 * It is bidirectional and its opposite is '{@link rover.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see rover.RoverPackage#getCommand_IncomingTransition()
	 * @see rover.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

} // Command
