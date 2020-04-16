package pe.edu.dps.patterns.structural.adapter2;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        // Nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file name: " + fileName);
    }
}
