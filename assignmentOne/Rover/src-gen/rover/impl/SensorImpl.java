/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.DistanceSensor;
import rover.GPS;
import rover.RoverPackage;
import rover.Sensor;
import rover.Tansition;
import rover.directionFacing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.SensorImpl#getGps <em>Gps</em>}</li>
 *   <li>{@link rover.impl.SensorImpl#getDistancesensor <em>Distancesensor</em>}</li>
 *   <li>{@link rover.impl.SensorImpl#getCompass <em>Compass</em>}</li>
 *   <li>{@link rover.impl.SensorImpl#getTriggered <em>Triggered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ComponentImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getGps() <em>Gps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGps()
	 * @generated
	 * @ordered
	 */
	protected GPS gps;

	/**
	 * The cached value of the '{@link #getDistancesensor() <em>Distancesensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistancesensor()
	 * @generated
	 * @ordered
	 */
	protected DistanceSensor distancesensor;

	/**
	 * The cached value of the '{@link #getCompass() <em>Compass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
	protected directionFacing compass;

	/**
	 * The cached value of the '{@link #getTriggered() <em>Triggered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggered()
	 * @generated
	 * @ordered
	 */
	protected Tansition triggered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS getGps() {
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGps(GPS newGps, NotificationChain msgs) {
		GPS oldGps = gps;
		gps = newGps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverPackage.SENSOR__GPS,
					oldGps, newGps);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGps(GPS newGps) {
		if (newGps != gps) {
			NotificationChain msgs = null;
			if (gps != null)
				msgs = ((InternalEObject) gps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverPackage.SENSOR__GPS,
						null, msgs);
			if (newGps != null)
				msgs = ((InternalEObject) newGps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverPackage.SENSOR__GPS,
						null, msgs);
			msgs = basicSetGps(newGps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.SENSOR__GPS, newGps, newGps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensor getDistancesensor() {
		return distancesensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistancesensor(DistanceSensor newDistancesensor, NotificationChain msgs) {
		DistanceSensor oldDistancesensor = distancesensor;
		distancesensor = newDistancesensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoverPackage.SENSOR__DISTANCESENSOR, oldDistancesensor, newDistancesensor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistancesensor(DistanceSensor newDistancesensor) {
		if (newDistancesensor != distancesensor) {
			NotificationChain msgs = null;
			if (distancesensor != null)
				msgs = ((InternalEObject) distancesensor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoverPackage.SENSOR__DISTANCESENSOR, null, msgs);
			if (newDistancesensor != null)
				msgs = ((InternalEObject) newDistancesensor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoverPackage.SENSOR__DISTANCESENSOR, null, msgs);
			msgs = basicSetDistancesensor(newDistancesensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.SENSOR__DISTANCESENSOR,
					newDistancesensor, newDistancesensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public directionFacing getCompass() {
		if (compass != null && compass.eIsProxy()) {
			InternalEObject oldCompass = (InternalEObject) compass;
			compass = (directionFacing) eResolveProxy(oldCompass);
			if (compass != oldCompass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.SENSOR__COMPASS, oldCompass,
							compass));
			}
		}
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public directionFacing basicGetCompass() {
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompass(directionFacing newCompass) {
		directionFacing oldCompass = compass;
		compass = newCompass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.SENSOR__COMPASS, oldCompass, compass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tansition getTriggered() {
		if (triggered != null && triggered.eIsProxy()) {
			InternalEObject oldTriggered = (InternalEObject) triggered;
			triggered = (Tansition) eResolveProxy(oldTriggered);
			if (triggered != oldTriggered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.SENSOR__TRIGGERED,
							oldTriggered, triggered));
			}
		}
		return triggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tansition basicGetTriggered() {
		return triggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggered(Tansition newTriggered) {
		Tansition oldTriggered = triggered;
		triggered = newTriggered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.SENSOR__TRIGGERED, oldTriggered,
					triggered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.SENSOR__GPS:
			return basicSetGps(null, msgs);
		case RoverPackage.SENSOR__DISTANCESENSOR:
			return basicSetDistancesensor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.SENSOR__GPS:
			return getGps();
		case RoverPackage.SENSOR__DISTANCESENSOR:
			return getDistancesensor();
		case RoverPackage.SENSOR__COMPASS:
			if (resolve)
				return getCompass();
			return basicGetCompass();
		case RoverPackage.SENSOR__TRIGGERED:
			if (resolve)
				return getTriggered();
			return basicGetTriggered();
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
		case RoverPackage.SENSOR__GPS:
			setGps((GPS) newValue);
			return;
		case RoverPackage.SENSOR__DISTANCESENSOR:
			setDistancesensor((DistanceSensor) newValue);
			return;
		case RoverPackage.SENSOR__COMPASS:
			setCompass((directionFacing) newValue);
			return;
		case RoverPackage.SENSOR__TRIGGERED:
			setTriggered((Tansition) newValue);
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
		case RoverPackage.SENSOR__GPS:
			setGps((GPS) null);
			return;
		case RoverPackage.SENSOR__DISTANCESENSOR:
			setDistancesensor((DistanceSensor) null);
			return;
		case RoverPackage.SENSOR__COMPASS:
			setCompass((directionFacing) null);
			return;
		case RoverPackage.SENSOR__TRIGGERED:
			setTriggered((Tansition) null);
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
		case RoverPackage.SENSOR__GPS:
			return gps != null;
		case RoverPackage.SENSOR__DISTANCESENSOR:
			return distancesensor != null;
		case RoverPackage.SENSOR__COMPASS:
			return compass != null;
		case RoverPackage.SENSOR__TRIGGERED:
			return triggered != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
