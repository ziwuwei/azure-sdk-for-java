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

/**
* Parameters supplied to the Create Database operation.
*/
public class DatabaseUpdateParameters
{
    private String collationName;
    
    /**
    * Gets or sets the collation name for the new database.
    */
    public String getCollationName() { return this.collationName; }
    
    /**
    * Gets or sets the collation name for the new database.
    */
    public void setCollationName(String collationName) { this.collationName = collationName; }
    
    private String edition;
    
    /**
    * Gets or sets the edition for the new database.
    */
    public String getEdition() { return this.edition; }
    
    /**
    * Gets or sets the edition for the new database.
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
    
    private String serviceObjectiveId;
    
    /**
    * Gets or sets the id of this service objective.
    */
    public String getServiceObjectiveId() { return this.serviceObjectiveId; }
    
    /**
    * Gets or sets the id of this service objective.
    */
    public void setServiceObjectiveId(String serviceObjectiveId) { this.serviceObjectiveId = serviceObjectiveId; }
    
    /**
    * Initializes a new instance of the DatabaseUpdateParameters class.
    *
    */
    public DatabaseUpdateParameters()
    {
    }
}
