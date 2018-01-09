package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class arm extends Subsystem {
	
	public void ArmUp() {

		RobotMap.leftDr(Motor.set(1));
		
		public void ArmChange() {
			if(RobotMap.leftDriveMotor.get()==1) {
				RobotMap.leftDriveMotor.set(-1);
			}
			else {
				RobotMap.leftDriveMotor.set(0);
			}
		}
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

