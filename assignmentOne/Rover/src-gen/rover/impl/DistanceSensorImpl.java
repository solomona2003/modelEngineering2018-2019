/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rover.DistanceSensor;
import rover.RoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.DistanceSensorImpl#getRemainingDistance <em>Remaining Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceSensorImpl extends MinimalEObjectImpl.Container implements DistanceSensor {
	/**
	 * The default value of the '{@link #getRemainingDistance() <em>Remaining Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float REMAINING_DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRemainingDistance() <em>Remaining Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingDistance()
	 * @generated
	 * @ordered
	 */
	protected float remainingDistance = REMAINING_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.DISTANCE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingDistance() {
		return remainingDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingDistance(float newRemainingDistance) {
		float oldRemainingDistance = remainingDistance;
		remainingDistance = newRemainingDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.DISTANCE_SENSOR__REMAINING_DISTANCE,
					oldRemainingDistance, remainingDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.DISTANCE_SENSOR__REMAINING_DISTANCE:
			return getRemainingDistance();
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
		case RoverPackage.DISTANCE_SENSOR__REMAINING_DISTANCE:
			setRemainingDistance((Float) newValue);
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
		case RoverPackage.DISTANCE_SENSOR__REMAINING_DISTANCE:
			setRemainingDistance(REMAINING_DISTANCE_EDEFAULT);
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
		case RoverPackage.DISTANCE_SENSOR__REMAINING_DISTANCE:
			return remainingDistance != REMAINING_DISTANCE_EDEFAULT;
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
		result.append(" (remainingDistance: ");
		result.append(remainingDistance);
		result.append(')');
		return result.toString();
	}

} //DistanceSensorImpl
