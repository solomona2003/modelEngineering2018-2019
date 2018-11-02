/**
 */
package rover;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The meta object id for the '{@link rover.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.SystemImpl
	 * @see rover.impl.RoverPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Rover</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROVER = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROGRAM = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.RoverImpl <em>Rover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.RoverImpl
	 * @see rover.impl.RoverPackageImpl#getRover()
	 * @generated
	 */
	int ROVER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Motor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__MOTOR = 2;

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
	 * The meta object id for the '{@link rover.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.ProgramImpl
	 * @see rover.impl.RoverPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Rover</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ROVER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__BLOCK = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.ComponentImpl
	 * @see rover.impl.RoverPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

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
	 * The meta object id for the '{@link rover.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.ActuatorImpl
	 * @see rover.impl.RoverPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.SensorImpl
	 * @see rover.impl.RoverPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.MotorImpl
	 * @see rover.impl.RoverPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = ACTUATOR__NAME;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.LightImpl
	 * @see rover.impl.RoverPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = ACTUATOR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__COLOR = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.GPSImpl
	 * @see rover.impl.RoverPackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__POSITION = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.CompassImpl <em>Compass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.CompassImpl
	 * @see rover.impl.RoverPackageImpl#getCompass()
	 * @generated
	 */
	int COMPASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__ANGLE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.DistanceImpl
	 * @see rover.impl.RoverPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__LENGTH = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.BlockImpl
	 * @see rover.impl.RoverPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REPEAT = 2;

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
	int COMMAND = 12;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OUTGOING_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__INCOMING_TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.TransitionImpl
	 * @see rover.impl.RoverPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.SetLightColorImpl
	 * @see rover.impl.RoverPackageImpl#getSetLightColor()
	 * @generated
	 */
	int SET_LIGHT_COLOR = 14;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__OUTGOING_TRANSITION = COMMAND__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__INCOMING_TRANSITION = COMMAND__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__LIGHT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__LIGHT_COLOR = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.WaitImpl
	 * @see rover.impl.RoverPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 15;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__OUTGOING_TRANSITION = COMMAND__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__INCOMING_TRANSITION = COMMAND__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TIME = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.MoveImpl
	 * @see rover.impl.RoverPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 16;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OUTGOING_TRANSITION = COMMAND__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__INCOMING_TRANSITION = COMMAND__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Motor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__MOTOR = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LENGTH = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VELOCITY = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.RotateImpl
	 * @see rover.impl.RoverPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 17;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__OUTGOING_TRANSITION = COMMAND__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__INCOMING_TRANSITION = COMMAND__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.TerminateImpl <em>Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.TerminateImpl
	 * @see rover.impl.RoverPackageImpl#getTerminate()
	 * @generated
	 */
	int TERMINATE = 18;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__OUTGOING_TRANSITION = COMMAND__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__INCOMING_TRANSITION = COMMAND__INCOMING_TRANSITION;

	/**
	 * The number of structural features of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.RepeatImpl
	 * @see rover.impl.RoverPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 19;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OUTGOING_TRANSITION = COMMAND__OUTGOING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__INCOMING_TRANSITION = COMMAND__INCOMING_TRANSITION;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setlightcolor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__SETLIGHTCOLOR = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__WAIT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Move</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__MOVE = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ROTATE = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.TriggeredTransitionImpl <em>Triggered Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.TriggeredTransitionImpl
	 * @see rover.impl.RoverPackageImpl#getTriggeredTransition()
	 * @generated
	 */
	int TRIGGERED_TRANSITION = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__OPERATOR = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triggered Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Triggered Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.DistanceSensorTriggerImpl <em>Distance Sensor Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.DistanceSensorTriggerImpl
	 * @see rover.impl.RoverPackageImpl#getDistanceSensorTrigger()
	 * @generated
	 */
	int DISTANCE_SENSOR_TRIGGER = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__SOURCE = TRIGGERED_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__TARGET = TRIGGERED_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__OPERATOR = TRIGGERED_TRANSITION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__DISTANCE = TRIGGERED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__LENGTH = TRIGGERED_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distance Sensor Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER_FEATURE_COUNT = TRIGGERED_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Distance Sensor Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER_OPERATION_COUNT = TRIGGERED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.CompassTriggerImpl <em>Compass Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.CompassTriggerImpl
	 * @see rover.impl.RoverPackageImpl#getCompassTrigger()
	 * @generated
	 */
	int COMPASS_TRIGGER = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__SOURCE = TRIGGERED_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__TARGET = TRIGGERED_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__OPERATOR = TRIGGERED_TRANSITION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Compass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__COMPASS = TRIGGERED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__ANGLE = TRIGGERED_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compass Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER_FEATURE_COUNT = TRIGGERED_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compass Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER_OPERATION_COUNT = TRIGGERED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.GPSTriggerImpl <em>GPS Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.GPSTriggerImpl
	 * @see rover.impl.RoverPackageImpl#getGPSTrigger()
	 * @generated
	 */
	int GPS_TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__SOURCE = TRIGGERED_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__TARGET = TRIGGERED_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__OPERATOR = TRIGGERED_TRANSITION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__GPS = TRIGGERED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__POSITION = TRIGGERED_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GPS Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER_FEATURE_COUNT = TRIGGERED_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GPS Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER_OPERATION_COUNT = TRIGGERED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.QuantityImpl
	 * @see rover.impl.RoverPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.PositionImpl
	 * @see rover.impl.RoverPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 25;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.TimeImpl
	 * @see rover.impl.RoverPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.VelocityImpl <em>Velocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.VelocityImpl
	 * @see rover.impl.RoverPackageImpl#getVelocity()
	 * @generated
	 */
	int VELOCITY = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.AngleImpl
	 * @see rover.impl.RoverPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.LengthImpl
	 * @see rover.impl.RoverPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.impl.NormalTransitionImpl <em>Normal Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.impl.NormalTransitionImpl
	 * @see rover.impl.RoverPackageImpl#getNormalTransition()
	 * @generated
	 */
	int NORMAL_TRANSITION = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The number of structural features of the '<em>Normal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.ColorKind <em>Color Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.ColorKind
	 * @see rover.impl.RoverPackageImpl#getColorKind()
	 * @generated
	 */
	int COLOR_KIND = 31;

	/**
	 * The meta object id for the '{@link rover.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.Operator
	 * @see rover.impl.RoverPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 32;

	/**
	 * The meta object id for the '{@link rover.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.TimeUnit
	 * @see rover.impl.RoverPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 33;

	/**
	 * The meta object id for the '{@link rover.AngleUnit <em>Angle Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.AngleUnit
	 * @see rover.impl.RoverPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 34;

	/**
	 * The meta object id for the '{@link rover.LengthUnit <em>Length Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.LengthUnit
	 * @see rover.impl.RoverPackageImpl#getLengthUnit()
	 * @generated
	 */
	int LENGTH_UNIT = 35;

	/**
	 * Returns the meta object for class '{@link rover.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see rover.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.System#getRover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rover</em>'.
	 * @see rover.System#getRover()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Rover();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.System#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program</em>'.
	 * @see rover.System#getProgram()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Program();

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
	 * Returns the meta object for the containment reference list '{@link rover.Rover#getMotor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motor</em>'.
	 * @see rover.Rover#getMotor()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_Motor();

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
	 * Returns the meta object for the reference '{@link rover.Program#getRover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rover</em>'.
	 * @see rover.Program#getRover()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Rover();

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
	 * Returns the meta object for the containment reference '{@link rover.Program#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see rover.Program#getBlock()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Block();

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
	 * Returns the meta object for class '{@link rover.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see rover.Actuator
	 * @generated
	 */
	EClass getActuator();

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
	 * Returns the meta object for the attribute '{@link rover.Light#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see rover.Light#getColor()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Color();

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
	 * Returns the meta object for the reference '{@link rover.GPS#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see rover.GPS#getPosition()
	 * @see #getGPS()
	 * @generated
	 */
	EReference getGPS_Position();

	/**
	 * Returns the meta object for class '{@link rover.Compass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compass</em>'.
	 * @see rover.Compass
	 * @generated
	 */
	EClass getCompass();

	/**
	 * Returns the meta object for the reference '{@link rover.Compass#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle</em>'.
	 * @see rover.Compass#getAngle()
	 * @see #getCompass()
	 * @generated
	 */
	EReference getCompass_Angle();

	/**
	 * Returns the meta object for class '{@link rover.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see rover.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for the reference '{@link rover.Distance#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Length</em>'.
	 * @see rover.Distance#getLength()
	 * @see #getDistance()
	 * @generated
	 */
	EReference getDistance_Length();

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
	 * Returns the meta object for the containment reference list '{@link rover.Block#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see rover.Block#getTransition()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Transition();

	/**
	 * Returns the meta object for the reference '{@link rover.Block#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repeat</em>'.
	 * @see rover.Block#getRepeat()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Repeat();

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
	 * Returns the meta object for the reference list '{@link rover.Command#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transition</em>'.
	 * @see rover.Command#getOutgoingTransition()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link rover.Command#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see rover.Command#getIncomingTransition()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_IncomingTransition();

	/**
	 * Returns the meta object for class '{@link rover.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see rover.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link rover.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rover.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link rover.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rover.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

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
	 * Returns the meta object for the reference '{@link rover.SetLightColor#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Light</em>'.
	 * @see rover.SetLightColor#getLight()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EReference getSetLightColor_Light();

	/**
	 * Returns the meta object for the attribute '{@link rover.SetLightColor#getLightColor <em>Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light Color</em>'.
	 * @see rover.SetLightColor#getLightColor()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EAttribute getSetLightColor_LightColor();

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
	 * Returns the meta object for the reference '{@link rover.Wait#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see rover.Wait#getTime()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_Time();

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
	 * Returns the meta object for the reference '{@link rover.Move#getMotor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motor</em>'.
	 * @see rover.Move#getMotor()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Motor();

	/**
	 * Returns the meta object for the reference '{@link rover.Move#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Length</em>'.
	 * @see rover.Move#getLength()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Length();

	/**
	 * Returns the meta object for the reference '{@link rover.Move#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Velocity</em>'.
	 * @see rover.Move#getVelocity()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Velocity();

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
	 * Returns the meta object for the reference '{@link rover.Rotate#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle</em>'.
	 * @see rover.Rotate#getAngle()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_Angle();

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
	 * Returns the meta object for class '{@link rover.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see rover.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link rover.Repeat#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see rover.Repeat#getCount()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Repeat#getSetlightcolor <em>Setlightcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setlightcolor</em>'.
	 * @see rover.Repeat#getSetlightcolor()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Setlightcolor();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Repeat#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wait</em>'.
	 * @see rover.Repeat#getWait()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Wait();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Repeat#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move</em>'.
	 * @see rover.Repeat#getMove()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Move();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Repeat#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rotate</em>'.
	 * @see rover.Repeat#getRotate()
	 * @see #getRepeat()
	 * @generated
	 */
	EReference getRepeat_Rotate();

	/**
	 * Returns the meta object for class '{@link rover.TriggeredTransition <em>Triggered Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggered Transition</em>'.
	 * @see rover.TriggeredTransition
	 * @generated
	 */
	EClass getTriggeredTransition();

	/**
	 * Returns the meta object for the attribute '{@link rover.TriggeredTransition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see rover.TriggeredTransition#getOperator()
	 * @see #getTriggeredTransition()
	 * @generated
	 */
	EAttribute getTriggeredTransition_Operator();

	/**
	 * Returns the meta object for class '{@link rover.DistanceSensorTrigger <em>Distance Sensor Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor Trigger</em>'.
	 * @see rover.DistanceSensorTrigger
	 * @generated
	 */
	EClass getDistanceSensorTrigger();

	/**
	 * Returns the meta object for the reference '{@link rover.DistanceSensorTrigger#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distance</em>'.
	 * @see rover.DistanceSensorTrigger#getDistance()
	 * @see #getDistanceSensorTrigger()
	 * @generated
	 */
	EReference getDistanceSensorTrigger_Distance();

	/**
	 * Returns the meta object for the reference '{@link rover.DistanceSensorTrigger#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Length</em>'.
	 * @see rover.DistanceSensorTrigger#getLength()
	 * @see #getDistanceSensorTrigger()
	 * @generated
	 */
	EReference getDistanceSensorTrigger_Length();

	/**
	 * Returns the meta object for class '{@link rover.CompassTrigger <em>Compass Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compass Trigger</em>'.
	 * @see rover.CompassTrigger
	 * @generated
	 */
	EClass getCompassTrigger();

	/**
	 * Returns the meta object for the reference '{@link rover.CompassTrigger#getCompass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compass</em>'.
	 * @see rover.CompassTrigger#getCompass()
	 * @see #getCompassTrigger()
	 * @generated
	 */
	EReference getCompassTrigger_Compass();

	/**
	 * Returns the meta object for the reference '{@link rover.CompassTrigger#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle</em>'.
	 * @see rover.CompassTrigger#getAngle()
	 * @see #getCompassTrigger()
	 * @generated
	 */
	EReference getCompassTrigger_Angle();

	/**
	 * Returns the meta object for class '{@link rover.GPSTrigger <em>GPS Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Trigger</em>'.
	 * @see rover.GPSTrigger
	 * @generated
	 */
	EClass getGPSTrigger();

	/**
	 * Returns the meta object for the reference '{@link rover.GPSTrigger#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gps</em>'.
	 * @see rover.GPSTrigger#getGps()
	 * @see #getGPSTrigger()
	 * @generated
	 */
	EReference getGPSTrigger_Gps();

	/**
	 * Returns the meta object for the reference '{@link rover.GPSTrigger#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see rover.GPSTrigger#getPosition()
	 * @see #getGPSTrigger()
	 * @generated
	 */
	EReference getGPSTrigger_Position();

	/**
	 * Returns the meta object for class '{@link rover.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see rover.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link rover.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rover.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link rover.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see rover.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the containment reference '{@link rover.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see rover.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_X();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Y</em>'.
	 * @see rover.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Y();

	/**
	 * Returns the meta object for class '{@link rover.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see rover.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link rover.Velocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Velocity</em>'.
	 * @see rover.Velocity
	 * @generated
	 */
	EClass getVelocity();

	/**
	 * Returns the meta object for class '{@link rover.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see rover.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for class '{@link rover.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see rover.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link rover.NormalTransition <em>Normal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Transition</em>'.
	 * @see rover.NormalTransition
	 * @generated
	 */
	EClass getNormalTransition();

	/**
	 * Returns the meta object for enum '{@link rover.ColorKind <em>Color Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Kind</em>'.
	 * @see rover.ColorKind
	 * @generated
	 */
	EEnum getColorKind();

	/**
	 * Returns the meta object for enum '{@link rover.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see rover.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link rover.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see rover.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link rover.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angle Unit</em>'.
	 * @see rover.AngleUnit
	 * @generated
	 */
	EEnum getAngleUnit();

	/**
	 * Returns the meta object for enum '{@link rover.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Length Unit</em>'.
	 * @see rover.LengthUnit
	 * @generated
	 */
	EEnum getLengthUnit();

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
		 * The meta object literal for the '{@link rover.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.SystemImpl
		 * @see rover.impl.RoverPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Rover</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ROVER = eINSTANCE.getSystem_Rover();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROGRAM = eINSTANCE.getSystem_Program();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER__NAME = eINSTANCE.getRover_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__COMPONENT = eINSTANCE.getRover_Component();

		/**
		 * The meta object literal for the '<em><b>Motor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__MOTOR = eINSTANCE.getRover_Motor();

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
		 * The meta object literal for the '<em><b>Rover</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ROVER = eINSTANCE.getProgram_Rover();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__BLOCK = eINSTANCE.getProgram_Block();

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
		 * The meta object literal for the '{@link rover.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.ActuatorImpl
		 * @see rover.impl.RoverPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

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
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__COLOR = eINSTANCE.getLight_Color();

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
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS__POSITION = eINSTANCE.getGPS_Position();

		/**
		 * The meta object literal for the '{@link rover.impl.CompassImpl <em>Compass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.CompassImpl
		 * @see rover.impl.RoverPackageImpl#getCompass()
		 * @generated
		 */
		EClass COMPASS = eINSTANCE.getCompass();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPASS__ANGLE = eINSTANCE.getCompass_Angle();

		/**
		 * The meta object literal for the '{@link rover.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.DistanceImpl
		 * @see rover.impl.RoverPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE__LENGTH = eINSTANCE.getDistance_Length();

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
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TRANSITION = eINSTANCE.getBlock_Transition();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__REPEAT = eINSTANCE.getBlock_Repeat();

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
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__OUTGOING_TRANSITION = eINSTANCE.getCommand_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__INCOMING_TRANSITION = eINSTANCE.getCommand_IncomingTransition();

		/**
		 * The meta object literal for the '{@link rover.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.TransitionImpl
		 * @see rover.impl.RoverPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

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
		 * The meta object literal for the '<em><b>Light</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIGHT_COLOR__LIGHT = eINSTANCE.getSetLightColor_Light();

		/**
		 * The meta object literal for the '<em><b>Light Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIGHT_COLOR__LIGHT_COLOR = eINSTANCE.getSetLightColor_LightColor();

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
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__TIME = eINSTANCE.getWait_Time();

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
		 * The meta object literal for the '<em><b>Motor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__MOTOR = eINSTANCE.getMove_Motor();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__LENGTH = eINSTANCE.getMove_Length();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__VELOCITY = eINSTANCE.getMove_Velocity();

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
		 * The meta object literal for the '<em><b>Angle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

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
		 * The meta object literal for the '{@link rover.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.RepeatImpl
		 * @see rover.impl.RoverPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__COUNT = eINSTANCE.getRepeat_Count();

		/**
		 * The meta object literal for the '<em><b>Setlightcolor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__SETLIGHTCOLOR = eINSTANCE.getRepeat_Setlightcolor();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__WAIT = eINSTANCE.getRepeat_Wait();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__MOVE = eINSTANCE.getRepeat_Move();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT__ROTATE = eINSTANCE.getRepeat_Rotate();

		/**
		 * The meta object literal for the '{@link rover.impl.TriggeredTransitionImpl <em>Triggered Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.TriggeredTransitionImpl
		 * @see rover.impl.RoverPackageImpl#getTriggeredTransition()
		 * @generated
		 */
		EClass TRIGGERED_TRANSITION = eINSTANCE.getTriggeredTransition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGERED_TRANSITION__OPERATOR = eINSTANCE.getTriggeredTransition_Operator();

		/**
		 * The meta object literal for the '{@link rover.impl.DistanceSensorTriggerImpl <em>Distance Sensor Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.DistanceSensorTriggerImpl
		 * @see rover.impl.RoverPackageImpl#getDistanceSensorTrigger()
		 * @generated
		 */
		EClass DISTANCE_SENSOR_TRIGGER = eINSTANCE.getDistanceSensorTrigger();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_SENSOR_TRIGGER__DISTANCE = eINSTANCE.getDistanceSensorTrigger_Distance();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_SENSOR_TRIGGER__LENGTH = eINSTANCE.getDistanceSensorTrigger_Length();

		/**
		 * The meta object literal for the '{@link rover.impl.CompassTriggerImpl <em>Compass Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.CompassTriggerImpl
		 * @see rover.impl.RoverPackageImpl#getCompassTrigger()
		 * @generated
		 */
		EClass COMPASS_TRIGGER = eINSTANCE.getCompassTrigger();

		/**
		 * The meta object literal for the '<em><b>Compass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPASS_TRIGGER__COMPASS = eINSTANCE.getCompassTrigger_Compass();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPASS_TRIGGER__ANGLE = eINSTANCE.getCompassTrigger_Angle();

		/**
		 * The meta object literal for the '{@link rover.impl.GPSTriggerImpl <em>GPS Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.GPSTriggerImpl
		 * @see rover.impl.RoverPackageImpl#getGPSTrigger()
		 * @generated
		 */
		EClass GPS_TRIGGER = eINSTANCE.getGPSTrigger();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_TRIGGER__GPS = eINSTANCE.getGPSTrigger_Gps();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_TRIGGER__POSITION = eINSTANCE.getGPSTrigger_Position();

		/**
		 * The meta object literal for the '{@link rover.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.QuantityImpl
		 * @see rover.impl.RoverPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '{@link rover.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.PositionImpl
		 * @see rover.impl.RoverPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link rover.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.TimeImpl
		 * @see rover.impl.RoverPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link rover.impl.VelocityImpl <em>Velocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.VelocityImpl
		 * @see rover.impl.RoverPackageImpl#getVelocity()
		 * @generated
		 */
		EClass VELOCITY = eINSTANCE.getVelocity();

		/**
		 * The meta object literal for the '{@link rover.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.AngleImpl
		 * @see rover.impl.RoverPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '{@link rover.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.LengthImpl
		 * @see rover.impl.RoverPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link rover.impl.NormalTransitionImpl <em>Normal Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.impl.NormalTransitionImpl
		 * @see rover.impl.RoverPackageImpl#getNormalTransition()
		 * @generated
		 */
		EClass NORMAL_TRANSITION = eINSTANCE.getNormalTransition();

		/**
		 * The meta object literal for the '{@link rover.ColorKind <em>Color Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.ColorKind
		 * @see rover.impl.RoverPackageImpl#getColorKind()
		 * @generated
		 */
		EEnum COLOR_KIND = eINSTANCE.getColorKind();

		/**
		 * The meta object literal for the '{@link rover.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.Operator
		 * @see rover.impl.RoverPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link rover.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.TimeUnit
		 * @see rover.impl.RoverPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link rover.AngleUnit <em>Angle Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.AngleUnit
		 * @see rover.impl.RoverPackageImpl#getAngleUnit()
		 * @generated
		 */
		EEnum ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link rover.LengthUnit <em>Length Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.LengthUnit
		 * @see rover.impl.RoverPackageImpl#getLengthUnit()
		 * @generated
		 */
		EEnum LENGTH_UNIT = eINSTANCE.getLengthUnit();

	}

} //RoverPackage
