package com.wildlife.park.common.exception;

/**
 * @author yan
 * @desc RecordNotFoundException
 * @date 2020/4/18
 */
public class RecordNotFoundException extends Exception{
    public RecordNotFoundException() {
    }

    public RecordNotFoundException(final String message) {
        super(message);
    }

    public RecordNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public RecordNotFoundException(final Throwable cause) {
        super(cause);
    }

    public RecordNotFoundException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
