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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rover.Block;
import rover.Command;
import rover.Repeat;
import rover.RoverPackage;
import rover.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.BlockImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link rover.impl.BlockImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link rover.impl.BlockImpl#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> command;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected Repeat repeat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Command>(Command.class, this, RoverPackage.BLOCK__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					RoverPackage.BLOCK__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat getRepeat() {
		if (repeat != null && repeat.eIsProxy()) {
			InternalEObject oldRepeat = (InternalEObject) repeat;
			repeat = (Repeat) eResolveProxy(oldRepeat);
			if (repeat != oldRepeat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.BLOCK__REPEAT, oldRepeat,
							repeat));
			}
		}
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat basicGetRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(Repeat newRepeat) {
		Repeat oldRepeat = repeat;
		repeat = newRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.BLOCK__REPEAT, oldRepeat, repeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.BLOCK__COMMAND:
			return ((InternalEList<?>) getCommand()).basicRemove(otherEnd, msgs);
		case RoverPackage.BLOCK__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
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
		case RoverPackage.BLOCK__COMMAND:
			return getCommand();
		case RoverPackage.BLOCK__TRANSITION:
			return getTransition();
		case RoverPackage.BLOCK__REPEAT:
			if (resolve)
				return getRepeat();
			return basicGetRepeat();
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
		case RoverPackage.BLOCK__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends Command>) newValue);
			return;
		case RoverPackage.BLOCK__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case RoverPackage.BLOCK__REPEAT:
			setRepeat((Repeat) newValue);
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
		case RoverPackage.BLOCK__COMMAND:
			getCommand().clear();
			return;
		case RoverPackage.BLOCK__TRANSITION:
			getTransition().clear();
			return;
		case RoverPackage.BLOCK__REPEAT:
			setRepeat((Repeat) null);
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
		case RoverPackage.BLOCK__COMMAND:
			return command != null && !command.isEmpty();
		case RoverPackage.BLOCK__TRANSITION:
			return transition != null && !transition.isEmpty();
		case RoverPackage.BLOCK__REPEAT:
			return repeat != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
