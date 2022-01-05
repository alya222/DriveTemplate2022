
package frc.robot.subsystems.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SlewRateLimiter;
import edu.wpi.first.wpilibj.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.geometry.Pose2d;

public class RevDrivetrain {
    
    // assigning drive CANSparkMax motor controller to its port, wheel, and motortype
    private CANSparkMax LFrontWheel = new CANSparkMax(kLeftFrontPort, MotorType.kBrushless);
    private CANSparkMax RFrontWheel = new CANSparkMax(kRightFrontPort, MotorType.kBrushless);
  
    private CANSparkMax LRearWheel = new CANSparkMax(kLeftRearPort, MotorType.kBrushless);
    private CANSparkMax RRearWheel = new CANSparkMax(kRightRearPort, MotorType.kBrushless);
  
    // a class for tank drive, passes in the left and right motor controllers
    private DifferentialDrive roboDrive = new DifferentialDrive(LFrontWheel, RFrontWheel);
  

  public RevDrivetrain() {

    LRearWheel.follow(LFrontWheel);
    RRearWheel.follow(RFrontWheel);

    LFrontWheel.getEncoder().setPosition(0);
    RFrontWheel.getEncoder().setPosition(0);

    //gyro.reset();
  }



  public DifferentialDrive getDifferentialDrive() {
    return roboDrive;
  }


    @Override
    public void periodic() {
  }

}
