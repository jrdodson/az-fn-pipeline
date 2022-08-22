package org.azure.fn.premium.model.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;

public class fnSerializer {
    public static ObjectMapper getMapper() {
        ObjectMapper mapper =  JsonMapper.builder()
                .addModule(new GuavaModule())
                .build();
        return mapper;
    }
}
