package com.tts.mapsapp.model;

import lombok.Data;
import java.util.List;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;
}
