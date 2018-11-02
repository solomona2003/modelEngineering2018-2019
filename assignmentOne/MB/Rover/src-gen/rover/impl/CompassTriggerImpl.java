/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.Angle;
import rover.Compass;
import rover.CompassTrigger;
import rover.RoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compass Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.CompassTriggerImpl#getCompass <em>Compass</em>}</li>
 *   <li>{@link rover.impl.CompassTriggerImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompassTriggerImpl extends TriggeredTransitionImpl implements CompassTrigger {
	/**
	 * The cached value of the '{@link #getCompass() <em>Compass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
	protected Compass compass;

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
	protected CompassTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.COMPASS_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compass getCompass() {
		if (compass != null && compass.eIsProxy()) {
			InternalEObject oldCompass = (InternalEObject) compass;
			compass = (Compass) eResolveProxy(oldCompass);
			if (compass != oldCompass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMPASS_TRIGGER__COMPASS,
							oldCompass, compass));
			}
		}
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compass basicGetCompass() {
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompass(Compass newCompass) {
		Compass oldCompass = compass;
		compass = newCompass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMPASS_TRIGGER__COMPASS, oldCompass,
					compass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMPASS_TRIGGER__ANGLE,
							oldAngle, angle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMPASS_TRIGGER__ANGLE, oldAngle,
					angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.COMPASS_TRIGGER__COMPASS:
			if (resolve)
				return getCompass();
			return basicGetCompass();
		case RoverPackage.COMPASS_TRIGGER__ANGLE:
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
		case RoverPackage.COMPASS_TRIGGER__COMPASS:
			setCompass((Compass) newValue);
			return;
		case RoverPackage.COMPASS_TRIGGER__ANGLE:
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
		case RoverPackage.COMPASS_TRIGGER__COMPASS:
			setCompass((Compass) null);
			return;
		case RoverPackage.COMPASS_TRIGGER__ANGLE:
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
		case RoverPackage.COMPASS_TRIGGER__COMPASS:
			return compass != null;
		case RoverPackage.COMPASS_TRIGGER__ANGLE:
			return angle != null;
		}
		return super.eIsSet(featureID);
	}

} //CompassTriggerImpl
