// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.servicerequests;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryFactory;
import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;

/**
 * Represents the behavior of service requests.
 */
public interface IServiceRequestCollection
    extends IPartnerComponentString,
    IEntireEntityCollectionRetrievalOperations<ServiceRequest, ResourceCollection<ServiceRequest>>, IEntitySelector<String, IServiceRequest>
{
    /**
     * Gets a single service request
     * 
     * @param serviceRequestId Service Request Id
     * @return The service request operations.
     */
    IServiceRequest byId(String serviceRequestId);

    /**
     * Retrieves all service requests.
     * @return The service requests.
     */
    ResourceCollection<ServiceRequest> get();
    
    /**
     * Queries service requests associated to an organization. - Count queries are not supported by this operation. -
     * You can set the page size or filter or do both at the same time. - Sort is not supported. Default sorting is on
     * status field
     * 
     * @param serviceRequestsQuery A query to apply onto service requests. Check {@link QueryFactory} to see how to
     *            build queries.
     * @return The requested service requests.
     */
    ResourceCollection<ServiceRequest> query(IQuery serviceRequestsQuery);
}