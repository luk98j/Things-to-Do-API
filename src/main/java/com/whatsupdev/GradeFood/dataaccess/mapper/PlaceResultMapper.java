package com.whatsupdev.GradeFood.dataaccess.mapper;


import com.google.maps.model.PlacesSearchResult;
import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PlaceResultMapper {
    PlaceResultDTO placesSearchResultToPlaceResultDTO(PlacesSearchResult placesSearchResult);
    PlacesSearchResult placeResultDTOToPlacesSearchResult(PlaceResultDTO placeResultDTO);
}
