/**
 */
package rover;

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
 *   <li>{@link rover.Command#getRepeate <em>Repeate</em>}</li>
 *   <li>{@link rover.Command#getTermintate <em>Termintate</em>}</li>
 *   <li>{@link rover.Command#getStart <em>Start</em>}</li>
 *   <li>{@link rover.Command#getRotate <em>Rotate</em>}</li>
 *   <li>{@link rover.Command#getMove <em>Move</em>}</li>
 *   <li>{@link rover.Command#getWait <em>Wait</em>}</li>
 *   <li>{@link rover.Command#getSetlightcolor <em>Setlightcolor</em>}</li>
 *   <li>{@link rover.Command#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link rover.Command#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Repeate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeate</em>' reference.
	 * @see #setRepeate(Repeate)
	 * @see rover.RoverPackage#getCommand_Repeate()
	 * @model
	 * @generated
	 */
	Repeate getRepeate();

	/**
	 * Sets the value of the '{@link rover.Command#getRepeate <em>Repeate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeate</em>' reference.
	 * @see #getRepeate()
	 * @generated
	 */
	void setRepeate(Repeate value);

	/**
	 * Returns the value of the '<em><b>Termintate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termintate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termintate</em>' reference.
	 * @see #setTermintate(Terminate)
	 * @see rover.RoverPackage#getCommand_Termintate()
	 * @model
	 * @generated
	 */
	Terminate getTermintate();

	/**
	 * Sets the value of the '{@link rover.Command#getTermintate <em>Termintate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termintate</em>' reference.
	 * @see #getTermintate()
	 * @generated
	 */
	void setTermintate(Terminate value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Start)
	 * @see rover.RoverPackage#getCommand_Start()
	 * @model
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link rover.Command#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotate</em>' reference.
	 * @see #setRotate(Rotate)
	 * @see rover.RoverPackage#getCommand_Rotate()
	 * @model
	 * @generated
	 */
	Rotate getRotate();

	/**
	 * Sets the value of the '{@link rover.Command#getRotate <em>Rotate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotate</em>' reference.
	 * @see #getRotate()
	 * @generated
	 */
	void setRotate(Rotate value);

	/**
	 * Returns the value of the '<em><b>Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move</em>' reference.
	 * @see #setMove(Move)
	 * @see rover.RoverPackage#getCommand_Move()
	 * @model
	 * @generated
	 */
	Move getMove();

	/**
	 * Sets the value of the '{@link rover.Command#getMove <em>Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move</em>' reference.
	 * @see #getMove()
	 * @generated
	 */
	void setMove(Move value);

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' reference.
	 * @see #setWait(Wait)
	 * @see rover.RoverPackage#getCommand_Wait()
	 * @model
	 * @generated
	 */
	Wait getWait();

	/**
	 * Sets the value of the '{@link rover.Command#getWait <em>Wait</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' reference.
	 * @see #getWait()
	 * @generated
	 */
	void setWait(Wait value);

	/**
	 * Returns the value of the '<em><b>Setlightcolor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setlightcolor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setlightcolor</em>' reference.
	 * @see #setSetlightcolor(SetLightColor)
	 * @see rover.RoverPackage#getCommand_Setlightcolor()
	 * @model
	 * @generated
	 */
	SetLightColor getSetlightcolor();

	/**
	 * Sets the value of the '{@link rover.Command#getSetlightcolor <em>Setlightcolor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setlightcolor</em>' reference.
	 * @see #getSetlightcolor()
	 * @generated
	 */
	void setSetlightcolor(SetLightColor value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rover.Tansition#getSourceCommand <em>Source Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' reference.
	 * @see #setOutgoingTransition(Tansition)
	 * @see rover.RoverPackage#getCommand_OutgoingTransition()
	 * @see rover.Tansition#getSourceCommand
	 * @model opposite="sourceCommand"
	 * @generated
	 */
	Tansition getOutgoingTransition();

	/**
	 * Sets the value of the '{@link rover.Command#getOutgoingTransition <em>Outgoing Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Transition</em>' reference.
	 * @see #getOutgoingTransition()
	 * @generated
	 */
	void setOutgoingTransition(Tansition value);

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rover.Tansition#getTargetCommand <em>Target Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference.
	 * @see #setIncomingTransition(Tansition)
	 * @see rover.RoverPackage#getCommand_IncomingTransition()
	 * @see rover.Tansition#getTargetCommand
	 * @model opposite="targetCommand"
	 * @generated
	 */
	Tansition getIncomingTransition();

	/**
	 * Sets the value of the '{@link rover.Command#getIncomingTransition <em>Incoming Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Transition</em>' reference.
	 * @see #getIncomingTransition()
	 * @generated
	 */
	void setIncomingTransition(Tansition value);

} // Command
