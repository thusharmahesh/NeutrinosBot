//package org.firstinspires.ftc.robotcontroller.external.samples;
//
//import android.bluetooth.BluetoothA2dp;
//import android.graphics.Color;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.Servo;
//
//
///**
// * Created by Archish on 10/6/16.
// */
//
//@Autonomous(name = "AutoBlue", group = "Test") // change name
//public class BlueAuto extends LinearOpMode { // change file name
//    public void main() throws InterruptedException {
//
//    }
//
//
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        boolean telemetrizeModules;
//        double LOW_POWER = 0.50;
//        double POWER = 0.70;
//        double HIGH_POWER = 0.90;
//        NeutrinosBEBE lol = new NeutrinosBEBE(telemetry);
//        lol.redServo.setDirection(Servo.Direction.REVERSE);
//        lol.blueServo.setDirection(Servo.Direction.REVERSE);
//        lol.blueServo.setPosition(.025);
//        lol.redServo.setPosition(.1);
//        lol.armServo.setPosition(0);
//
//
//        while (!isStarted()) {
//            lol.addTelemetry("hello aneesha");
//            telemetry.update();
//            idle();
//        }
//        lol.drive(-0.7, -33, -33);
//        lol.shootBall(1,2.0);
//        lol.armMove();
//        lol.shootBall(1,1.5);
//        lol.turnPIDSlow(0.3, 120, Direction.LEFT, 2.0, 1000);
//        lol.encoderDrive(0.7, 58, 58);
//        lol.touchSensorMoveBack(.3);
//        lol.encoderDrive(-.2, -1, -1);
//        sleep(1000);
//        lol.turnPIDSlow(.3,180,Direction.LEFT,2.0  ,1000);
//        lol.colorODSForward(.4, .4);
//        sleep(250);
//        lol.colorODSBackward(.2,.2);
//        sleep(250);
//        lol.encoderDrive(.3,3,3);
////        lol.colorRedMove();
////        sleep(250);
////        lol.blueServo.setPosition(.025);
////        lol.redServo.setPosition(.1);
////        lol.drive(.3, 18, 18);
////        lol.turnPIDSlow(.3,4,Direction.LEFT,1.5,250);
////        sleep(250);
////        lol.colorODSForward(.3,.3);
////        sleep(250);
////        lol.drive(.3 , -2, -2);
////        lol.colorRedMove();
////        lol.blueServo.setPosition(.025);
////        lol.redServo.setPosition(.1);
////        lol.drive(.6, -12 ,-12);
//
//    }
//}