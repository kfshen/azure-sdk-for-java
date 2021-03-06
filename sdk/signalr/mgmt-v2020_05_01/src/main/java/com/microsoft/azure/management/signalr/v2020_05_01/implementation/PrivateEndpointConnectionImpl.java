/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01.implementation;

import com.microsoft.azure.management.signalr.v2020_05_01.PrivateEndpointConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.signalr.v2020_05_01.ProvisioningState;
import com.microsoft.azure.management.signalr.v2020_05_01.PrivateEndpoint;
import com.microsoft.azure.management.signalr.v2020_05_01.PrivateLinkServiceConnectionState;

class PrivateEndpointConnectionImpl extends CreatableUpdatableImpl<PrivateEndpointConnection, PrivateEndpointConnectionInner, PrivateEndpointConnectionImpl> implements PrivateEndpointConnection, PrivateEndpointConnection.Update {
    private final SignalRManager manager;
    private String privateEndpointConnectionName;
    private String resourceGroupName;
    private String resourceName;

    PrivateEndpointConnectionImpl(String name, SignalRManager manager) {
        super(name, new PrivateEndpointConnectionInner());
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = name;
        //
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner inner, SignalRManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = inner.name();
        // set resource ancestor and positional variables
        this.privateEndpointConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpointConnections");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "signalR");
        //
    }

    @Override
    public SignalRManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateEndpointConnection> createResourceAsync() {
        SignalRPrivateEndpointConnectionsInner client = this.manager().inner().signalRPrivateEndpointConnections();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<PrivateEndpointConnection> updateResourceAsync() {
        SignalRPrivateEndpointConnectionsInner client = this.manager().inner().signalRPrivateEndpointConnections();
        return client.updateAsync(this.privateEndpointConnectionName, this.resourceGroupName, this.resourceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointConnectionInner> getInnerAsync() {
        SignalRPrivateEndpointConnectionsInner client = this.manager().inner().signalRPrivateEndpointConnections();
        return client.getAsync(this.privateEndpointConnectionName, this.resourceGroupName, this.resourceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PrivateEndpoint privateEndpoint() {
        return this.inner().privateEndpoint();
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
    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.inner().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.inner().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

}
