/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.network.v2020_04_01.implementation.PublicIPAddressesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PublicIPAddresses.
 */
public interface PublicIPAddresses extends SupportsCreating<PublicIPAddress.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<PublicIPAddress>, SupportsListingByResourceGroup<PublicIPAddress>, SupportsListing<PublicIPAddress>, HasInner<PublicIPAddressesInner> {
    /**
     * Gets information about all public IP addresses on a virtual machine scale set level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PublicIPAddress> listVirtualMachineScaleSetPublicIPAddressesAsync(final String resourceGroupName, final String virtualMachineScaleSetName);

    /**
     * Gets information about all public IP addresses in a virtual machine IP configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The network interface name.
     * @param ipConfigurationName The IP configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PublicIPAddress> listVirtualMachineScaleSetVMPublicIPAddressesAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex, final String networkInterfaceName, final String ipConfigurationName);

    /**
     * Get the specified public IP address in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the IP configuration.
     * @param publicIpAddressName The name of the public IP Address.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PublicIPAddress> getVirtualMachineScaleSetPublicIPAddressAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String ipConfigurationName, String publicIpAddressName);

}
