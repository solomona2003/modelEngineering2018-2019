/**
 */
package rover.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rover.Program;
import rover.Rover;
import rover.RoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.SystemImpl#getRover <em>Rover</em>}</li>
 *   <li>{@link rover.impl.SystemImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements rover.System {
	/**
	 * The cached value of the '{@link #getRover() <em>Rover</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRover()
	 * @generated
	 * @ordered
	 */
	protected EList<Rover> rover;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> program;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rover> getRover() {
		if (rover == null) {
			rover = new EObjectContainmentEList<Rover>(Rover.class, this, RoverPackage.SYSTEM__ROVER);
		}
		return rover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getProgram() {
		if (program == null) {
			program = new EObjectContainmentEList<Program>(Program.class, this, RoverPackage.SYSTEM__PROGRAM);
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.SYSTEM__ROVER:
			return ((InternalEList<?>) getRover()).basicRemove(otherEnd, msgs);
		case RoverPackage.SYSTEM__PROGRAM:
			return ((InternalEList<?>) getProgram()).basicRemove(otherEnd, msgs);
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
		case RoverPackage.SYSTEM__ROVER:
			return getRover();
		case RoverPackage.SYSTEM__PROGRAM:
			return getProgram();
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
		case RoverPackage.SYSTEM__ROVER:
			getRover().clear();
			getRover().addAll((Collection<? extends Rover>) newValue);
			return;
		case RoverPackage.SYSTEM__PROGRAM:
			getProgram().clear();
			getProgram().addAll((Collection<? extends Program>) newValue);
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
		case RoverPackage.SYSTEM__ROVER:
			getRover().clear();
			return;
		case RoverPackage.SYSTEM__PROGRAM:
			getProgram().clear();
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
		case RoverPackage.SYSTEM__ROVER:
			return rover != null && !rover.isEmpty();
		case RoverPackage.SYSTEM__PROGRAM:
			return program != null && !program.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
