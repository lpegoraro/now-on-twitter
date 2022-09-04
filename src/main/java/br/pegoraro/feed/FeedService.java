package br.pegoraro.feed;

import br.pegoraro.feed.model.FeedTracker;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class FeedService {
    private Map<String, FeedTracker> trackers;

    public  void addTracker(FeedTracker tracker) {
        String uid = UUID.randomUUID().toString();
        trackers.put(uid, tracker);
    }

    public Collection<FeedTracker> getTrackers() {
        return trackers.values();
    }


}
