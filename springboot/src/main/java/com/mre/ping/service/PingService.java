package com.mre.ping.service;

import com.mre.ping.rest.model.PingResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Collections;

@Service
public class PingService {

    public PingResponse ping(String message, int repeat) {
        final PingResponse pingResponse = new PingResponse();
        pingResponse.setTimestamp(OffsetDateTime.now());
        pingResponse.setHostname(JsonNullable.of("myhost"));
        pingResponse.setMessages(Collections.nCopies(repeat,message));
        return pingResponse;
    }
}
