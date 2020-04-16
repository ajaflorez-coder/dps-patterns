package pe.edu.dps.patterns.structural.adapter3;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
        else if(audioType.equalsIgnoreCase("mp5")) {
            advancedMediaPlayer = new Mp5Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.play(fileName);
    }
}
