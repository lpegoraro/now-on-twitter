package br.pegoraro.feed.model;

import java.time.Instant;
import java.util.List;

public record FeedTracker(List<String> queryTags, Instant created) {

}
