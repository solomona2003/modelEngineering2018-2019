/**
 */
package rover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Position#getX <em>X</em>}</li>
 *   <li>{@link rover.Position#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(Length)
	 * @see rover.RoverPackage#getPosition_X()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Length getX();

	/**
	 * Sets the value of the '{@link rover.Position#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Length value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference list.
	 * The list contents are of type {@link rover.Length}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference list.
	 * @see rover.RoverPackage#getPosition_Y()
	 * @model containment="true"
	 * @generated
	 */
	EList<Length> getY();

} // Position
