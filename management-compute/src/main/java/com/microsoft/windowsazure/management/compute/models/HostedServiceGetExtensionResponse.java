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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The Get Extension operation response.
*/
public class HostedServiceGetExtensionResponse extends OperationResponse
{
    private String id;
    
    /**
    * The identifier of the extension.
    */
    public String getId() { return this.id; }
    
    /**
    * The identifier of the extension.
    */
    public void setId(String id) { this.id = id; }
    
    private String providerNamespace;
    
    /**
    * The provider namespace of the extension. The provider namespace for
    * Windows Azure extensions is Microsoft.Windows.Azure.Extensions.
    */
    public String getProviderNamespace() { return this.providerNamespace; }
    
    /**
    * The provider namespace of the extension. The provider namespace for
    * Windows Azure extensions is Microsoft.Windows.Azure.Extensions.
    */
    public void setProviderNamespace(String providerNamespace) { this.providerNamespace = providerNamespace; }
    
    private String publicConfiguration;
    
    /**
    * The public configuration that is defined using the schema returned by the
    * List Available Extensions operation.
    */
    public String getPublicConfiguration() { return this.publicConfiguration; }
    
    /**
    * The public configuration that is defined using the schema returned by the
    * List Available Extensions operation.
    */
    public void setPublicConfiguration(String publicConfiguration) { this.publicConfiguration = publicConfiguration; }
    
    private String thumbprint;
    
    /**
    * The thumbprint of the certificate that is used to encrypt the
    * configuration specified in PrivateConfiguration. If this element is not
    * specified, a certificate may be automatically generated and added to the
    * cloud service.
    */
    public String getThumbprint() { return this.thumbprint; }
    
    /**
    * The thumbprint of the certificate that is used to encrypt the
    * configuration specified in PrivateConfiguration. If this element is not
    * specified, a certificate may be automatically generated and added to the
    * cloud service.
    */
    public void setThumbprint(String thumbprint) { this.thumbprint = thumbprint; }
    
    private String thumbprintAlgorithm;
    
    /**
    * The thumbprint algorithm of the certificate that is used toencrypt the
    * configuration specified in PrivateConfiguration.
    */
    public String getThumbprintAlgorithm() { return this.thumbprintAlgorithm; }
    
    /**
    * The thumbprint algorithm of the certificate that is used toencrypt the
    * configuration specified in PrivateConfiguration.
    */
    public void setThumbprintAlgorithm(String thumbprintAlgorithm) { this.thumbprintAlgorithm = thumbprintAlgorithm; }
    
    private String type;
    
    /**
    * Required. The type of the extension.
    */
    public String getType() { return this.type; }
    
    /**
    * Required. The type of the extension.
    */
    public void setType(String type) { this.type = type; }
    
    private String version;
    
    /**
    * The version of the extension.
    */
    public String getVersion() { return this.version; }
    
    /**
    * The version of the extension.
    */
    public void setVersion(String version) { this.version = version; }
    
    /**
    * Initializes a new instance of the HostedServiceGetExtensionResponse class.
    *
    */
    public HostedServiceGetExtensionResponse()
    {
    }
}
