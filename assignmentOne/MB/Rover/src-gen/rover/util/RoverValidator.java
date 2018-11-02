/**
 */
package rover.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rover.Actuator;
import rover.Angle;
import rover.AngleUnit;
import rover.Block;
import rover.ColorKind;
import rover.Command;
import rover.Compass;
import rover.CompassTrigger;
import rover.Component;
import rover.Distance;
import rover.DistanceSensorTrigger;
import rover.GPS;
import rover.GPSTrigger;
import rover.Length;
import rover.LengthUnit;
import rover.Light;
import rover.Motor;
import rover.Move;
import rover.NormalTransition;
import rover.Operator;
import rover.Position;
import rover.Program;
import rover.Quantity;
import rover.Repeat;
import rover.Rotate;
import rover.Rover;
import rover.RoverPackage;
import rover.Sensor;
import rover.SetLightColor;
import rover.Terminate;
import rover.Time;
import rover.TimeUnit;
import rover.Transition;
import rover.TriggeredTransition;
import rover.Velocity;
import rover.Wait;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rover.RoverPackage
 * @generated
 */
public class RoverValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RoverValidator INSTANCE = new RoverValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rover";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return RoverPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case RoverPackage.SYSTEM:
			return validateSystem((rover.System) value, diagnostics, context);
		case RoverPackage.ROVER:
			return validateRover((Rover) value, diagnostics, context);
		case RoverPackage.PROGRAM:
			return validateProgram((Program) value, diagnostics, context);
		case RoverPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case RoverPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case RoverPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case RoverPackage.MOTOR:
			return validateMotor((Motor) value, diagnostics, context);
		case RoverPackage.LIGHT:
			return validateLight((Light) value, diagnostics, context);
		case RoverPackage.GPS:
			return validateGPS((GPS) value, diagnostics, context);
		case RoverPackage.COMPASS:
			return validateCompass((Compass) value, diagnostics, context);
		case RoverPackage.DISTANCE:
			return validateDistance((Distance) value, diagnostics, context);
		case RoverPackage.BLOCK:
			return validateBlock((Block) value, diagnostics, context);
		case RoverPackage.COMMAND:
			return validateCommand((Command) value, diagnostics, context);
		case RoverPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case RoverPackage.SET_LIGHT_COLOR:
			return validateSetLightColor((SetLightColor) value, diagnostics, context);
		case RoverPackage.WAIT:
			return validateWait((Wait) value, diagnostics, context);
		case RoverPackage.MOVE:
			return validateMove((Move) value, diagnostics, context);
		case RoverPackage.ROTATE:
			return validateRotate((Rotate) value, diagnostics, context);
		case RoverPackage.TERMINATE:
			return validateTerminate((Terminate) value, diagnostics, context);
		case RoverPackage.REPEAT:
			return validateRepeat((Repeat) value, diagnostics, context);
		case RoverPackage.TRIGGERED_TRANSITION:
			return validateTriggeredTransition((TriggeredTransition) value, diagnostics, context);
		case RoverPackage.DISTANCE_SENSOR_TRIGGER:
			return validateDistanceSensorTrigger((DistanceSensorTrigger) value, diagnostics, context);
		case RoverPackage.COMPASS_TRIGGER:
			return validateCompassTrigger((CompassTrigger) value, diagnostics, context);
		case RoverPackage.GPS_TRIGGER:
			return validateGPSTrigger((GPSTrigger) value, diagnostics, context);
		case RoverPackage.QUANTITY:
			return validateQuantity((Quantity) value, diagnostics, context);
		case RoverPackage.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case RoverPackage.TIME:
			return validateTime((Time) value, diagnostics, context);
		case RoverPackage.VELOCITY:
			return validateVelocity((Velocity) value, diagnostics, context);
		case RoverPackage.ANGLE:
			return validateAngle((Angle) value, diagnostics, context);
		case RoverPackage.LENGTH:
			return validateLength((Length) value, diagnostics, context);
		case RoverPackage.NORMAL_TRANSITION:
			return validateNormalTransition((NormalTransition) value, diagnostics, context);
		case RoverPackage.COLOR_KIND:
			return validateColorKind((ColorKind) value, diagnostics, context);
		case RoverPackage.OPERATOR:
			return validateOperator((Operator) value, diagnostics, context);
		case RoverPackage.TIME_UNIT:
			return validateTimeUnit((TimeUnit) value, diagnostics, context);
		case RoverPackage.ANGLE_UNIT:
			return validateAngleUnit((AngleUnit) value, diagnostics, context);
		case RoverPackage.LENGTH_UNIT:
			return validateLengthUnit((LengthUnit) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(rover.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover(Rover rover, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rover, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rover, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRover_constraint1_atLeastOneMotor(rover, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the constraint1_atLeastOneMotor constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROVER__CONSTRAINT1_AT_LEAST_ONE_MOTOR__EEXPRESSION = "self.motor -> size () > 0";

	/**
	 * Validates the constraint1_atLeastOneMotor constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover_constraint1_atLeastOneMotor(Rover rover, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoverPackage.Literals.ROVER, rover, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "constraint1_atLeastOneMotor",
				ROVER__CONSTRAINT1_AT_LEAST_ONE_MOTOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotor(Motor motor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(light, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGPS(GPS gps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompass(Compass compass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(Distance distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(block, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(block, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBlock_OCL_constraint_03(block, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OCL_constraint_03 constraint of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BLOCK__OCL_CONSTRAINT_03__EEXPRESSION = "self.command -> select(t : Command | t.oclIsTypeOf(Terminate) ) -> size() <= 1";

	/**
	 * Validates the OCL_constraint_03 constraint of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_OCL_constraint_03(Block block, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoverPackage.Literals.BLOCK, block, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OCL_constraint_03",
				BLOCK__OCL_CONSTRAINT_03__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetLightColor(SetLightColor setLightColor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setLightColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWait(Wait wait, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wait, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(move, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotate(Rotate rotate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rotate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rotate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRotate_OCL_constraint_02_2(rotate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OCL_constraint_02_2 constraint of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROTATE__OCL_CONSTRAINT_02_2__EEXPRESSION = "self.incomingTransition.source <> self";

	/**
	 * Validates the OCL_constraint_02_2 constraint of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotate_OCL_constraint_02_2(Rotate rotate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoverPackage.Literals.ROTATE, rotate, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OCL_constraint_02_2",
				ROTATE__OCL_CONSTRAINT_02_2__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminate(Terminate terminate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(terminate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(terminate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTerminate_OCL_constraint_04(terminate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OCL_constraint_04 constraint of '<em>Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TERMINATE__OCL_CONSTRAINT_04__EEXPRESSION = "self.outgoingTransition -> size() = 0";

	/**
	 * Validates the OCL_constraint_04 constraint of '<em>Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminate_OCL_constraint_04(Terminate terminate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoverPackage.Literals.TERMINATE, terminate, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OCL_constraint_04",
				TERMINATE__OCL_CONSTRAINT_04__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat(Repeat repeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repeat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(repeat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRepeat_OCL_constraint_05(repeat, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OCL_constraint_05 constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPEAT__OCL_CONSTRAINT_05__EEXPRESSION = "self.count > 0";

	/**
	 * Validates the OCL_constraint_05 constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat_OCL_constraint_05(Repeat repeat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoverPackage.Literals.REPEAT, repeat, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OCL_constraint_05",
				REPEAT__OCL_CONSTRAINT_05__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggeredTransition(TriggeredTransition triggeredTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggeredTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceSensorTrigger(DistanceSensorTrigger distanceSensorTrigger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distanceSensorTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompassTrigger(CompassTrigger compassTrigger, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compassTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGPSTrigger(GPSTrigger gpsTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocity(Velocity velocity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(velocity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(length, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalTransition(NormalTransition normalTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normalTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorKind(ColorKind colorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleUnit(AngleUnit angleUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthUnit(LengthUnit lengthUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RoverValidator
