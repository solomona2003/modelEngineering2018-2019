/**
 */
package rover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Rotate#getAngel <em>Angel</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends EObject {
	/**
	 * Returns the value of the '<em><b>Angel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angel</em>' attribute.
	 * @see #setAngel(int)
	 * @see rover.RoverPackage#getRotate_Angel()
	 * @model
	 * @generated
	 */
	int getAngel();

	/**
	 * Sets the value of the '{@link rover.Rotate#getAngel <em>Angel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angel</em>' attribute.
	 * @see #getAngel()
	 * @generated
	 */
	void setAngel(int value);

} // Rotate
