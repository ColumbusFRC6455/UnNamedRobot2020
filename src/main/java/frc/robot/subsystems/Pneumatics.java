/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Pneumatics extends SubsystemBase {
  /**
   * Creates a new Pneumatics.
   */
  public Pneumatics() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static boolean Out = false;

  public void In() {
    Out = false;
    RobotContainer.Sol1.set(Value.kReverse);
    RobotContainer.Sol2.set(Value.kReverse);
    System.out.println("GO IN!");
  } // Push Pistons in

  public void Out() {
    Out = true;
    RobotContainer.Sol1.set(Value.kForward);
    RobotContainer.Sol2.set(Value.kForward);
  } // Bring pistons out

}
