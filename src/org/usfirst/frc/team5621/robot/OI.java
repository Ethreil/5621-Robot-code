/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5621.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	 //Create Joystick and Buttons
	 static Joystick m_stick = new Joystick(1);
	 static Button  button1 = new JoystickButton(m_stick, 1);
	 static Button	button2 = new JoystickButton(m_stick, 2);
	 static Button	button3 = new JoystickButton(m_stick, 3);
	 static Button	button4 = new JoystickButton(m_stick, 4);
	 static Button	button5 = new JoystickButton(m_stick, 5);
	 static Button	button6 = new JoystickButton(m_stick, 6);
	 static Button	button7 = new JoystickButton(m_stick, 7);
	 static Button	button8 = new JoystickButton(m_stick, 8);


public OI() {
	// Define Commands for Joystick Buttons
    OI.button1.whenPressed(new CompressorToggleCommand());
	OI.button2.whenPressed(new CompressCommand());
	OI.button3.whenPressed(new DecompressCommand());
	OI.button4.whenPressed(new OpenClawCommand());
	OI.button5.whenPressed(new CloseClawCommand());
	OI.button6.whenPressed(new ExampleCommand());
	OI.button7.whenPressed(new ExampleCommand());
	OI.button8.whenPressed(new ExampleCommand());
	}
}

