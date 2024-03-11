package Structural.Proxy.Video;

public class RealVideoDownloader implements VideoDownloader {


    @Override
    public Video getVideo(String videoId) {

        System.out.println("Conecting to the video server");
        System.out.println("Downloading video from the internet");
        System.out.println("Retreiving the video metadata");

        return new Video(videoId);
    }
}
