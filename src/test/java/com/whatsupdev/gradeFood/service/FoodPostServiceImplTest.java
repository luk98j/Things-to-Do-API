package com.whatsupdev.gradeFood.service;

import com.whatsupdev.gradeFood.dataaccess.PlaceDataAccess;
import com.whatsupdev.gradeFood.document.PostDocument;
import com.whatsupdev.gradeFood.model.AddPostRequest;
import com.whatsupdev.gradeFood.model.AddPostResponse;
import com.whatsupdev.gradeFood.repository.FoodPostRepository;
import com.whatsupdev.gradeFood.service.impl.FoodPostServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static com.whatsupdev.gradeFood.util.TestUtils.prepareAddPostRequest;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

@ExtendWith(MockitoExtension.class)
class FoodPostServiceImplTest {
    @Mock
    private PlaceDataAccess placeDataAccessMock;
    @Mock
    private FoodPostRepository foodPostRepositoryMock;

    @InjectMocks
    private FoodPostServiceImpl foodPostServiceImpl;

    @Test
    void savePost_happyPath(){
        Mono<AddPostRequest> monoRequest = Mono.just(prepareAddPostRequest());
        doReturn(Mono.just(new PostDocument())).when(foodPostRepositoryMock).save(any());
        Mono<AddPostResponse> responseMono = foodPostServiceImpl.savePost(monoRequest);
        StepVerifier.create(responseMono)
                .expectNextMatches(AddPostResponse::isSaved)
                .verifyComplete();
    }

    @Test
    void savePost_exceptionWhileSaving(){
        Mono<AddPostRequest> monoRequest = Mono.just(prepareAddPostRequest());
        doThrow(IllegalArgumentException.class).when(foodPostRepositoryMock).save(any());
        Mono<AddPostResponse> responseMono = foodPostServiceImpl.savePost(monoRequest);
        StepVerifier.create(responseMono)
                .expectNextMatches(r -> !r.isSaved())
                .verifyComplete();
    }
}
