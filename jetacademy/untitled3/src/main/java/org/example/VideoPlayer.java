package org.example;

public class VideoPlayer implements Media {
    private String videoName;
    VideoPlayer(String videoName) {
        this.videoName = videoName;
    }
    public void play() {
        System.out.println("Playing movie "+videoName);
    }
    public void stop() {
        System.out.println("Stopped movie "+videoName);
    }
}
