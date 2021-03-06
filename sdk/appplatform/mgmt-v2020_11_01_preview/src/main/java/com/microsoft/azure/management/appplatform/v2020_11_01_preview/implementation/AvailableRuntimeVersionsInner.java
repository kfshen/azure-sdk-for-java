/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.SupportedRuntimeVersion;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AvailableRuntimeVersionsInner model.
 */
public class AvailableRuntimeVersionsInner {
    /**
     * A list of all supported runtime versions.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SupportedRuntimeVersion> value;

    /**
     * Get a list of all supported runtime versions.
     *
     * @return the value value
     */
    public List<SupportedRuntimeVersion> value() {
        return this.value;
    }

}
