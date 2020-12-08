// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Purview Configuration. */
@Fluent
public final class PurviewConfiguration {
    /*
     * Purview Resource ID
     */
    @JsonProperty(value = "purviewResourceId")
    private String purviewResourceId;

    /**
     * Get the purviewResourceId property: Purview Resource ID.
     *
     * @return the purviewResourceId value.
     */
    public String getPurviewResourceId() {
        return this.purviewResourceId;
    }

    /**
     * Set the purviewResourceId property: Purview Resource ID.
     *
     * @param purviewResourceId the purviewResourceId value to set.
     * @return the PurviewConfiguration object itself.
     */
    public PurviewConfiguration setPurviewResourceId(String purviewResourceId) {
        this.purviewResourceId = purviewResourceId;
        return this;
    }
}
