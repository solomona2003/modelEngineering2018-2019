/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.ColorKind;
import rover.Light;
import rover.RoverPackage;
import rover.SetLightColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.SetLightColorImpl#getLight <em>Light</em>}</li>
 *   <li>{@link rover.impl.SetLightColorImpl#getLightColor <em>Light Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetLightColorImpl extends CommandImpl implements SetLightColor {
	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Light light;

	/**
	 * The default value of the '{@link #getLightColor() <em>Light Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorKind LIGHT_COLOR_EDEFAULT = ColorKind.NONE;

	/**
	 * The cached value of the '{@link #getLightColor() <em>Light Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightColor()
	 * @generated
	 * @ordered
	 */
	protected ColorKind lightColor = LIGHT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLightColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.SET_LIGHT_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light getLight() {
		if (light != null && light.eIsProxy()) {
			InternalEObject oldLight = (InternalEObject) light;
			light = (Light) eResolveProxy(oldLight);
			if (light != oldLight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.SET_LIGHT_COLOR__LIGHT,
							oldLight, light));
			}
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light basicGetLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(Light newLight) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.SET_LIGHT_COLOR__LIGHT, oldLight,
					light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorKind getLightColor() {
		return lightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightColor(ColorKind newLightColor) {
		ColorKind oldLightColor = lightColor;
		lightColor = newLightColor == null ? LIGHT_COLOR_EDEFAULT : newLightColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.SET_LIGHT_COLOR__LIGHT_COLOR,
					oldLightColor, lightColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.SET_LIGHT_COLOR__LIGHT:
			if (resolve)
				return getLight();
			return basicGetLight();
		case RoverPackage.SET_LIGHT_COLOR__LIGHT_COLOR:
			return getLightColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RoverPackage.SET_LIGHT_COLOR__LIGHT:
			setLight((Light) newValue);
			return;
		case RoverPackage.SET_LIGHT_COLOR__LIGHT_COLOR:
			setLightColor((ColorKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RoverPackage.SET_LIGHT_COLOR__LIGHT:
			setLight((Light) null);
			return;
		case RoverPackage.SET_LIGHT_COLOR__LIGHT_COLOR:
			setLightColor(LIGHT_COLOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RoverPackage.SET_LIGHT_COLOR__LIGHT:
			return light != null;
		case RoverPackage.SET_LIGHT_COLOR__LIGHT_COLOR:
			return lightColor != LIGHT_COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lightColor: ");
		result.append(lightColor);
		result.append(')');
		return result.toString();
	}

} //SetLightColorImpl
