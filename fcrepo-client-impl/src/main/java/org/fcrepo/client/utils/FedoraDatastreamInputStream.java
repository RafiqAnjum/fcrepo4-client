package org.fcrepo.client.utils;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.methods.HttpRequestBase;

public class FedoraDatastreamInputStream extends FilterInputStream {

	private HttpRequestBase method;
	
	public FedoraDatastreamInputStream(HttpRequestBase method, InputStream input) {
		super(input);
		this.method = method;
	}

	@Override
	public void close() throws IOException {
		try {
			super.close();
		} finally {
			method.releaseConnection();
		}
	}

}
