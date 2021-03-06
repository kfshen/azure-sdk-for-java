/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.PrivateEndpointConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.PrivateLinkServiceConnectionState;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_05_01.PrivateEndpoint;

class PrivateEndpointConnectionImpl extends CreatableUpdatableImpl<PrivateEndpointConnection, PrivateEndpointConnectionInner, PrivateEndpointConnectionImpl> implements PrivateEndpointConnection, PrivateEndpointConnection.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String peConnectionName;

    PrivateEndpointConnectionImpl(String name, NetworkManager manager) {
        super(name, new PrivateEndpointConnectionInner());
        this.manager = manager;
        // Set resource name
        this.peConnectionName = name;
        //
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.peConnectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateLinkServices");
        this.peConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpointConnections");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateEndpointConnection> createResourceAsync() {
        PrivateLinkServicesInner client = this.manager().inner().privateLinkServices();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<PrivateEndpointConnection> updateResourceAsync() {
        PrivateLinkServicesInner client = this.manager().inner().privateLinkServices();
        return client.updatePrivateEndpointConnectionAsync(this.resourceGroupName, this.serviceName, this.peConnectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointConnectionInner> getInnerAsync() {
        PrivateLinkServicesInner client = this.manager().inner().privateLinkServices();
        return client.getPrivateEndpointConnectionAsync(this.resourceGroupName, this.serviceName, this.peConnectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String linkIdentifier() {
        return this.inner().linkIdentifier();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PrivateEndpoint privateEndpoint() {
        PrivateEndpointInner inner = this.inner().privateEndpoint();
        if (inner != null) {
            return  new PrivateEndpointImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.inner().privateLinkServiceConnectionState();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PrivateEndpointConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.inner().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

}
