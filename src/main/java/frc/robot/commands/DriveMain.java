/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;

public class DriveMain extends CommandBase {
  private final DriveSubsystem m_Drive;
  //private final Double m_Speed;
  //private final Double m_Rotation;
  /**
   * Creates a new DriveMain.
   */
  public DriveMain(DriveSubsystem Subsystem) {
    m_Drive = Subsystem;
    //m_Speed = RobotContainer.Joy1.getRawAxis(1);

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_Drive);
    //execute();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Drive.arcadedrive(RobotContainer.Joy1.getRawAxis(1), RobotContainer.Joy1.getRawAxis(0));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
