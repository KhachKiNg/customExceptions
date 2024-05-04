package com.mk.exceptions.custom;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ServerErrorException  extends RuntimeException{

    public ServerErrorException(String message) {
        super(message.concat("Some thing went wrong, please call the hotel administration"));
    }
}
