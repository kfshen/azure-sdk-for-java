/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Periodic timer event source.
 */
public class PeriodicTimerSourceInfo {
    /**
     * The time of the day that results in a valid trigger. Schedule is
     * computed with reference to the time specified upto seconds. If timezone
     * is not specified the time will considered to be in device timezone. The
     * value will always be returned as UTC time.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * Periodic frequency at which timer event needs to be raised. Supports
     * daily, hourly, minutes, and seconds.
     */
    @JsonProperty(value = "schedule", required = true)
    private String schedule;

    /**
     * Topic where periodic events are published to IoT device.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /**
     * Get the time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     *
     * @param startTime the startTime value to set
     * @return the PeriodicTimerSourceInfo object itself.
     */
    public PeriodicTimerSourceInfo withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     *
     * @return the schedule value
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * Set periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     *
     * @param schedule the schedule value to set
     * @return the PeriodicTimerSourceInfo object itself.
     */
    public PeriodicTimerSourceInfo withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get topic where periodic events are published to IoT device.
     *
     * @return the topic value
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Set topic where periodic events are published to IoT device.
     *
     * @param topic the topic value to set
     * @return the PeriodicTimerSourceInfo object itself.
     */
    public PeriodicTimerSourceInfo withTopic(String topic) {
        this.topic = topic;
        return this;
    }

}
