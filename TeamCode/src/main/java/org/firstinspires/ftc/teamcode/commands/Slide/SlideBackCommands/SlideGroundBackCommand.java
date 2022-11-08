package org.firstinspires.ftc.teamcode.commands.Slide.SlideBackCommands;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.subsystems.ClawMotors;
import org.firstinspires.ftc.teamcode.subsystems.ClawServos;
import org.firstinspires.ftc.teamcode.subsystems.Slide;

public class SlideGroundBackCommand extends SequentialCommandGroup {
    public SlideGroundBackCommand(Slide slide, ClawMotors clawMotors, ClawServos clawServos) {
        addCommands(
                new InstantCommand(clawServos::clawClose),
                new InstantCommand(slide::slideGround, slide),
                new InstantCommand(clawMotors::moveB, clawMotors),
                new WaitCommand(400),
                new InstantCommand(clawServos::setBClawPos)

        );
    }
}