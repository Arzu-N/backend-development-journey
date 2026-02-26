package org.example;

public class MusicPlayer implements Media {
    private String songName;
    MusicPlayer(String songName) {
        this.songName = songName;
    }
    @Override
    public void play() {
        System.out.println("Playing "+songName);
    }
    @Override
    public void stop() {
        System.out.println("Stopped song "+songName);
    }
}
