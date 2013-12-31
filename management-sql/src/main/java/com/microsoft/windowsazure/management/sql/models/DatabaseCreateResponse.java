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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.Calendar;

/**
* A standard service response including an HTTP status code and request ID.
*/
public class DatabaseCreateResponse extends OperationResponse
{
    private String collationName;
    
    /**
    * Gets or sets the database resource's collation name.
    */
    public String getCollationName() { return this.collationName; }
    
    /**
    * Gets or sets the database resource's collation name.
    */
    public void setCollationName(String collationName) { this.collationName = collationName; }
    
    private Calendar creationDate;
    
    /**
    * Gets or sets the date this database was created.
    */
    public Calendar getCreationDate() { return this.creationDate; }
    
    /**
    * Gets or sets the date this database was created.
    */
    public void setCreationDate(Calendar creationDate) { this.creationDate = creationDate; }
    
    private String edition;
    
    /**
    * Gets or sets the database resource's edition.
    */
    public String getEdition() { return this.edition; }
    
    /**
    * Gets or sets the database resource's edition.
    */
    public void setEdition(String edition) { this.edition = edition; }
    
    private int id;
    
    /**
    * Gets or sets the id of the database.
    */
    public int getId() { return this.id; }
    
    /**
    * Gets or sets the id of the database.
    */
    public void setId(int id) { this.id = id; }
    
    private boolean isFederationRoot;
    
    /**
    * Gets or sets a value indicating whether the database is a federation root.
    */
    public boolean getIsFederationRoot() { return this.isFederationRoot; }
    
    /**
    * Gets or sets a value indicating whether the database is a federation root.
    */
    public void setIsFederationRoot(boolean isFederationRoot) { this.isFederationRoot = isFederationRoot; }
    
    private boolean isSystemObject;
    
    /**
    * Gets or sets a value indicating whether the database is a system object.
    */
    public boolean getIsSystemObject() { return this.isSystemObject; }
    
    /**
    * Gets or sets a value indicating whether the database is a system object.
    */
    public void setIsSystemObject(boolean isSystemObject) { this.isSystemObject = isSystemObject; }
    
    private long maximumDatabaseSizeInGB;
    
    /**
    * Gets or sets the maximum size of this database, in Gigabytes.
    */
    public long getMaximumDatabaseSizeInGB() { return this.maximumDatabaseSizeInGB; }
    
    /**
    * Gets or sets the maximum size of this database, in Gigabytes.
    */
    public void setMaximumDatabaseSizeInGB(long maximumDatabaseSizeInGB) { this.maximumDatabaseSizeInGB = maximumDatabaseSizeInGB; }
    
    private String name;
    
    /**
    * Gets or sets the name of the database.
    */
    public String getName() { return this.name; }
    
    /**
    * Gets or sets the name of the database.
    */
    public void setName(String name) { this.name = name; }
    
    private String serviceObjectiveAssignmentErrorCode;
    
    /**
    * Gets or sets the error code for this service objective.
    */
    public String getServiceObjectiveAssignmentErrorCode() { return this.serviceObjectiveAssignmentErrorCode; }
    
    /**
    * Gets or sets the error code for this service objective.
    */
    public void setServiceObjectiveAssignmentErrorCode(String serviceObjectiveAssignmentErrorCode) { this.serviceObjectiveAssignmentErrorCode = serviceObjectiveAssignmentErrorCode; }
    
    private String serviceObjectiveAssignmentErrorDescription;
    
    /**
    * Gets or sets the error description, if any.
    */
    public String getServiceObjectiveAssignmentErrorDescription() { return this.serviceObjectiveAssignmentErrorDescription; }
    
    /**
    * Gets or sets the error description, if any.
    */
    public void setServiceObjectiveAssignmentErrorDescription(String serviceObjectiveAssignmentErrorDescription) { this.serviceObjectiveAssignmentErrorDescription = serviceObjectiveAssignmentErrorDescription; }
    
    private String serviceObjectiveAssignmentState;
    
    /**
    * Gets or sets the state of the current assignment.
    */
    public String getServiceObjectiveAssignmentState() { return this.serviceObjectiveAssignmentState; }
    
    /**
    * Gets or sets the state of the current assignment.
    */
    public void setServiceObjectiveAssignmentState(String serviceObjectiveAssignmentState) { this.serviceObjectiveAssignmentState = serviceObjectiveAssignmentState; }
    
    private String serviceObjectiveAssignmentStateDescription;
    
    /**
    * Gets or sets the state description.
    */
    public String getServiceObjectiveAssignmentStateDescription() { return this.serviceObjectiveAssignmentStateDescription; }
    
    /**
    * Gets or sets the state description.
    */
    public void setServiceObjectiveAssignmentStateDescription(String serviceObjectiveAssignmentStateDescription) { this.serviceObjectiveAssignmentStateDescription = serviceObjectiveAssignmentStateDescription; }
    
    private String serviceObjectiveAssignmentSuccessDate;
    
    /**
    * Gets or sets the date the service's assignment succeeded.
    */
    public String getServiceObjectiveAssignmentSuccessDate() { return this.serviceObjectiveAssignmentSuccessDate; }
    
    /**
    * Gets or sets the date the service's assignment succeeded.
    */
    public void setServiceObjectiveAssignmentSuccessDate(String serviceObjectiveAssignmentSuccessDate) { this.serviceObjectiveAssignmentSuccessDate = serviceObjectiveAssignmentSuccessDate; }
    
    private String serviceObjectiveId;
    
    /**
    * Gets or sets the id of this service objective.
    */
    public String getServiceObjectiveId() { return this.serviceObjectiveId; }
    
    /**
    * Gets or sets the id of this service objective.
    */
    public void setServiceObjectiveId(String serviceObjectiveId) { this.serviceObjectiveId = serviceObjectiveId; }
    
    private String sizeMB;
    
    /**
    * Gets or sets the size of this database in megabytes (MB).
    */
    public String getSizeMB() { return this.sizeMB; }
    
    /**
    * Gets or sets the size of this database in megabytes (MB).
    */
    public void setSizeMB(String sizeMB) { this.sizeMB = sizeMB; }
    
    private String state;
    
    /**
    * Gets or sets the state of the database.
    */
    public String getState() { return this.state; }
    
    /**
    * Gets or sets the state of the database.
    */
    public void setState(String state) { this.state = state; }
    
    private String type;
    
    /**
    * Gets or sets the type of resource.
    */
    public String getType() { return this.type; }
    
    /**
    * Gets or sets the type of resource.
    */
    public void setType(String type) { this.type = type; }
    
    /**
    * Initializes a new instance of the DatabaseCreateResponse class.
    *
    */
    public DatabaseCreateResponse()
    {
    }
}
