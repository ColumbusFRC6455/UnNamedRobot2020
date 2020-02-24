/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class DriveSubsystem extends SubsystemBase {
  
  /**
   * Creates a new Drive.
   */
  public DriveSubsystem() {
    
  }

  /*
    About this subsystem:
    This subsystem is responsible for the robot moving.
    It can be called by multiple different Commands depending on the need.
  */
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadedrive(double x, double z) {
    // tell the DIfferential drive to drive motors using an arcade method. 
    // Xspeed, zSpeed (Forward/back, rotation speed).
    RobotContainer.Drive.arcadeDrive(x, z);
  }

  public void tankDrive(double left, double right){
    RobotContainer.Drive.tankDrive(left, right);
  }
}
