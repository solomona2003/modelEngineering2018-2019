/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Block#getCommand <em>Command</em>}</li>
 *   <li>{@link rover.Block#getTransition <em>Transition</em>}</li>
 *   <li>{@link rover.Block#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getBlock()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OCL_constraint_03'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OCL_constraint_03='self.command -&gt; select(t : Command | t.oclIsTypeOf(Terminate) ) -&gt; size() &lt;= 1'"
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see rover.RoverPackage#getBlock_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see rover.RoverPackage#getBlock_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' reference.
	 * @see #setRepeat(Repeat)
	 * @see rover.RoverPackage#getBlock_Repeat()
	 * @model
	 * @generated
	 */
	Repeat getRepeat();

	/**
	 * Sets the value of the '{@link rover.Block#getRepeat <em>Repeat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' reference.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(Repeat value);

} // Block
