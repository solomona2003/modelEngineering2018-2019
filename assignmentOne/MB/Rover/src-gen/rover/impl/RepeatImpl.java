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

import rover.Move;
import rover.Repeat;
import rover.Rotate;
import rover.RoverPackage;
import rover.SetLightColor;
import rover.Wait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.impl.RepeatImpl#getCount <em>Count</em>}</li>
 *   <li>{@link rover.impl.RepeatImpl#getSetlightcolor <em>Setlightcolor</em>}</li>
 *   <li>{@link rover.impl.RepeatImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link rover.impl.RepeatImpl#getMove <em>Move</em>}</li>
 *   <li>{@link rover.impl.RepeatImpl#getRotate <em>Rotate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatImpl extends CommandImpl implements Repeat {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSetlightcolor() <em>Setlightcolor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetlightcolor()
	 * @generated
	 * @ordered
	 */
	protected EList<SetLightColor> setlightcolor;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected EList<Wait> wait;

	/**
	 * The cached value of the '{@link #getMove() <em>Move</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> move;

	/**
	 * The cached value of the '{@link #getRotate() <em>Rotate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected EList<Rotate> rotate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverPackage.Literals.REPEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverPackage.REPEAT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetLightColor> getSetlightcolor() {
		if (setlightcolor == null) {
			setlightcolor = new EObjectContainmentEList<SetLightColor>(SetLightColor.class, this,
					RoverPackage.REPEAT__SETLIGHTCOLOR);
		}
		return setlightcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wait> getWait() {
		if (wait == null) {
			wait = new EObjectContainmentEList<Wait>(Wait.class, this, RoverPackage.REPEAT__WAIT);
		}
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMove() {
		if (move == null) {
			move = new EObjectContainmentEList<Move>(Move.class, this, RoverPackage.REPEAT__MOVE);
		}
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rotate> getRotate() {
		if (rotate == null) {
			rotate = new EObjectContainmentEList<Rotate>(Rotate.class, this, RoverPackage.REPEAT__ROTATE);
		}
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoverPackage.REPEAT__SETLIGHTCOLOR:
			return ((InternalEList<?>) getSetlightcolor()).basicRemove(otherEnd, msgs);
		case RoverPackage.REPEAT__WAIT:
			return ((InternalEList<?>) getWait()).basicRemove(otherEnd, msgs);
		case RoverPackage.REPEAT__MOVE:
			return ((InternalEList<?>) getMove()).basicRemove(otherEnd, msgs);
		case RoverPackage.REPEAT__ROTATE:
			return ((InternalEList<?>) getRotate()).basicRemove(otherEnd, msgs);
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
		case RoverPackage.REPEAT__COUNT:
			return getCount();
		case RoverPackage.REPEAT__SETLIGHTCOLOR:
			return getSetlightcolor();
		case RoverPackage.REPEAT__WAIT:
			return getWait();
		case RoverPackage.REPEAT__MOVE:
			return getMove();
		case RoverPackage.REPEAT__ROTATE:
			return getRotate();
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
		case RoverPackage.REPEAT__COUNT:
			setCount((Integer) newValue);
			return;
		case RoverPackage.REPEAT__SETLIGHTCOLOR:
			getSetlightcolor().clear();
			getSetlightcolor().addAll((Collection<? extends SetLightColor>) newValue);
			return;
		case RoverPackage.REPEAT__WAIT:
			getWait().clear();
			getWait().addAll((Collection<? extends Wait>) newValue);
			return;
		case RoverPackage.REPEAT__MOVE:
			getMove().clear();
			getMove().addAll((Collection<? extends Move>) newValue);
			return;
		case RoverPackage.REPEAT__ROTATE:
			getRotate().clear();
			getRotate().addAll((Collection<? extends Rotate>) newValue);
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
		case RoverPackage.REPEAT__COUNT:
			setCount(COUNT_EDEFAULT);
			return;
		case RoverPackage.REPEAT__SETLIGHTCOLOR:
			getSetlightcolor().clear();
			return;
		case RoverPackage.REPEAT__WAIT:
			getWait().clear();
			return;
		case RoverPackage.REPEAT__MOVE:
			getMove().clear();
			return;
		case RoverPackage.REPEAT__ROTATE:
			getRotate().clear();
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
		case RoverPackage.REPEAT__COUNT:
			return count != COUNT_EDEFAULT;
		case RoverPackage.REPEAT__SETLIGHTCOLOR:
			return setlightcolor != null && !setlightcolor.isEmpty();
		case RoverPackage.REPEAT__WAIT:
			return wait != null && !wait.isEmpty();
		case RoverPackage.REPEAT__MOVE:
			return move != null && !move.isEmpty();
		case RoverPackage.REPEAT__ROTATE:
			return rotate != null && !rotate.isEmpty();
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
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //RepeatImpl
