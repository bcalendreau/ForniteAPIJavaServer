package com.brunocalendreau.rest.exception;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException> {
    @Override
    public Response toResponse(BadRequestException e) {
        ErrorMessage error = new ErrorMessage(e.getMessage(), 400);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(error)
                .build();
    }
}
