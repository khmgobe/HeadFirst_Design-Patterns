package designPattern.CommandPattern;

public class Stereo extends Light {

    public String CD;
    public int Volume;

    public Stereo(String living_room) {
        super(living_room);
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

}
