package com.devopsbuddy6.exceptions;

/**
 * Created by tedonema on 14/05/2016.
 */
public class S3Exception extends RuntimeException {

    public S3Exception(Throwable e) {
        super(e);
    }

    public S3Exception(String s) {
        super(s);
    }
}
