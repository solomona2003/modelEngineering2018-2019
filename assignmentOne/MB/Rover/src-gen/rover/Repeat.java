/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Repeat#getCount <em>Count</em>}</li>
 *   <li>{@link rover.Repeat#getSetlightcolor <em>Setlightcolor</em>}</li>
 *   <li>{@link rover.Repeat#getWait <em>Wait</em>}</li>
 *   <li>{@link rover.Repeat#getMove <em>Move</em>}</li>
 *   <li>{@link rover.Repeat#getRotate <em>Rotate</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getRepeat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OCL_constraint_05'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OCL_constraint_05='self.count &gt; 0'"
 * @generated
 */
public interface Repeat extends Command {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see rover.RoverPackage#getRepeat_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link rover.Repeat#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Setlightcolor</b></em>' containment reference list.
	 * The list contents are of type {@link rover.SetLightColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setlightcolor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setlightcolor</em>' containment reference list.
	 * @see rover.RoverPackage#getRepeat_Setlightcolor()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetLightColor> getSetlightcolor();

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Wait}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' containment reference list.
	 * @see rover.RoverPackage#getRepeat_Wait()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wait> getWait();

	/**
	 * Returns the value of the '<em><b>Move</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move</em>' containment reference list.
	 * @see rover.RoverPackage#getRepeat_Move()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMove();

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Rotate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotate</em>' containment reference list.
	 * @see rover.RoverPackage#getRepeat_Rotate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rotate> getRotate();

} // Repeat
