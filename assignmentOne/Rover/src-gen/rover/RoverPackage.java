/**
 */
package rover;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rover.RoverFactory
 * @model kind="package"
 * @generated
 */
public interface RoverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rover";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rover";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rover";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoverPackage eINSTANCE = rover.impl.RoverPackageImpl.init();

	/**
	 * The meta object id for the '{@link rover.impl.RoverImpl <em>Rover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.RoverImpl
	 * @see rover.impl.RoverPackageImpl#getRover()
	 * @generated
	 */
	int ROVER = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.ComponentImpl
	 * @see rover.impl.RoverPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.SensorImpl
	 * @see rover.impl.RoverPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__GPS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distancesensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DISTANCESENSOR = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COMPASS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TRIGGERED = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.ActuatorImpl
	 * @see rover.impl.RoverPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Motor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MOTOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__LIGHT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.GPSImpl
	 * @see rover.impl.RoverPackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 4;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__CURRENT_POSITION = 0;

	/**
	 * The number of structural features of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.DistanceSensorImpl
	 * @see rover.impl.RoverPackageImpl#getDistanceSensor()
	 * @generated
	 */
	int DISTANCE_SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Remaining Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__REMAINING_DISTANCE = 0;

	/**
	 * The number of structural features of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.directionFacingImpl <em>direction Facing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.directionFacingImpl
	 * @see rover.impl.RoverPackageImpl#getdirectionFacing()
	 * @generated
	 */
	int DIRECTION_FACING = 6;

	/**
	 * The feature id for the '<em><b>Currently Facing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FACING__CURRENTLY_FACING = 0;

	/**
	 * The number of structural features of the '<em>direction Facing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FACING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>direction Facing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FACING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.MotorImpl
	 * @see rover.impl.RoverPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 7;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.LightImpl
	 * @see rover.impl.RoverPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 8;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.ProgramImpl
	 * @see rover.impl.RoverPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 9;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.BlockImpl
	 * @see rover.impl.RoverPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Tansition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.CommandImpl
	 * @see rover.impl.RoverPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 11;

	/**
	 * The feature id for the '<em><b>Repeate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__REPEATE = 0;

	/**
	 * The feature id for the '<em><b>Termintate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TERMINTATE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__START = 2;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ROTATE = 3;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__MOVE = 4;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__WAIT = 5;

	/**
	 * The feature id for the '<em><b>Setlightcolor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__SETLIGHTCOLOR = 6;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OUTGOING_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__INCOMING_TRANSITION = 8;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.TansitionImpl <em>Tansition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.TansitionImpl
	 * @see rover.impl.RoverPackageImpl#getTansition()
	 * @generated
	 */
	int TANSITION = 12;

	/**
	 * The feature id for the '<em><b>Source Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANSITION__SOURCE_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Target Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANSITION__TARGET_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Compared Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANSITION__COMPARED_QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Operation Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANSITION__OPERATION_USED = 3;

	/**
	 * The number of structural features of the '<em>Tansition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tansition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.SetLightColorImpl
	 * @see rover.impl.RoverPackageImpl#getSetLightColor()
	 * @generated
	 */
	int SET_LIGHT_COLOR = 13;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.WaitImpl
	 * @see rover.impl.RoverPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 14;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TIME = 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.MoveImpl
	 * @see rover.impl.RoverPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 15;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VELOCITY = 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.RotateImpl
	 * @see rover.impl.RoverPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 16;

	/**
	 * The feature id for the '<em><b>Angel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGEL = 0;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.TerminateImpl <em>Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.TerminateImpl
	 * @see rover.impl.RoverPackageImpl#getTerminate()
	 * @generated
	 */
	int TERMINATE = 17;

	/**
	 * The number of structural features of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.RepeateImpl <em>Repeate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.RepeateImpl
	 * @see rover.impl.RoverPackageImpl#getRepeate()
	 * @generated
	 */
	int REPEATE = 18;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE__COUNT = 0;

	/**
	 * The number of structural features of the '<em>Repeate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repeate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.StartImpl
	 * @see rover.impl.RoverPackageImpl#getStart()
	 * @generated
	 */
	int START = 19;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link rover.Rover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover</em>'.
	 * @see rover.Rover
	 * @generated
	 */
	EClass getRover();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Rover#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see rover.Rover#getComponent()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_Component();

	/**
	 * Returns the meta object for the containment reference '{@link rover.Rover#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see rover.Rover#getProgram()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_Program();

	/**
	 * Returns the meta object for the attribute '{@link rover.Rover#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.Rover#getName()
	 * @see #getRover()
	 * @generated
	 */
	EAttribute getRover_Name();

	/**
	 * Returns the meta object for class '{@link rover.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see rover.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link rover.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link rover.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see rover.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference '{@link rover.Sensor#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gps</em>'.
	 * @see rover.Sensor#getGps()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Gps();

	/**
	 * Returns the meta object for the containment reference '{@link rover.Sensor#getDistancesensor <em>Distancesensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distancesensor</em>'.
	 * @see rover.Sensor#getDistancesensor()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Distancesensor();

	/**
	 * Returns the meta object for the reference '{@link rover.Sensor#getCompass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compass</em>'.
	 * @see rover.Sensor#getCompass()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Compass();

	/**
	 * Returns the meta object for the reference '{@link rover.Sensor#getTriggered <em>Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggered</em>'.
	 * @see rover.Sensor#getTriggered()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Triggered();

	/**
	 * Returns the meta object for class '{@link rover.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see rover.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Actuator#getMotor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motor</em>'.
	 * @see rover.Actuator#getMotor()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Motor();

	/**
	 * Returns the meta object for the containment reference '{@link rover.Actuator#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light</em>'.
	 * @see rover.Actuator#getLight()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Light();

	/**
	 * Returns the meta object for class '{@link rover.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see rover.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for the attribute '{@link rover.GPS#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Position</em>'.
	 * @see rover.GPS#getCurrentPosition()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_CurrentPosition();

	/**
	 * Returns the meta object for class '{@link rover.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor</em>'.
	 * @see rover.DistanceSensor
	 * @generated
	 */
	EClass getDistanceSensor();

	/**
	 * Returns the meta object for the attribute '{@link rover.DistanceSensor#getRemainingDistance <em>Remaining Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Distance</em>'.
	 * @see rover.DistanceSensor#getRemainingDistance()
	 * @see #getDistanceSensor()
	 * @generated
	 */
	EAttribute getDistanceSensor_RemainingDistance();

	/**
	 * Returns the meta object for class '{@link rover.directionFacing <em>direction Facing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>direction Facing</em>'.
	 * @see rover.directionFacing
	 * @generated
	 */
	EClass getdirectionFacing();

	/**
	 * Returns the meta object for the attribute '{@link rover.directionFacing#getCurrentlyFacing <em>Currently Facing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currently Facing</em>'.
	 * @see rover.directionFacing#getCurrentlyFacing()
	 * @see #getdirectionFacing()
	 * @generated
	 */
	EAttribute getdirectionFacing_CurrentlyFacing();

	/**
	 * Returns the meta object for class '{@link rover.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see rover.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link rover.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see rover.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for class '{@link rover.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see rover.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference '{@link rover.Program#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see rover.Program#getBlock()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Block();

	/**
	 * Returns the meta object for the attribute '{@link rover.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for class '{@link rover.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see rover.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Block#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see rover.Block#getCommand()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Block#getTansition <em>Tansition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tansition</em>'.
	 * @see rover.Block#getTansition()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Tansition();

	/**
	 * Returns the meta object for the attribute '{@link rover.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for class '{@link rover.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see rover.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getRepeate <em>Repeate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repeate</em>'.
	 * @see rover.Command#getRepeate()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Repeate();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getTermintate <em>Termintate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Termintate</em>'.
	 * @see rover.Command#getTermintate()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Termintate();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see rover.Command#getStart()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Start();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rotate</em>'.
	 * @see rover.Command#getRotate()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Rotate();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move</em>'.
	 * @see rover.Command#getMove()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Move();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wait</em>'.
	 * @see rover.Command#getWait()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Wait();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getSetlightcolor <em>Setlightcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Setlightcolor</em>'.
	 * @see rover.Command#getSetlightcolor()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Setlightcolor();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Transition</em>'.
	 * @see rover.Command#getOutgoingTransition()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_OutgoingTransition();

	/**
	 * Returns the meta object for the reference '{@link rover.Command#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Transition</em>'.
	 * @see rover.Command#getIncomingTransition()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_IncomingTransition();

	/**
	 * Returns the meta object for class '{@link rover.Tansition <em>Tansition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tansition</em>'.
	 * @see rover.Tansition
	 * @generated
	 */
	EClass getTansition();

	/**
	 * Returns the meta object for the reference '{@link rover.Tansition#getSourceCommand <em>Source Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Command</em>'.
	 * @see rover.Tansition#getSourceCommand()
	 * @see #getTansition()
	 * @generated
	 */
	EReference getTansition_SourceCommand();

	/**
	 * Returns the meta object for the reference '{@link rover.Tansition#getTargetCommand <em>Target Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Command</em>'.
	 * @see rover.Tansition#getTargetCommand()
	 * @see #getTansition()
	 * @generated
	 */
	EReference getTansition_TargetCommand();

	/**
	 * Returns the meta object for the attribute '{@link rover.Tansition#getComparedQuantity <em>Compared Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compared Quantity</em>'.
	 * @see rover.Tansition#getComparedQuantity()
	 * @see #getTansition()
	 * @generated
	 */
	EAttribute getTansition_ComparedQuantity();

	/**
	 * Returns the meta object for the attribute '{@link rover.Tansition#getOperationUsed <em>Operation Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Used</em>'.
	 * @see rover.Tansition#getOperationUsed()
	 * @see #getTansition()
	 * @generated
	 */
	EAttribute getTansition_OperationUsed();

	/**
	 * Returns the meta object for class '{@link rover.SetLightColor <em>Set Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Light Color</em>'.
	 * @see rover.SetLightColor
	 * @generated
	 */
	EClass getSetLightColor();

	/**
	 * Returns the meta object for the attribute '{@link rover.SetLightColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see rover.SetLightColor#getColor()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EAttribute getSetLightColor_Color();

	/**
	 * Returns the meta object for class '{@link rover.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see rover.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link rover.Wait#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see rover.Wait#getTime()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Time();

	/**
	 * Returns the meta object for class '{@link rover.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see rover.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link rover.Move#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see rover.Move#getLength()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Length();

	/**
	 * Returns the meta object for the attribute '{@link rover.Move#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see rover.Move#getVelocity()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Velocity();

	/**
	 * Returns the meta object for class '{@link rover.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see rover.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link rover.Rotate#getAngel <em>Angel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angel</em>'.
	 * @see rover.Rotate#getAngel()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Angel();

	/**
	 * Returns the meta object for class '{@link rover.Terminate <em>Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate</em>'.
	 * @see rover.Terminate
	 * @generated
	 */
	EClass getTerminate();

	/**
	 * Returns the meta object for class '{@link rover.Repeate <em>Repeate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeate</em>'.
	 * @see rover.Repeate
	 * @generated
	 */
	EClass getRepeate();

	/**
	 * Returns the meta object for the attribute '{@link rover.Repeate#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see rover.Repeate#getCount()
	 * @see #getRepeate()
	 * @generated
	 */
	EAttribute getRepeate_Count();

	/**
	 * Returns the meta object for class '{@link rover.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see rover.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoverFactory getRoverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rover.impl.RoverImpl <em>Rover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.RoverImpl
		 * @see rover.impl.RoverPackageImpl#getRover()
		 * @generated
		 */
		EClass ROVER = eINSTANCE.getRover();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__COMPONENT = eINSTANCE.getRover_Component();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__PROGRAM = eINSTANCE.getRover_Program();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER__NAME = eINSTANCE.getRover_Name();

		/**
		 * The meta object literal for the '{@link rover.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.ComponentImpl
		 * @see rover.impl.RoverPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link rover.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.SensorImpl
		 * @see rover.impl.RoverPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__GPS = eINSTANCE.getSensor_Gps();

		/**
		 * The meta object literal for the '<em><b>Distancesensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__DISTANCESENSOR = eINSTANCE.getSensor_Distancesensor();

		/**
		 * The meta object literal for the '<em><b>Compass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__COMPASS = eINSTANCE.getSensor_Compass();

		/**
		 * The meta object literal for the '<em><b>Triggered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__TRIGGERED = eINSTANCE.getSensor_Triggered();

		/**
		 * The meta object literal for the '{@link rover.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.ActuatorImpl
		 * @see rover.impl.RoverPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Motor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__MOTOR = eINSTANCE.getActuator_Motor();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__LIGHT = eINSTANCE.getActuator_Light();

		/**
		 * The meta object literal for the '{@link rover.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.GPSImpl
		 * @see rover.impl.RoverPackageImpl#getGPS()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGPS();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__CURRENT_POSITION = eINSTANCE.getGPS_CurrentPosition();

		/**
		 * The meta object literal for the '{@link rover.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.DistanceSensorImpl
		 * @see rover.impl.RoverPackageImpl#getDistanceSensor()
		 * @generated
		 */
		EClass DISTANCE_SENSOR = eINSTANCE.getDistanceSensor();

		/**
		 * The meta object literal for the '<em><b>Remaining Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_SENSOR__REMAINING_DISTANCE = eINSTANCE.getDistanceSensor_RemainingDistance();

		/**
		 * The meta object literal for the '{@link rover.impl.directionFacingImpl <em>direction Facing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.directionFacingImpl
		 * @see rover.impl.RoverPackageImpl#getdirectionFacing()
		 * @generated
		 */
		EClass DIRECTION_FACING = eINSTANCE.getdirectionFacing();

		/**
		 * The meta object literal for the '<em><b>Currently Facing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_FACING__CURRENTLY_FACING = eINSTANCE.getdirectionFacing_CurrentlyFacing();

		/**
		 * The meta object literal for the '{@link rover.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.MotorImpl
		 * @see rover.impl.RoverPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link rover.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.LightImpl
		 * @see rover.impl.RoverPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '{@link rover.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.ProgramImpl
		 * @see rover.impl.RoverPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__BLOCK = eINSTANCE.getProgram_Block();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '{@link rover.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.BlockImpl
		 * @see rover.impl.RoverPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__COMMAND = eINSTANCE.getBlock_Command();

		/**
		 * The meta object literal for the '<em><b>Tansition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TANSITION = eINSTANCE.getBlock_Tansition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '{@link rover.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.CommandImpl
		 * @see rover.impl.RoverPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Repeate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__REPEATE = eINSTANCE.getCommand_Repeate();

		/**
		 * The meta object literal for the '<em><b>Termintate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__TERMINTATE = eINSTANCE.getCommand_Termintate();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__START = eINSTANCE.getCommand_Start();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__ROTATE = eINSTANCE.getCommand_Rotate();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__MOVE = eINSTANCE.getCommand_Move();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__WAIT = eINSTANCE.getCommand_Wait();

		/**
		 * The meta object literal for the '<em><b>Setlightcolor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__SETLIGHTCOLOR = eINSTANCE.getCommand_Setlightcolor();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__OUTGOING_TRANSITION = eINSTANCE.getCommand_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__INCOMING_TRANSITION = eINSTANCE.getCommand_IncomingTransition();

		/**
		 * The meta object literal for the '{@link rover.impl.TansitionImpl <em>Tansition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.TansitionImpl
		 * @see rover.impl.RoverPackageImpl#getTansition()
		 * @generated
		 */
		EClass TANSITION = eINSTANCE.getTansition();

		/**
		 * The meta object literal for the '<em><b>Source Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANSITION__SOURCE_COMMAND = eINSTANCE.getTansition_SourceCommand();

		/**
		 * The meta object literal for the '<em><b>Target Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANSITION__TARGET_COMMAND = eINSTANCE.getTansition_TargetCommand();

		/**
		 * The meta object literal for the '<em><b>Compared Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TANSITION__COMPARED_QUANTITY = eINSTANCE.getTansition_ComparedQuantity();

		/**
		 * The meta object literal for the '<em><b>Operation Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TANSITION__OPERATION_USED = eINSTANCE.getTansition_OperationUsed();

		/**
		 * The meta object literal for the '{@link rover.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.SetLightColorImpl
		 * @see rover.impl.RoverPackageImpl#getSetLightColor()
		 * @generated
		 */
		EClass SET_LIGHT_COLOR = eINSTANCE.getSetLightColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIGHT_COLOR__COLOR = eINSTANCE.getSetLightColor_Color();

		/**
		 * The meta object literal for the '{@link rover.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.WaitImpl
		 * @see rover.impl.RoverPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__TIME = eINSTANCE.getWait_Time();

		/**
		 * The meta object literal for the '{@link rover.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.MoveImpl
		 * @see rover.impl.RoverPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__LENGTH = eINSTANCE.getMove_Length();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__VELOCITY = eINSTANCE.getMove_Velocity();

		/**
		 * The meta object literal for the '{@link rover.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.RotateImpl
		 * @see rover.impl.RoverPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Angel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__ANGEL = eINSTANCE.getRotate_Angel();

		/**
		 * The meta object literal for the '{@link rover.impl.TerminateImpl <em>Terminate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.TerminateImpl
		 * @see rover.impl.RoverPackageImpl#getTerminate()
		 * @generated
		 */
		EClass TERMINATE = eINSTANCE.getTerminate();

		/**
		 * The meta object literal for the '{@link rover.impl.RepeateImpl <em>Repeate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.RepeateImpl
		 * @see rover.impl.RoverPackageImpl#getRepeate()
		 * @generated
		 */
		EClass REPEATE = eINSTANCE.getRepeate();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEATE__COUNT = eINSTANCE.getRepeate_Count();

		/**
		 * The meta object literal for the '{@link rover.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.StartImpl
		 * @see rover.impl.RoverPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

	}

} //RoverPackage
