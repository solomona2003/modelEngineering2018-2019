/**
 */
package rover.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rover.Command;
import rover.RoverPackage;
import rover.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.CommandImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransition;

	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransition() {
		if (outgoingTransition == null) {
			outgoingTransition = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					RoverPackage.COMMAND__OUTGOING_TRANSITION, RoverPackage.TRANSITION__SOURCE);
		}
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransition() {
		if (incomingTransition == null) {
			incomingTransition = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					RoverPackage.COMMAND__INCOMING_TRANSITION, RoverPackage.TRANSITION__TARGET);
		}
		return incomingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingTransition()).basicAdd(otherEnd,
					msgs);
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingTransition()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			return ((InternalEList<?>) getOutgoingTransition()).basicRemove(otherEnd, msgs);
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			return ((InternalEList<?>) getIncomingTransition()).basicRemove(otherEnd, msgs);
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
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			return getOutgoingTransition();
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			return getIncomingTransition();
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
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			getOutgoingTransition().clear();
			getOutgoingTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			getIncomingTransition().clear();
			getIncomingTransition().addAll((Collection<? extends Transition>) newValue);
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
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			getOutgoingTransition().clear();
			return;
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			getIncomingTransition().clear();
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
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			return outgoingTransition != null && !outgoingTransition.isEmpty();
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			return incomingTransition != null && !incomingTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandImpl
