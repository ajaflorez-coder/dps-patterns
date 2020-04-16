package pe.edu.dps.patterns.structural.adapter3;

public class Mp5Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp5 file name: " + fileName);
    }
}
