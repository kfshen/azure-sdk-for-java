/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity ORC sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = OrcSink.class)
@JsonTypeName("OrcSink")
public class OrcSink extends CopySink {
    /**
     * ORC store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /**
     * ORC format settings.
     */
    @JsonProperty(value = "formatSettings")
    private OrcWriteSettings formatSettings;

    /**
     * Get oRC store settings.
     *
     * @return the storeSettings value
     */
    public StoreWriteSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set oRC store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the OrcSink object itself.
     */
    public OrcSink withStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get oRC format settings.
     *
     * @return the formatSettings value
     */
    public OrcWriteSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set oRC format settings.
     *
     * @param formatSettings the formatSettings value to set
     * @return the OrcSink object itself.
     */
    public OrcSink withFormatSettings(OrcWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

}
