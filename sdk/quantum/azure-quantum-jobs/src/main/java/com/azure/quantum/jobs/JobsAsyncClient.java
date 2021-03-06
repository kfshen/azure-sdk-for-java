// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.quantum.jobs.implementation.JobsImpl;
import com.azure.quantum.jobs.models.JobDetails;
import com.azure.quantum.jobs.models.RestErrorException;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous QuantumClient type. */
@ServiceClient(builder = QuantumClientBuilder.class, isAsync = true)
public final class JobsAsyncClient {
    private final JobsImpl serviceClient;

    /**
     * Initializes an instance of Jobs client.
     *
     * @param serviceClient the service client implementation.
     */
    JobsAsyncClient(JobsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List jobs.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<JobDetails>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * List jobs.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobDetails> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDetails>> getWithResponse(String jobId) {
        return this.serviceClient.getWithResponseAsync(jobId);
    }

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDetails> get(String jobId) {
        return this.serviceClient.getAsync(jobId);
    }

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDetails>> createWithResponse(String jobId, JobDetails job) {
        return this.serviceClient.createWithResponseAsync(jobId, job);
    }

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDetails> create(String jobId, JobDetails job) {
        return this.serviceClient.createAsync(jobId, job);
    }

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponse(String jobId) {
        return this.serviceClient.cancelWithResponseAsync(jobId);
    }

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancel(String jobId) {
        return this.serviceClient.cancelAsync(jobId);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<JobDetails>> listNextSinglePage(String nextLink) {
        return this.serviceClient.listNextSinglePageAsync(nextLink);
    }
}
