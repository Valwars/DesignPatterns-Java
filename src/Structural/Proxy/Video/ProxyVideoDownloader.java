package Structural.Proxy.Video;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{

    private final Map<String, Video> cache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoId) {
        if(!cache.containsKey(videoId)){
           cache.put(videoId, downloader.getVideo(videoId));
        }
        return cache.get(videoId);
    }
}
