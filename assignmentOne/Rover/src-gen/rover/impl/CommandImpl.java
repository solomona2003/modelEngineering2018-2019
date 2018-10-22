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
import rover.Move;
import rover.Repeate;
import rover.Rotate;
import rover.RoverPackage;
import rover.SetLightColor;
import rover.Start;
import rover.Tansition;
import rover.Terminate;
import rover.Wait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.CommandImpl#getRepeate <em>Repeate</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getTermintate <em>Termintate</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getStart <em>Start</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getMove <em>Move</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getSetlightcolor <em>Setlightcolor</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link rover.impl.CommandImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * The cached value of the '{@link #getRepeate() <em>Repeate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeate()
	 * @generated
	 * @ordered
	 */
	protected Repeate repeate;

	/**
	 * The cached value of the '{@link #getTermintate() <em>Termintate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermintate()
	 * @generated
	 * @ordered
	 */
	protected Terminate termintate;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getRotate() <em>Rotate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected Rotate rotate;

	/**
	 * The cached value of the '{@link #getMove() <em>Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove()
	 * @generated
	 * @ordered
	 */
	protected Move move;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected Wait wait;

	/**
	 * The cached value of the '{@link #getSetlightcolor() <em>Setlightcolor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetlightcolor()
	 * @generated
	 * @ordered
	 */
	protected SetLightColor setlightcolor;

	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected Tansition outgoingTransition;

	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected Tansition incomingTransition;

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
	public Repeate getRepeate() {
		if (repeate != null && repeate.eIsProxy()) {
			InternalEObject oldRepeate = (InternalEObject) repeate;
			repeate = (Repeate) eResolveProxy(oldRepeate);
			if (repeate != oldRepeate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__REPEATE, oldRepeate,
							repeate));
			}
		}
		return repeate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeate basicGetRepeate() {
		return repeate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeate(Repeate newRepeate) {
		Repeate oldRepeate = repeate;
		repeate = newRepeate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__REPEATE, oldRepeate, repeate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminate getTermintate() {
		if (termintate != null && termintate.eIsProxy()) {
			InternalEObject oldTermintate = (InternalEObject) termintate;
			termintate = (Terminate) eResolveProxy(oldTermintate);
			if (termintate != oldTermintate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__TERMINTATE,
							oldTermintate, termintate));
			}
		}
		return termintate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminate basicGetTermintate() {
		return termintate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermintate(Terminate newTermintate) {
		Terminate oldTermintate = termintate;
		termintate = newTermintate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__TERMINTATE, oldTermintate,
					termintate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (Start) eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__START, oldStart,
							start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Start newStart) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate getRotate() {
		if (rotate != null && rotate.eIsProxy()) {
			InternalEObject oldRotate = (InternalEObject) rotate;
			rotate = (Rotate) eResolveProxy(oldRotate);
			if (rotate != oldRotate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__ROTATE, oldRotate,
							rotate));
			}
		}
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate basicGetRotate() {
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotate(Rotate newRotate) {
		Rotate oldRotate = rotate;
		rotate = newRotate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__ROTATE, oldRotate, rotate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getMove() {
		if (move != null && move.eIsProxy()) {
			InternalEObject oldMove = (InternalEObject) move;
			move = (Move) eResolveProxy(oldMove);
			if (move != oldMove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__MOVE, oldMove,
							move));
			}
		}
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetMove() {
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMove(Move newMove) {
		Move oldMove = move;
		move = newMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__MOVE, oldMove, move));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait getWait() {
		if (wait != null && wait.eIsProxy()) {
			InternalEObject oldWait = (InternalEObject) wait;
			wait = (Wait) eResolveProxy(oldWait);
			if (wait != oldWait) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__WAIT, oldWait,
							wait));
			}
		}
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait basicGetWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(Wait newWait) {
		Wait oldWait = wait;
		wait = newWait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__WAIT, oldWait, wait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLightColor getSetlightcolor() {
		if (setlightcolor != null && setlightcolor.eIsProxy()) {
			InternalEObject oldSetlightcolor = (InternalEObject) setlightcolor;
			setlightcolor = (SetLightColor) eResolveProxy(oldSetlightcolor);
			if (setlightcolor != oldSetlightcolor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__SETLIGHTCOLOR,
							oldSetlightcolor, setlightcolor));
			}
		}
		return setlightcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLightColor basicGetSetlightcolor() {
		return setlightcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetlightcolor(SetLightColor newSetlightcolor) {
		SetLightColor oldSetlightcolor = setlightcolor;
		setlightcolor = newSetlightcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__SETLIGHTCOLOR, oldSetlightcolor,
					setlightcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tansition getOutgoingTransition() {
		if (outgoingTransition != null && outgoingTransition.eIsProxy()) {
			InternalEObject oldOutgoingTransition = (InternalEObject) outgoingTransition;
			outgoingTransition = (Tansition) eResolveProxy(oldOutgoingTransition);
			if (outgoingTransition != oldOutgoingTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__OUTGOING_TRANSITION,
							oldOutgoingTransition, outgoingTransition));
			}
		}
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tansition basicGetOutgoingTransition() {
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingTransition(Tansition newOutgoingTransition, NotificationChain msgs) {
		Tansition oldOutgoingTransition = outgoingTransition;
		outgoingTransition = newOutgoingTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoverPackage.COMMAND__OUTGOING_TRANSITION, oldOutgoingTransition, newOutgoingTransition);
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
	public void setOutgoingTransition(Tansition newOutgoingTransition) {
		if (newOutgoingTransition != outgoingTransition) {
			NotificationChain msgs = null;
			if (outgoingTransition != null)
				msgs = ((InternalEObject) outgoingTransition).eInverseRemove(this,
						RoverPackage.TANSITION__SOURCE_COMMAND, Tansition.class, msgs);
			if (newOutgoingTransition != null)
				msgs = ((InternalEObject) newOutgoingTransition).eInverseAdd(this,
						RoverPackage.TANSITION__SOURCE_COMMAND, Tansition.class, msgs);
			msgs = basicSetOutgoingTransition(newOutgoingTransition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__OUTGOING_TRANSITION,
					newOutgoingTransition, newOutgoingTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tansition getIncomingTransition() {
		if (incomingTransition != null && incomingTransition.eIsProxy()) {
			InternalEObject oldIncomingTransition = (InternalEObject) incomingTransition;
			incomingTransition = (Tansition) eResolveProxy(oldIncomingTransition);
			if (incomingTransition != oldIncomingTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverPackage.COMMAND__INCOMING_TRANSITION,
							oldIncomingTransition, incomingTransition));
			}
		}
		return incomingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tansition basicGetIncomingTransition() {
		return incomingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingTransition(Tansition newIncomingTransition, NotificationChain msgs) {
		Tansition oldIncomingTransition = incomingTransition;
		incomingTransition = newIncomingTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoverPackage.COMMAND__INCOMING_TRANSITION, oldIncomingTransition, newIncomingTransition);
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
	public void setIncomingTransition(Tansition newIncomingTransition) {
		if (newIncomingTransition != incomingTransition) {
			NotificationChain msgs = null;
			if (incomingTransition != null)
				msgs = ((InternalEObject) incomingTransition).eInverseRemove(this,
						RoverPackage.TANSITION__TARGET_COMMAND, Tansition.class, msgs);
			if (newIncomingTransition != null)
				msgs = ((InternalEObject) newIncomingTransition).eInverseAdd(this,
						RoverPackage.TANSITION__TARGET_COMMAND, Tansition.class, msgs);
			msgs = basicSetIncomingTransition(newIncomingTransition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.COMMAND__INCOMING_TRANSITION,
					newIncomingTransition, newIncomingTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			if (outgoingTransition != null)
				msgs = ((InternalEObject) outgoingTransition).eInverseRemove(this,
						RoverPackage.TANSITION__SOURCE_COMMAND, Tansition.class, msgs);
			return basicSetOutgoingTransition((Tansition) otherEnd, msgs);
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			if (incomingTransition != null)
				msgs = ((InternalEObject) incomingTransition).eInverseRemove(this,
						RoverPackage.TANSITION__TARGET_COMMAND, Tansition.class, msgs);
			return basicSetIncomingTransition((Tansition) otherEnd, msgs);
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
			return basicSetOutgoingTransition(null, msgs);
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			return basicSetIncomingTransition(null, msgs);
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
		case RoverPackage.COMMAND__REPEATE:
			if (resolve)
				return getRepeate();
			return basicGetRepeate();
		case RoverPackage.COMMAND__TERMINTATE:
			if (resolve)
				return getTermintate();
			return basicGetTermintate();
		case RoverPackage.COMMAND__START:
			if (resolve)
				return getStart();
			return basicGetStart();
		case RoverPackage.COMMAND__ROTATE:
			if (resolve)
				return getRotate();
			return basicGetRotate();
		case RoverPackage.COMMAND__MOVE:
			if (resolve)
				return getMove();
			return basicGetMove();
		case RoverPackage.COMMAND__WAIT:
			if (resolve)
				return getWait();
			return basicGetWait();
		case RoverPackage.COMMAND__SETLIGHTCOLOR:
			if (resolve)
				return getSetlightcolor();
			return basicGetSetlightcolor();
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			if (resolve)
				return getOutgoingTransition();
			return basicGetOutgoingTransition();
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			if (resolve)
				return getIncomingTransition();
			return basicGetIncomingTransition();
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
		case RoverPackage.COMMAND__REPEATE:
			setRepeate((Repeate) newValue);
			return;
		case RoverPackage.COMMAND__TERMINTATE:
			setTermintate((Terminate) newValue);
			return;
		case RoverPackage.COMMAND__START:
			setStart((Start) newValue);
			return;
		case RoverPackage.COMMAND__ROTATE:
			setRotate((Rotate) newValue);
			return;
		case RoverPackage.COMMAND__MOVE:
			setMove((Move) newValue);
			return;
		case RoverPackage.COMMAND__WAIT:
			setWait((Wait) newValue);
			return;
		case RoverPackage.COMMAND__SETLIGHTCOLOR:
			setSetlightcolor((SetLightColor) newValue);
			return;
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			setOutgoingTransition((Tansition) newValue);
			return;
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			setIncomingTransition((Tansition) newValue);
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
		case RoverPackage.COMMAND__REPEATE:
			setRepeate((Repeate) null);
			return;
		case RoverPackage.COMMAND__TERMINTATE:
			setTermintate((Terminate) null);
			return;
		case RoverPackage.COMMAND__START:
			setStart((Start) null);
			return;
		case RoverPackage.COMMAND__ROTATE:
			setRotate((Rotate) null);
			return;
		case RoverPackage.COMMAND__MOVE:
			setMove((Move) null);
			return;
		case RoverPackage.COMMAND__WAIT:
			setWait((Wait) null);
			return;
		case RoverPackage.COMMAND__SETLIGHTCOLOR:
			setSetlightcolor((SetLightColor) null);
			return;
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			setOutgoingTransition((Tansition) null);
			return;
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			setIncomingTransition((Tansition) null);
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
		case RoverPackage.COMMAND__REPEATE:
			return repeate != null;
		case RoverPackage.COMMAND__TERMINTATE:
			return termintate != null;
		case RoverPackage.COMMAND__START:
			return start != null;
		case RoverPackage.COMMAND__ROTATE:
			return rotate != null;
		case RoverPackage.COMMAND__MOVE:
			return move != null;
		case RoverPackage.COMMAND__WAIT:
			return wait != null;
		case RoverPackage.COMMAND__SETLIGHTCOLOR:
			return setlightcolor != null;
		case RoverPackage.COMMAND__OUTGOING_TRANSITION:
			return outgoingTransition != null;
		case RoverPackage.COMMAND__INCOMING_TRANSITION:
			return incomingTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandImpl
