/**
 */
package rover.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rover.Command;
import rover.RoverPackage;
import rover.Tansition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tansition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.TansitionImpl#getSourceCommand <em>Source Command</em>}</li>
 *   <li>{@link rover.impl.TansitionImpl#getTargetCommand <em>Target Command</em>}</li>
 *   <li>{@link rover.impl.TansitionImpl#getComparedQuantity <em>Compared Quantity</em>}</li>
 *   <li>{@link rover.impl.TansitionImpl#getOperationUsed <em>Operation Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TansitionImpl extends MinimalEObjectImpl.Container implements Tansition {
	/**
	 * The cached value of the '{@link #getSourceCommand() <em>Source Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCommand()
	 * @generated
	 * @ordered
	 */
	protected Command sourceCommand;

	/**
	 * The cached value of the '{@link #getTargetCommand() <em>Target Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCommand()
	 * @generated
	 * @ordered
	 */
	protected Command targetCommand;

	/**
	 * The default value of the '{@link #getComparedQuantity() <em>Compared Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARED_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparedQuantity() <em>Compared Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedQuantity()
	 * @generated
	 * @ordered
	 */
	protected String comparedQuantity = COMPARED_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationUsed() <em>Operation Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationUsed()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationUsed() <em>Operation Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationUsed()
	 * @generated
	 * @ordered
	 */
	protected String operationUsed = OPERATION_USED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TansitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.TANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getSourceCommand() {
		if (sourceCommand != null && sourceCommand.eIsProxy()) {
			InternalEObject oldSourceCommand = (InternalEObject) sourceCommand;
			sourceCommand = (Command) eResolveProxy(oldSourceCommand);
			if (sourceCommand != oldSourceCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.TANSITION__SOURCE_COMMAND,
							oldSourceCommand, sourceCommand));
			}
		}
		return sourceCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetSourceCommand() {
		return sourceCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCommand(Command newSourceCommand, NotificationChain msgs) {
		Command oldSourceCommand = sourceCommand;
		sourceCommand = newSourceCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoverPackage.TANSITION__SOURCE_COMMAND, oldSourceCommand, newSourceCommand);
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
	public void setSourceCommand(Command newSourceCommand) {
		if (newSourceCommand != sourceCommand) {
			NotificationChain msgs = null;
			if (sourceCommand != null)
				msgs = ((InternalEObject) sourceCommand).eInverseRemove(this, RoverPackage.COMMAND__OUTGOING_TRANSITION,
						Command.class, msgs);
			if (newSourceCommand != null)
				msgs = ((InternalEObject) newSourceCommand).eInverseAdd(this, RoverPackage.COMMAND__OUTGOING_TRANSITION,
						Command.class, msgs);
			msgs = basicSetSourceCommand(newSourceCommand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.TANSITION__SOURCE_COMMAND,
					newSourceCommand, newSourceCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getTargetCommand() {
		if (targetCommand != null && targetCommand.eIsProxy()) {
			InternalEObject oldTargetCommand = (InternalEObject) targetCommand;
			targetCommand = (Command) eResolveProxy(oldTargetCommand);
			if (targetCommand != oldTargetCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.TANSITION__TARGET_COMMAND,
							oldTargetCommand, targetCommand));
			}
		}
		return targetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetTargetCommand() {
		return targetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetCommand(Command newTargetCommand, NotificationChain msgs) {
		Command oldTargetCommand = targetCommand;
		targetCommand = newTargetCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoverPackage.TANSITION__TARGET_COMMAND, oldTargetCommand, newTargetCommand);
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
	public void setTargetCommand(Command newTargetCommand) {
		if (newTargetCommand != targetCommand) {
			NotificationChain msgs = null;
			if (targetCommand != null)
				msgs = ((InternalEObject) targetCommand).eInverseRemove(this, RoverPackage.COMMAND__INCOMING_TRANSITION,
						Command.class, msgs);
			if (newTargetCommand != null)
				msgs = ((InternalEObject) newTargetCommand).eInverseAdd(this, RoverPackage.COMMAND__INCOMING_TRANSITION,
						Command.class, msgs);
			msgs = basicSetTargetCommand(newTargetCommand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.TANSITION__TARGET_COMMAND,
					newTargetCommand, newTargetCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparedQuantity() {
		return comparedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparedQuantity(String newComparedQuantity) {
		String oldComparedQuantity = comparedQuantity;
		comparedQuantity = newComparedQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.TANSITION__COMPARED_QUANTITY,
					oldComparedQuantity, comparedQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationUsed() {
		return operationUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationUsed(String newOperationUsed) {
		String oldOperationUsed = operationUsed;
		operationUsed = newOperationUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.TANSITION__OPERATION_USED,
					oldOperationUsed, operationUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.TANSITION__SOURCE_COMMAND:
			if (sourceCommand != null)
				msgs = ((InternalEObject) sourceCommand).eInverseRemove(this, RoverPackage.COMMAND__OUTGOING_TRANSITION,
						Command.class, msgs);
			return basicSetSourceCommand((Command) otherEnd, msgs);
		case RoverPackage.TANSITION__TARGET_COMMAND:
			if (targetCommand != null)
				msgs = ((InternalEObject) targetCommand).eInverseRemove(this, RoverPackage.COMMAND__INCOMING_TRANSITION,
						Command.class, msgs);
			return basicSetTargetCommand((Command) otherEnd, msgs);
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
		case RoverPackage.TANSITION__SOURCE_COMMAND:
			return basicSetSourceCommand(null, msgs);
		case RoverPackage.TANSITION__TARGET_COMMAND:
			return basicSetTargetCommand(null, msgs);
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
		case RoverPackage.TANSITION__SOURCE_COMMAND:
			if (resolve)
				return getSourceCommand();
			return basicGetSourceCommand();
		case RoverPackage.TANSITION__TARGET_COMMAND:
			if (resolve)
				return getTargetCommand();
			return basicGetTargetCommand();
		case RoverPackage.TANSITION__COMPARED_QUANTITY:
			return getComparedQuantity();
		case RoverPackage.TANSITION__OPERATION_USED:
			return getOperationUsed();
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
		case RoverPackage.TANSITION__SOURCE_COMMAND:
			setSourceCommand((Command) newValue);
			return;
		case RoverPackage.TANSITION__TARGET_COMMAND:
			setTargetCommand((Command) newValue);
			return;
		case RoverPackage.TANSITION__COMPARED_QUANTITY:
			setComparedQuantity((String) newValue);
			return;
		case RoverPackage.TANSITION__OPERATION_USED:
			setOperationUsed((String) newValue);
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
		case RoverPackage.TANSITION__SOURCE_COMMAND:
			setSourceCommand((Command) null);
			return;
		case RoverPackage.TANSITION__TARGET_COMMAND:
			setTargetCommand((Command) null);
			return;
		case RoverPackage.TANSITION__COMPARED_QUANTITY:
			setComparedQuantity(COMPARED_QUANTITY_EDEFAULT);
			return;
		case RoverPackage.TANSITION__OPERATION_USED:
			setOperationUsed(OPERATION_USED_EDEFAULT);
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
		case RoverPackage.TANSITION__SOURCE_COMMAND:
			return sourceCommand != null;
		case RoverPackage.TANSITION__TARGET_COMMAND:
			return targetCommand != null;
		case RoverPackage.TANSITION__COMPARED_QUANTITY:
			return COMPARED_QUANTITY_EDEFAULT == null ? comparedQuantity != null
					: !COMPARED_QUANTITY_EDEFAULT.equals(comparedQuantity);
		case RoverPackage.TANSITION__OPERATION_USED:
			return OPERATION_USED_EDEFAULT == null ? operationUsed != null
					: !OPERATION_USED_EDEFAULT.equals(operationUsed);
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
		result.append(" (comparedQuantity: ");
		result.append(comparedQuantity);
		result.append(", operationUsed: ");
		result.append(operationUsed);
		result.append(')');
		return result.toString();
	}

} //TansitionImpl
