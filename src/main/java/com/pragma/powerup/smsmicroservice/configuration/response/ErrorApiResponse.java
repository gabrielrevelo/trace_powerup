package com.pragma.powerup.smsmicroservice.configuration.response;

public class ErrorApiResponse extends CustomApiResponse<Void> {
    public ErrorApiResponse(String errorMessage) {
        super(false, errorMessage, null);
    }
}