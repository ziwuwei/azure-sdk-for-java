/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01.implementation;

import com.microsoft.azure.management.containerregistry.v2017_10_01.EventInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class EventInfoImpl extends WrapperImpl<EventInfoInner> implements EventInfo {
    private final ContainerRegistryManager manager;
    EventInfoImpl(EventInfoInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

}
