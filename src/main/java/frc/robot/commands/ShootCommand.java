/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ConvayerSubsystem;
import frc.robot.subsystems.ShootingSubsystem;

public class ShootCommand extends CommandBase {
  /**
   * Creates a new ShootCommand.
   */
  private final ShootingSubsystem m_Sys;
  private boolean Enabled = false;

  public ShootCommand(ShootingSubsystem m_system) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_Sys = m_system;
    addRequirements(m_Sys);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (Enabled) {
      Enabled = false;
      m_Sys.Off();
      new ConvayerCommand(new ConvayerSubsystem()); // Toggle Convayer (To be moved)
    } else {
      Enabled = true;
      m_Sys.On();
      
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      new ConvayerCommand(new ConvayerSubsystem()); // Toggle Convayer (to be moved)
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
