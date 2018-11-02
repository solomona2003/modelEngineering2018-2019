/**
 */
package rover.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rover.Angle;
import rover.AngleUnit;
import rover.Block;
import rover.ColorKind;
import rover.Compass;
import rover.CompassTrigger;
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
import rover.Repeat;
import rover.Rotate;
import rover.Rover;
import rover.RoverFactory;
import rover.RoverPackage;
import rover.SetLightColor;
import rover.Terminate;
import rover.Time;
import rover.TimeUnit;
import rover.Velocity;
import rover.Wait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverFactoryImpl extends EFactoryImpl implements RoverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoverFactory init() {
		try {
			RoverFactory theRoverFactory = (RoverFactory) EPackage.Registry.INSTANCE.getEFactory(RoverPackage.eNS_URI);
			if (theRoverFactory != null) {
				return theRoverFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RoverPackage.SYSTEM:
			return createSystem();
		case RoverPackage.ROVER:
			return createRover();
		case RoverPackage.PROGRAM:
			return createProgram();
		case RoverPackage.MOTOR:
			return createMotor();
		case RoverPackage.LIGHT:
			return createLight();
		case RoverPackage.GPS:
			return createGPS();
		case RoverPackage.COMPASS:
			return createCompass();
		case RoverPackage.DISTANCE:
			return createDistance();
		case RoverPackage.BLOCK:
			return createBlock();
		case RoverPackage.SET_LIGHT_COLOR:
			return createSetLightColor();
		case RoverPackage.WAIT:
			return createWait();
		case RoverPackage.MOVE:
			return createMove();
		case RoverPackage.ROTATE:
			return createRotate();
		case RoverPackage.TERMINATE:
			return createTerminate();
		case RoverPackage.REPEAT:
			return createRepeat();
		case RoverPackage.DISTANCE_SENSOR_TRIGGER:
			return createDistanceSensorTrigger();
		case RoverPackage.COMPASS_TRIGGER:
			return createCompassTrigger();
		case RoverPackage.GPS_TRIGGER:
			return createGPSTrigger();
		case RoverPackage.POSITION:
			return createPosition();
		case RoverPackage.TIME:
			return createTime();
		case RoverPackage.VELOCITY:
			return createVelocity();
		case RoverPackage.ANGLE:
			return createAngle();
		case RoverPackage.LENGTH:
			return createLength();
		case RoverPackage.NORMAL_TRANSITION:
			return createNormalTransition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RoverPackage.COLOR_KIND:
			return createColorKindFromString(eDataType, initialValue);
		case RoverPackage.OPERATOR:
			return createOperatorFromString(eDataType, initialValue);
		case RoverPackage.TIME_UNIT:
			return createTimeUnitFromString(eDataType, initialValue);
		case RoverPackage.ANGLE_UNIT:
			return createAngleUnitFromString(eDataType, initialValue);
		case RoverPackage.LENGTH_UNIT:
			return createLengthUnitFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RoverPackage.COLOR_KIND:
			return convertColorKindToString(eDataType, instanceValue);
		case RoverPackage.OPERATOR:
			return convertOperatorToString(eDataType, instanceValue);
		case RoverPackage.TIME_UNIT:
			return convertTimeUnitToString(eDataType, instanceValue);
		case RoverPackage.ANGLE_UNIT:
			return convertAngleUnitToString(eDataType, instanceValue);
		case RoverPackage.LENGTH_UNIT:
			return convertLengthUnitToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rover.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rover createRover() {
		RoverImpl rover = new RoverImpl();
		return rover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS createGPS() {
		GPSImpl gps = new GPSImpl();
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compass createCompass() {
		CompassImpl compass = new CompassImpl();
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLightColor createSetLightColor() {
		SetLightColorImpl setLightColor = new SetLightColorImpl();
		return setLightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminate createTerminate() {
		TerminateImpl terminate = new TerminateImpl();
		return terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensorTrigger createDistanceSensorTrigger() {
		DistanceSensorTriggerImpl distanceSensorTrigger = new DistanceSensorTriggerImpl();
		return distanceSensorTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompassTrigger createCompassTrigger() {
		CompassTriggerImpl compassTrigger = new CompassTriggerImpl();
		return compassTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSTrigger createGPSTrigger() {
		GPSTriggerImpl gpsTrigger = new GPSTriggerImpl();
		return gpsTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity createVelocity() {
		VelocityImpl velocity = new VelocityImpl();
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle createAngle() {
		AngleImpl angle = new AngleImpl();
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalTransition createNormalTransition() {
		NormalTransitionImpl normalTransition = new NormalTransitionImpl();
		return normalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorKind createColorKindFromString(EDataType eDataType, String initialValue) {
		ColorKind result = ColorKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleUnit createAngleUnitFromString(EDataType eDataType, String initialValue) {
		AngleUnit result = AngleUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthUnit createLengthUnitFromString(EDataType eDataType, String initialValue) {
		LengthUnit result = LengthUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverPackage getRoverPackage() {
		return (RoverPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoverPackage getPackage() {
		return RoverPackage.eINSTANCE;
	}

} //RoverFactoryImpl
