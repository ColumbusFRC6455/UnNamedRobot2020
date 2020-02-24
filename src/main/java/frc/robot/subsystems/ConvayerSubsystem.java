/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class ConvayerSubsystem extends SubsystemBase {
  /**
   * Creates a new ConvayerSubsystem.
   */
  public ConvayerSubsystem() {

  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  private static boolean enabled = false;
  

  // Returns true/false if the Convayer belt is on.
  public static boolean Status(){
    return enabled;
  }

  public void On(){
    enabled = true;
    RobotContainer.Victor8.set(1);
  } // Turn Convayer on

  public void Off(){
    enabled = false;
    RobotContainer.Victor8.set(0);
  } // Turn Convayer Off

}
