/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.Length;
import rover.Motor;
import rover.Move;
import rover.RoverPackage;
import rover.Velocity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.MoveImpl#getMotor <em>Motor</em>}</li>
 *   <li>{@link rover.impl.MoveImpl#getLength <em>Length</em>}</li>
 *   <li>{@link rover.impl.MoveImpl#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends CommandImpl implements Move {
	/**
	 * The cached value of the '{@link #getMotor() <em>Motor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor()
	 * @generated
	 * @ordered
	 */
	protected Motor motor;

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
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected Velocity velocity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor getMotor() {
		if (motor != null && motor.eIsProxy()) {
			InternalEObject oldMotor = (InternalEObject) motor;
			motor = (Motor) eResolveProxy(oldMotor);
			if (motor != oldMotor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.MOVE__MOTOR, oldMotor,
							motor));
			}
		}
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor basicGetMotor() {
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor(Motor newMotor) {
		Motor oldMotor = motor;
		motor = newMotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.MOVE__MOTOR, oldMotor, motor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.MOVE__LENGTH, oldLength,
							length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.MOVE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity getVelocity() {
		if (velocity != null && velocity.eIsProxy()) {
			InternalEObject oldVelocity = (InternalEObject) velocity;
			velocity = (Velocity) eResolveProxy(oldVelocity);
			if (velocity != oldVelocity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.MOVE__VELOCITY, oldVelocity,
							velocity));
			}
		}
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity basicGetVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(Velocity newVelocity) {
		Velocity oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.MOVE__VELOCITY, oldVelocity, velocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.MOVE__MOTOR:
			if (resolve)
				return getMotor();
			return basicGetMotor();
		case RoverPackage.MOVE__LENGTH:
			if (resolve)
				return getLength();
			return basicGetLength();
		case RoverPackage.MOVE__VELOCITY:
			if (resolve)
				return getVelocity();
			return basicGetVelocity();
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
		case RoverPackage.MOVE__MOTOR:
			setMotor((Motor) newValue);
			return;
		case RoverPackage.MOVE__LENGTH:
			setLength((Length) newValue);
			return;
		case RoverPackage.MOVE__VELOCITY:
			setVelocity((Velocity) newValue);
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
		case RoverPackage.MOVE__MOTOR:
			setMotor((Motor) null);
			return;
		case RoverPackage.MOVE__LENGTH:
			setLength((Length) null);
			return;
		case RoverPackage.MOVE__VELOCITY:
			setVelocity((Velocity) null);
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
		case RoverPackage.MOVE__MOTOR:
			return motor != null;
		case RoverPackage.MOVE__LENGTH:
			return length != null;
		case RoverPackage.MOVE__VELOCITY:
			return velocity != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveImpl
