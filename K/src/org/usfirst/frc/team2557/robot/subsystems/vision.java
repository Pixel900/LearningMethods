package org.usfirst.frc.team2557.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class vision extends Subsystem {
	
	NetworkTable table;
	public double[] heights;
	
	public void TableInit() {
		
	
	table = NetworkTable.getTable("GRIP/myContourReport");
	
	heights = table.getNumberArray("height",heights);
	
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

