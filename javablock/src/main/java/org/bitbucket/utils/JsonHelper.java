package org.bitbucket.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

public class JsonHelper {

    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> Optional<String> toFormat(T object) {
        Optional<String> result = Optional.empty();
        try {
            result = Optional.of(mapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            //TODO - add logger
            e.printStackTrace();
        }
        return result;
    }

    public static <T> Optional<T> fromFormat(String string, Class<T> cls){
        Optional<T> result = Optional.empty();
        result = (Optional<T>) mapper.convertValue(string,cls);
        return result;
    }

}
