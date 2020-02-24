/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class ShootingSubsystem extends SubsystemBase {
  /**
   * Creates a new ShootingSubsystem.
   */
  public ShootingSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  // vics 9 + 10
  boolean enabled = false;
  // Status returns if the shooter is running or not.
  public boolean Status(){
    return enabled;
  }

  public void On(){
    enabled = true;
    //new ConvayerSubsystem().On();
    RobotContainer.Victor9.set(1);
    RobotContainer.Victor10.set(1);
  }

  public void Off(){
    enabled = false;
    //new ConvayerSubsystem().Off();
    RobotContainer.Victor9.set(0);
    RobotContainer.Victor10.set(0);
  }
}
