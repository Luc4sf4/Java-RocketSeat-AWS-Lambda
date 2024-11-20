package com.rocketseat.createURLShortner;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;
import java.util.Objects;

public class Main implements RequestHandler<Map<String, Object>, Map<String, String>> {

    @Override
    public Map<String, String> handleRequest(Map<String, Object> stringObjectMap, Context context) {
        return Map.of();
    }
}