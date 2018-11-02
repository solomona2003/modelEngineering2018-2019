/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.Angle;
import rover.Rotate;
import rover.RoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.RotateImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotateImpl extends CommandImpl implements Rotate {
	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Angle angle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.ROTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle getAngle() {
		if (angle != null && angle.eIsProxy()) {
			InternalEObject oldAngle = (InternalEObject) angle;
			angle = (Angle) eResolveProxy(oldAngle);
			if (angle != oldAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.ROTATE__ANGLE, oldAngle,
							angle));
			}
		}
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle basicGetAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Angle newAngle) {
		Angle oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.ROTATE__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.ROTATE__ANGLE:
			if (resolve)
				return getAngle();
			return basicGetAngle();
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
		case RoverPackage.ROTATE__ANGLE:
			setAngle((Angle) newValue);
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
		case RoverPackage.ROTATE__ANGLE:
			setAngle((Angle) null);
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
		case RoverPackage.ROTATE__ANGLE:
			return angle != null;
		}
		return super.eIsSet(featureID);
	}

} //RotateImpl
