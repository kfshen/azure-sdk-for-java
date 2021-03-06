/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_07_01.VpnSiteLinks;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_07_01.VpnSiteLink;

class VpnSiteLinksImpl extends WrapperImpl<VpnSiteLinksInner> implements VpnSiteLinks {
    private final NetworkManager manager;

    VpnSiteLinksImpl(NetworkManager manager) {
        super(manager.inner().vpnSiteLinks());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private VpnSiteLinkImpl wrapModel(VpnSiteLinkInner inner) {
        return  new VpnSiteLinkImpl(inner, manager());
    }

    @Override
    public Observable<VpnSiteLink> listByVpnSiteAsync(final String resourceGroupName, final String vpnSiteName) {
        VpnSiteLinksInner client = this.inner();
        return client.listByVpnSiteAsync(resourceGroupName, vpnSiteName)
        .flatMapIterable(new Func1<Page<VpnSiteLinkInner>, Iterable<VpnSiteLinkInner>>() {
            @Override
            public Iterable<VpnSiteLinkInner> call(Page<VpnSiteLinkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VpnSiteLinkInner, VpnSiteLink>() {
            @Override
            public VpnSiteLink call(VpnSiteLinkInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VpnSiteLink> getAsync(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        VpnSiteLinksInner client = this.inner();
        return client.getAsync(resourceGroupName, vpnSiteName, vpnSiteLinkName)
        .flatMap(new Func1<VpnSiteLinkInner, Observable<VpnSiteLink>>() {
            @Override
            public Observable<VpnSiteLink> call(VpnSiteLinkInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VpnSiteLink)wrapModel(inner));
                }
            }
       });
    }

}
