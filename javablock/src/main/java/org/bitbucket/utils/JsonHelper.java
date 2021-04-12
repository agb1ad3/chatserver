package org.bitbucket.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Optional;

public class JsonHelper {

    private static ObjectMapper mapper = new ObjectMapper();

    private static final Logger logger = LogManager.getLogger("JsonHelper");

    public static <T> Optional<String> toFormat(T object) {
        Optional<String> result = Optional.empty();
        try {
            result = Optional.of(mapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            //TODO - add logger
            logger.error(e);
            e.printStackTrace();
        }
        return result;
    }

    public static <T> Optional<T> fromFormat(String string, Class<T> cls){
        return Optional.of(mapper.convertValue(string,cls));
    }
}
