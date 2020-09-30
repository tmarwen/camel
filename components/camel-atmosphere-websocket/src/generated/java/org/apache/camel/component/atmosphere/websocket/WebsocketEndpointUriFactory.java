/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class WebsocketEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":servicePath";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(29);
        set.add("servicePath");
        set.add("chunked");
        set.add("disableStreamCache");
        set.add("headerFilterStrategy");
        set.add("sendToAll");
        set.add("transferException");
        set.add("useStreaming");
        set.add("httpBinding");
        set.add("async");
        set.add("bridgeErrorHandler");
        set.add("httpMethodRestrict");
        set.add("matchOnUriPrefix");
        set.add("muteException");
        set.add("responseBufferSize");
        set.add("servletName");
        set.add("attachmentMultipartBinding");
        set.add("eagerCheckContentAvailable");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("fileNameExtWhitelist");
        set.add("optionsEnabled");
        set.add("traceEnabled");
        set.add("bridgeEndpoint");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("mapHttpMessageBody");
        set.add("mapHttpMessageFormUrlEncodedBody");
        set.add("mapHttpMessageHeaders");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "atmosphere-websocket".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "servicePath", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
