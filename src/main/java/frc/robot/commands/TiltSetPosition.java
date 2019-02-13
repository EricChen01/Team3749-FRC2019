package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TiltSetPosition extends Command {
   private int position;

   public TiltSetPosition(int pos) {
      requires(Robot.getTilt());
      position = pos;
   }

    @Override
    protected void initialize() {
        
    }

    @Override 
    protected void execute() {
      Robot.getTilt().setPosition(position);
    }

    @Override
    protected boolean isFinished() {
      return true;
    }

    @Override
    protected void end() {

    }
    
    @Override
    protected void interrupted() {

    }
}
