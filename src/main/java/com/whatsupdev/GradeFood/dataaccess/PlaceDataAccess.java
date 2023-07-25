package com.whatsupdev.GradeFood.dataaccess;

import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import reactor.core.publisher.Flux;

public interface PlaceDataAccess {

    Flux<PlaceResultDTO> getDataForLocation(int coordinationX, int coordinationY);
}
