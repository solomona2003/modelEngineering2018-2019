/**
 */
package rover.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rover.Actuator;
import rover.Light;
import rover.Motor;
import rover.RoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.ActuatorImpl#getMotor <em>Motor</em>}</li>
 *   <li>{@link rover.impl.ActuatorImpl#getLight <em>Light</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends ComponentImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getMotor() <em>Motor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> motor;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Light light;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getMotor() {
		if (motor == null) {
			motor = new EObjectContainmentEList<Motor>(Motor.class, this, RoverPackage.ACTUATOR__MOTOR);
		}
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLight(Light newLight, NotificationChain msgs) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverPackage.ACTUATOR__LIGHT,
					oldLight, newLight);
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
	public void setLight(Light newLight) {
		if (newLight != light) {
			NotificationChain msgs = null;
			if (light != null)
				msgs = ((InternalEObject) light).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoverPackage.ACTUATOR__LIGHT, null, msgs);
			if (newLight != null)
				msgs = ((InternalEObject) newLight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoverPackage.ACTUATOR__LIGHT, null, msgs);
			msgs = basicSetLight(newLight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.ACTUATOR__LIGHT, newLight, newLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.ACTUATOR__MOTOR:
			return ((InternalEList<?>) getMotor()).basicRemove(otherEnd, msgs);
		case RoverPackage.ACTUATOR__LIGHT:
			return basicSetLight(null, msgs);
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
		case RoverPackage.ACTUATOR__MOTOR:
			return getMotor();
		case RoverPackage.ACTUATOR__LIGHT:
			return getLight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RoverPackage.ACTUATOR__MOTOR:
			getMotor().clear();
			getMotor().addAll((Collection<? extends Motor>) newValue);
			return;
		case RoverPackage.ACTUATOR__LIGHT:
			setLight((Light) newValue);
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
		case RoverPackage.ACTUATOR__MOTOR:
			getMotor().clear();
			return;
		case RoverPackage.ACTUATOR__LIGHT:
			setLight((Light) null);
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
		case RoverPackage.ACTUATOR__MOTOR:
			return motor != null && !motor.isEmpty();
		case RoverPackage.ACTUATOR__LIGHT:
			return light != null;
		}
		return super.eIsSet(featureID);
	}

} //ActuatorImpl
