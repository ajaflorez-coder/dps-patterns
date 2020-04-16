package pe.edu.dps.patterns.structural.adapter3;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file name: " + fileName);
    }
}
