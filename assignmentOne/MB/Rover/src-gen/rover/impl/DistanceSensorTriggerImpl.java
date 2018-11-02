/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.Distance;
import rover.DistanceSensorTrigger;
import rover.Length;
import rover.RoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Sensor Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.DistanceSensorTriggerImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link rover.impl.DistanceSensorTriggerImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceSensorTriggerImpl extends TriggeredTransitionImpl implements DistanceSensorTrigger {
	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance distance;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Length length;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.DISTANCE_SENSOR_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance getDistance() {
		if (distance != null && distance.eIsProxy()) {
			InternalEObject oldDistance = (InternalEObject) distance;
			distance = (Distance) eResolveProxy(oldDistance);
			if (distance != oldDistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RoverPackage.DISTANCE_SENSOR_TRIGGER__DISTANCE, oldDistance, distance));
			}
		}
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance basicGetDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(Distance newDistance) {
		Distance oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.DISTANCE_SENSOR_TRIGGER__DISTANCE,
					oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getLength() {
		if (length != null && length.eIsProxy()) {
			InternalEObject oldLength = (InternalEObject) length;
			length = (Length) eResolveProxy(oldLength);
			if (length != oldLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RoverPackage.DISTANCE_SENSOR_TRIGGER__LENGTH, oldLength, length));
			}
		}
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length basicGetLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Length newLength) {
		Length oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.DISTANCE_SENSOR_TRIGGER__LENGTH,
					oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__DISTANCE:
			if (resolve)
				return getDistance();
			return basicGetDistance();
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			if (resolve)
				return getLength();
			return basicGetLength();
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
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__DISTANCE:
			setDistance((Distance) newValue);
			return;
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			setLength((Length) newValue);
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
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__DISTANCE:
			setDistance((Distance) null);
			return;
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			setLength((Length) null);
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
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__DISTANCE:
			return distance != null;
		case RoverPackage.DISTANCE_SENSOR_TRIGGER__LENGTH:
			return length != null;
		}
		return super.eIsSet(featureID);
	}

} //DistanceSensorTriggerImpl
