package com.bjpowernode.web.exception;

/**
 *  try sth
 */
public class ServiceException extends Exception {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }
}
