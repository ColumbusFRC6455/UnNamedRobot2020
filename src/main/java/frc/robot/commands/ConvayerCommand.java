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

public class ConvayerCommand extends CommandBase {
  /**
   * Creates a new ConvayerCommand.
   */
  private final ConvayerSubsystem m_Sys;

  private boolean Enabeld = false; // Is Convayer enabled? By default it's not!
  public ConvayerCommand(ConvayerSubsystem m_system) {
    m_Sys = m_system;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_Sys);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    boolean out = Pneumatics.Out; // Get status of Pneumatic Manipulator.
    // TEMPORARY!
    if (Enabeld){ // If Convayer is on turn it off.
      Enabeld = false;
      m_Sys.Off();
    }else{ // If Convayer is off turn it on.
      if (out == true){ // If PowerCell Intake is Down do this, else don't do anything. 
      Enabeld = true;
      m_Sys.On();
      }
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // WIP
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
