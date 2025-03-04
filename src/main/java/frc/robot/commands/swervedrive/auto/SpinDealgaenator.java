package frc.robot.commands.swervedrive.auto;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DealgaenatorSubsystem;

public class SpinDealgaenator extends Command {

    private DealgaenatorSubsystem dealgaenatorSubsystem;
    private double speed;

    public SpinDealgaenator(DealgaenatorSubsystem dealgaenatorSubsystem, double speed) {
        this.dealgaenatorSubsystem = dealgaenatorSubsystem;
        this.speed = speed;
    }

    @Override
    public void initialize() {
        dealgaenatorSubsystem.movePusher(speed);
    }

    @Override
    public void end(boolean interrupted) {
        dealgaenatorSubsystem.stopPusher();
    }

    @Override
    public void execute() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
