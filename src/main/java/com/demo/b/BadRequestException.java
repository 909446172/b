package com.demo.b;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zyy
 * @version 1.0
 * @date 2019/11/28 13:52
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    public BadRequestException(String msg, Exception e) {
        super(msg,e);
    }



}
