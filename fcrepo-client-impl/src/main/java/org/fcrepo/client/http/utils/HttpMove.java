package org.fcrepo.client.http.utils;

import java.net.URI;

import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.methods.HttpRequestBase;

@NotThreadSafe
public class HttpMove extends HttpRequestBase {

    public final static String METHOD_NAME = "MOVE";

    public HttpMove() {
        super();
    }

    public HttpMove(final URI uri) {
        super();
        setURI(uri);
    }

    /**
     * @throws IllegalArgumentException if the uri is invalid.
     */
    public HttpMove(final String uri) {
        super();
        setURI(URI.create(uri));
    }

    @Override
    public String getMethod() {
        return METHOD_NAME;
    }

}