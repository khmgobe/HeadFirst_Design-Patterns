package designPattern.CommandPattern;

public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {

    }

    public void execute() {
        stereo.on();
        stereo.setCD("Good");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
