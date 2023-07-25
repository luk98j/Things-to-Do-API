package com.whatsupdev.GradeFood.api.google;

import com.google.maps.NearbySearchRequest;
import com.google.maps.PlaceDetailsRequest;
import com.google.maps.PlacesApi;
import com.google.maps.model.PlaceIdScope;
import com.whatsupdev.GradeFood.configuration.WebClientFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.whatsupdev.GradeFood.api.google.GoogleStatusHandler.handle;

@Component
@RequiredArgsConstructor
public class GooglePlaceApi {
    private final WebClientFactory webClientFactory;
    @Value("${api.google.place.path")
    private String GOOGLE_API_PATH;
    @Value("${api.google.place.nearby.search")
    private String GOOGLE_API_NEARBY_SEARCH;
    @Value("${api.google.place.key")
    private String GOOGLE_API_KEY;
    @Value("${api.google.place.types")
    private String GOOGLE_API_TYPES;
    @Value("${api.google.place.radius")
    private String GOOGLE_API_RADIUS;
    public Mono<NearbySearchRequest.Response> getGooglePlaceNearRestaurants(int coordinationX, int coordinationY) {
        return webClientFactory.createWebClient(prepareUriForGooglePlaceNearbySearch(coordinationX, coordinationY))
                .get()
                .exchangeToMono(
                    response -> {
                        if (response.statusCode().isError()) {
                            return Mono.error(handle(response));
                        } else {
                            return response.bodyToMono(NearbySearchRequest.Response.class);
                        }
                    }
                );
    }

    private String prepareUriForGooglePlaceNearbySearch(int coordinationX, int coordinationY) {
        String path = GOOGLE_API_PATH + GOOGLE_API_NEARBY_SEARCH;
        return String.format(path, coordinationX, coordinationY, GOOGLE_API_RADIUS, GOOGLE_API_TYPES, GOOGLE_API_KEY);
    }
}
