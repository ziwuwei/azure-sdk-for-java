/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.ServiceClient;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.ManagementConfiguration;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;

/**
* The Windows Azure Web Sites management API provides a RESTful set of web
* services that interact with Windows Azure Web Sites service to manage your
* web sites. The API has entities that capture the relationship between an end
* user and the Windows Azure Web Sites service.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/dn166981.aspx for more
* information)
*/
public class WebSiteManagementClientImpl extends ServiceClient<WebSiteManagementClient> implements WebSiteManagementClient
{
    private URI baseUri;
    
    /**
    * The URI used as the base for all Service Management requests.
    */
    public URI getBaseUri() { return this.baseUri; }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * When you create a Windows Azure subscription, it is uniquely identified
    * by a subscription ID. The subscription ID forms part of the URI for
    * every call that you make to the Service Management API.  The Windows
    * Azure Service ManagementAPI use mutual authentication of management
    * certificates over SSL to ensure that a request made to the service is
    * secure.  No anonymous requests are allowed.
    */
    public SubscriptionCloudCredentials getCredentials() { return this.credentials; }
    
    private ServerFarmOperations serverFarms;
    
    /**
    * Operations for managing the server farm in a web space.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn194277.aspx for
    * more information)
    */
    public ServerFarmOperations getServerFarmsOperations() { return this.serverFarms; }
    
    private WebSiteOperations webSites;
    
    /**
    * Operations for managing the web sites in a web space.
    */
    public WebSiteOperations getWebSitesOperations() { return this.webSites; }
    
    private WebSpaceOperations webSpaces;
    
    /**
    * Operations for managing web spaces beneath your subscription.
    */
    public WebSpaceOperations getWebSpacesOperations() { return this.webSpaces; }
    
    /**
    * Initializes a new instance of the WebSiteManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    private WebSiteManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService)
    {
        super(httpBuilder, executorService);
        this.serverFarms = new ServerFarmOperationsImpl(this);
        this.webSites = new WebSiteOperationsImpl(this);
        this.webSpaces = new WebSpaceOperationsImpl(this);
    }
    
    /**
    * Initializes a new instance of the WebSiteManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials When you create a Windows Azure subscription, it is
    * uniquely identified by a subscription ID. The subscription ID forms part
    * of the URI for every call that you make to the Service Management API.
    * The Windows Azure Service ManagementAPI use mutual authentication of
    * management certificates over SSL to ensure that a request made to the
    * service is secure.  No anonymous requests are allowed.
    * @param baseUri The URI used as the base for all Service Management
    * requests.
    */
    public WebSiteManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, SubscriptionCloudCredentials credentials, URI baseUri)
    {
        this(httpBuilder, executorService);
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        if (baseUri == null)
        {
            throw new NullPointerException("baseUri");
        }
        this.credentials = credentials;
        this.baseUri = baseUri;
    }
    
    /**
    * Initializes a new instance of the WebSiteManagementClientImpl class.
    * Initializes a new instance of the WebSiteManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials When you create a Windows Azure subscription, it is
    * uniquely identified by a subscription ID. The subscription ID forms part
    * of the URI for every call that you make to the Service Management API.
    * The Windows Azure Service ManagementAPI use mutual authentication of
    * management certificates over SSL to ensure that a request made to the
    * service is secure.  No anonymous requests are allowed.
    */
    @Inject
    public WebSiteManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, @Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials) throws java.net.URISyntaxException
    {
        this(httpBuilder, executorService);
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net");
    }
    
    /**
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    protected WebSiteManagementClientImpl newInstance(HttpClientBuilder httpBuilder, ExecutorService executorService)
    {
        return new WebSiteManagementClientImpl(httpBuilder, executorService, this.getCredentials(), this.getBaseUri());
    }
    
    /**
    * Register your subscription to use Windows Azure Web Sites.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> registerSubscriptionAsync()
    {
        return this.getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception
            {
                return registerSubscription();
            }
         });
    }
    
    /**
    * Register your subscription to use Windows Azure Web Sites.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse registerSubscription() throws IOException, ServiceException
    {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "registerSubscriptionAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getBaseUri() + "/" + this.getCredentials().getSubscriptionId() + "/services?service=website&action=register";
        
        // Create HTTP transport objects
        HttpPut httpRequest = new HttpPut(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/xml");
        httpRequest.setHeader("x-ms-version", "2013-08-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != 202)
        {
            ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        OperationResponse result = null;
        result = new OperationResponse();
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
    
    /**
    * Unregister your subscription to use Windows Azure Web Sites.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> unregisterSubscriptionAsync()
    {
        return this.getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception
            {
                return unregisterSubscription();
            }
         });
    }
    
    /**
    * Unregister your subscription to use Windows Azure Web Sites.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse unregisterSubscription() throws IOException, ServiceException
    {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "unregisterSubscriptionAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getBaseUri() + "/" + this.getCredentials().getSubscriptionId() + "/services?service=website&action=unregister";
        
        // Create HTTP transport objects
        HttpPut httpRequest = new HttpPut(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/xml");
        httpRequest.setHeader("x-ms-version", "2013-08-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != 202)
        {
            ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        OperationResponse result = null;
        result = new OperationResponse();
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
}
