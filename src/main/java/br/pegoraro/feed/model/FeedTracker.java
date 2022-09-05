package br.pegoraro.feed.model;

import java.time.Instant;
import java.util.List;

public record FeedTracker(String label, List<String> queryTags, String cron, Instant created) {

}
