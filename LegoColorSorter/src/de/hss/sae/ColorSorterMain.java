package de.hss.sae;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.Button;
import lejos.utility.Delay;
import lejos.hardware.Sound;

public class ColorSorterMain {
	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorSorter = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorBand = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3TouchSensor touchSensor = new EV3TouchSensor(SensorPort.S1);
		EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
		
		/*motorBand.setSpeed(360);
		motorBand.backward();
		Delay.msDelay(1500);
		motorBand.stop();*/
		// motorSorter.setSpeed(360);
		dispenseBlock(motorSorter);
	}
	
	public static void dispenseBlock (EV3LargeRegulatedMotor motorSorter) {
		motorSorter.resetTachoCount();
		Sound.beep();
		motorSorter.rotate(-90);
		Delay.msDelay(500);
		motorSorter.rotate(90);
	}
}