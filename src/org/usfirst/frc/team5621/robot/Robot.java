/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5621.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {



	private DifferentialDrive m_robotDrive = new DifferentialDrive(new Spark(0), new Spark(1));
	private Timer m_timer = new Timer();
	static Subsystem ExampleSubsystem;
	public static OI OI;
	static Joystick m_stick = new Joystick(1);
	Command ExampleCommand;
	Command CompressCommand;
	Command DecompressCommand;
	Command OpenClawCommand;
	Command CloseClawCommand;
	Command CompressorToggleCommand;

	
// Need own java files/classes
	public class Compressor {
		Compressor c = new Compressor();
	}
	public class Solenoid {
		Solenoid exampleSolenoid = new Solenoid();
	}

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		@SuppressWarnings("unused")
		OI OI = new OI();
	}

	/**
	 * This function is run once each time the robot enters autonomous mode.
	 */
	@Override	 
	public void autonomousInit() {
		m_timer.reset();
		m_timer.start();
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		// Drive for 2 seconds
		if (m_timer.get() < 2.0) {
			m_robotDrive.arcadeDrive(0.5, 0.0); // drive forwards half speed
		} else {
			m_robotDrive.stopMotor(); // stop robot
		}
	}

	/**
	 * This function is called once each time the robot enters teleoperated mode.
	 */
	@Override
	public void teleopInit() {
		System.out.println("TeleOperated Mode Enabled");
	}

	/**
	 * This function is called periodically during teleoperated mode.
	 */
	@Override
	public void teleopPeriodic() {
		m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
