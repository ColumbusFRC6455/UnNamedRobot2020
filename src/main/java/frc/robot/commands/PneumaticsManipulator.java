/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ConvayerSubsystem;
import frc.robot.subsystems.Pneumatics;

public class PneumaticsManipulator extends CommandBase {
  private final Pneumatics s_Pneumatics;
  private boolean out = false;
  /**
   * Creates a new PneumaticsManipulator.
   */
  public PneumaticsManipulator(Pneumatics system) {
    s_Pneumatics = system;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(s_Pneumatics);
    //execute();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    boolean conEnabled = ConvayerSubsystem.Status(); // Get the status of the Convayer Belt
    if (out == true & conEnabled == false){ // if Manipulator is out and ConvayerBelt is off do this.
      out = false; // brings it in
      System.out.println("IN IN IN");
      s_Pneumatics.In();
      
    }else{
      out = true; // brings it out
      s_Pneumatics.Out();
      System.out.println("OUT OUT OUT");
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
