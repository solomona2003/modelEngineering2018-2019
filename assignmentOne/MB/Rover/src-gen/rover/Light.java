/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.Light#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getLight()
 * @model
 * @generated
 */
public interface Light extends Actuator {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.ColorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see rover.ColorKind
	 * @see #setColor(ColorKind)
	 * @see rover.RoverPackage#getLight_Color()
	 * @model required="true"
	 * @generated
	 */
	ColorKind getColor();

	/**
	 * Sets the value of the '{@link rover.Light#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see rover.ColorKind
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorKind value);

} // Light
