/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rover.RoverPackage;
import rover.directionFacing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>direction Facing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.directionFacingImpl#getCurrentlyFacing <em>Currently Facing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class directionFacingImpl extends MinimalEObjectImpl.Container implements directionFacing {
	/**
	 * The default value of the '{@link #getCurrentlyFacing() <em>Currently Facing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyFacing()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENTLY_FACING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentlyFacing() <em>Currently Facing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyFacing()
	 * @generated
	 * @ordered
	 */
	protected float currentlyFacing = CURRENTLY_FACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected directionFacingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.DIRECTION_FACING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentlyFacing() {
		return currentlyFacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentlyFacing(float newCurrentlyFacing) {
		float oldCurrentlyFacing = currentlyFacing;
		currentlyFacing = newCurrentlyFacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.DIRECTION_FACING__CURRENTLY_FACING,
					oldCurrentlyFacing, currentlyFacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoverPackage.DIRECTION_FACING__CURRENTLY_FACING:
			return getCurrentlyFacing();
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
		case RoverPackage.DIRECTION_FACING__CURRENTLY_FACING:
			setCurrentlyFacing((Float) newValue);
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
		case RoverPackage.DIRECTION_FACING__CURRENTLY_FACING:
			setCurrentlyFacing(CURRENTLY_FACING_EDEFAULT);
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
		case RoverPackage.DIRECTION_FACING__CURRENTLY_FACING:
			return currentlyFacing != CURRENTLY_FACING_EDEFAULT;
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
		result.append(" (currentlyFacing: ");
		result.append(currentlyFacing);
		result.append(')');
		return result.toString();
	}

} //directionFacingImpl
