package pe.edu.dps.patterns.structural.adapter2;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Nothing
    }
}
