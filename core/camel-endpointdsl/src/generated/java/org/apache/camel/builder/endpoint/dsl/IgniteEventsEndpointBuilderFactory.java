/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Receive events from an Ignite cluster by creating a local event listener.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteEventsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Events component.
     */
    public interface IgniteEventsEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedIgniteEventsEndpointBuilder advanced() {
            return (AdvancedIgniteEventsEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The cluster group expression.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.ClusterGroupExpression&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param clusterGroupExpression the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder clusterGroupExpression(
                Object clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * The cluster group expression.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.ClusterGroupExpression&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param clusterGroupExpression the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder clusterGroupExpression(
                String clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * The event types to subscribe to as a comma-separated string of event
         * constants as defined in EventType. For example:
         * EVT_CACHE_ENTRY_CREATED,EVT_CACHE_OBJECT_REMOVED,EVT_IGFS_DIR_CREATED.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: EVTS_ALL
         * Group: consumer
         * 
         * @param events the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder events(String events) {
            doSetProperty("events", events);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Events component.
     */
    public interface AdvancedIgniteEventsEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default IgniteEventsEndpointBuilder basic() {
            return (IgniteEventsEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteEventsEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteEventsEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteEventsEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteEventsEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteEventsEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteEventsEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface IgniteEventsBuilders {
        /**
         * Ignite Events (camel-ignite)
         * Receive events from an Ignite cluster by creating a local event
         * listener.
         * 
         * Category: messaging,eventbus
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-events:endpointId</code>
         * 
         * Path parameter: endpointId
         * The endpoint ID (not used).
         * 
         * @param path endpointId
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder igniteEvents(String path) {
            return IgniteEventsEndpointBuilderFactory.endpointBuilder("ignite-events", path);
        }
        /**
         * Ignite Events (camel-ignite)
         * Receive events from an Ignite cluster by creating a local event
         * listener.
         * 
         * Category: messaging,eventbus
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-events:endpointId</code>
         * 
         * Path parameter: endpointId
         * The endpoint ID (not used).
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path endpointId
         * @return the dsl builder
         */
        default IgniteEventsEndpointBuilder igniteEvents(
                String componentName,
                String path) {
            return IgniteEventsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IgniteEventsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteEventsEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteEventsEndpointBuilder, AdvancedIgniteEventsEndpointBuilder {
            public IgniteEventsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteEventsEndpointBuilderImpl(path);
    }
}