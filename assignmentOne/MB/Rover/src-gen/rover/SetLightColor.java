/**
 */
package rover;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.SetLightColor#getLight <em>Light</em>}</li>
 *   <li>{@link rover.SetLightColor#getLightColor <em>Light Color</em>}</li>
 * </ul>
 *
 * @see rover.RoverPackage#getSetLightColor()
 * @model
 * @generated
 */
public interface SetLightColor extends Command {
	/**
	 * Returns the value of the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' reference.
	 * @see #setLight(Light)
	 * @see rover.RoverPackage#getSetLightColor_Light()
	 * @model required="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link rover.SetLightColor#getLight <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

	/**
	 * Returns the value of the '<em><b>Light Color</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.ColorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Color</em>' attribute.
	 * @see rover.ColorKind
	 * @see #setLightColor(ColorKind)
	 * @see rover.RoverPackage#getSetLightColor_LightColor()
	 * @model
	 * @generated
	 */
	ColorKind getLightColor();

	/**
	 * Sets the value of the '{@link rover.SetLightColor#getLightColor <em>Light Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Color</em>' attribute.
	 * @see rover.ColorKind
	 * @see #getLightColor()
	 * @generated
	 */
	void setLightColor(ColorKind value);

} // SetLightColor
