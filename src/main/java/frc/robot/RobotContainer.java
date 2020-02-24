/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  public static WPI_VictorSPX Victor1 = new WPI_VictorSPX(2);
  public static WPI_VictorSPX Victor2 = new WPI_VictorSPX(6);
  public static WPI_VictorSPX Victor3 = new WPI_VictorSPX(10); 
  public static WPI_VictorSPX Victor4 = new WPI_VictorSPX(9);
  public static WPI_VictorSPX Victor5 = new WPI_VictorSPX(8);
  public static WPI_VictorSPX Victor6 = new WPI_VictorSPX(3);
  // END DRIVEBASE VICTORS

  //Intake Manipulator Victor
  public static WPI_VictorSPX Victor7 = new WPI_VictorSPX(7);

  // Convayer Victor
  public static WPI_VictorSPX Victor8 = new WPI_VictorSPX(4);

  // Shooting Victors
  public static WPI_VictorSPX Victor9 = new WPI_VictorSPX(1);
  public static WPI_VictorSPX Victor10 = new WPI_VictorSPX(5);

  // Extra VICTORS
    // N/A
  
  // PNEUMATICS DEFINITIONS
   Compressor CompressorMain = new Compressor(0);
   
   public static DoubleSolenoid Sol1 = new DoubleSolenoid(4, 5);
   public static DoubleSolenoid Sol2 = new DoubleSolenoid(6, 7); 

  // DRIVEBASE DEFINITIONS
  
  public static SpeedControllerGroup RightOne = new SpeedControllerGroup(Victor1, Victor2); // There's 3 Motors per side, therefore we need 2 Speed Controller Groups per side; this is one of two for the right.
  public static final SpeedControllerGroup RightFinal = new SpeedControllerGroup(RightOne, Victor3); // This is two of two SpeedControllerGroups for the right side. This is final use this if you want to control the whole right side.
  public static SpeedControllerGroup LeftOne = new SpeedControllerGroup(Victor4, Victor5);
  public static final SpeedControllerGroup LeftFinal = new SpeedControllerGroup(LeftOne, Victor6);

  public static final DifferentialDrive Drive = new DifferentialDrive(LeftFinal, RightFinal); // a system used to control motors.

  public static Joystick Joy1 = new Joystick(1); // Main Joystick (used for driving!)
  public static Joystick Joy2 = new Joystick(2);
  public static JoystickButton ManipToggleInOut = new JoystickButton(Joy1, 3); // Used for bringing ball manipulator up and down
  public static JoystickButton IntakeManipToggle = new JoystickButton(Joy1, 4); // Button number four used to toggle Intake.
  public static JoystickButton shootButton = new JoystickButton(Joy1, 2); // Button number two used for shooting.
  public static JoystickButton Convayer = new JoystickButton(Joy1, 6);

  /**
   * 
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
