package br.pegoraro.feed;

import br.pegoraro.feed.generated.api.AuthApi;
import br.pegoraro.feed.generated.api.FeedApi;
import br.pegoraro.feed.generated.api.model.AuthRequestDto;
import br.pegoraro.feed.generated.api.model.FeedBasketDto;
import br.pegoraro.feed.generated.api.model.FeedRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Controller
public class FeedController implements AuthApi, FeedApi {

    /**
     * Authenticate and create unique tag
     * @param authRequestDto
     * @return
     */
    @Override
    public ResponseEntity<Void> authenticate(AuthRequestDto authRequestDto) {
        return AuthApi.super.authenticate(authRequestDto);
    }

    /**
     * Consume Feed Entry with filters
     * @param label
     * @param filterTags
     * @param debug
     * @return
     */
    @Override
    public ResponseEntity<List<FeedBasketDto>> consumeFeed(String label, Object filterTags, Boolean debug) {
        return FeedApi.super.consumeFeed(label, filterTags, debug);
    }

    /**
     * Create new Feed for tag
     * @param feedRequestDto
     * @return
     */
    @Override
    public ResponseEntity<Void> createFeed(FeedRequestDto feedRequestDto) {
        return FeedApi.super.createFeed(feedRequestDto);
    }


    /**
     * Just repass not override
     */

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return AuthApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> _authenticate(AuthRequestDto authRequestDto) {
        return AuthApi.super._authenticate(authRequestDto);
    }

    @Override
    public ResponseEntity<List<FeedBasketDto>> _consumeFeed(String label, Object filterTags, Boolean debug) {
        return FeedApi.super._consumeFeed(label, filterTags, debug);
    }

    @Override
    public ResponseEntity<Void> _createFeed(FeedRequestDto feedRequestDto) {
        return FeedApi.super._createFeed(feedRequestDto);
    }
}
