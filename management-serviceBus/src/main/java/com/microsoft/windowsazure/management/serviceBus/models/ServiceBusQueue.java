/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import java.util.ArrayList;
import java.util.Calendar;

public class ServiceBusQueue
{
    private Calendar accessedAt;
    
    /**
    * The time the queue was last accessed.
    */
    public Calendar getAccessedAt() { return this.accessedAt; }
    
    /**
    * The time the queue was last accessed.
    */
    public void setAccessedAt(Calendar accessedAt) { this.accessedAt = accessedAt; }
    
    private ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules;
    
    /**
    * Gets the authorization rules for the description.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public ArrayList<ServiceBusSharedAccessAuthorizationRule> getAuthorizationRules() { return this.authorizationRules; }
    
    /**
    * Gets the authorization rules for the description.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setAuthorizationRules(ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules) { this.authorizationRules = authorizationRules; }
    
    private String autoDeleteOnIdle;
    
    /**
    * Implemented.
    */
    public String getAutoDeleteOnIdle() { return this.autoDeleteOnIdle; }
    
    /**
    * Implemented.
    */
    public void setAutoDeleteOnIdle(String autoDeleteOnIdle) { this.autoDeleteOnIdle = autoDeleteOnIdle; }
    
    private CountDetails countDetails;
    
    /**
    * Current queue statistics.
    */
    public CountDetails getCountDetails() { return this.countDetails; }
    
    /**
    * Current queue statistics.
    */
    public void setCountDetails(CountDetails countDetails) { this.countDetails = countDetails; }
    
    private Calendar createdAt;
    
    /**
    * The time the queue was created at.
    */
    public Calendar getCreatedAt() { return this.createdAt; }
    
    /**
    * The time the queue was created at.
    */
    public void setCreatedAt(Calendar createdAt) { this.createdAt = createdAt; }
    
    private boolean deadLetteringOnMessageExpiration;
    
    /**
    * This field controls how the Service Bus handles a message whose TTL has
    * expired. If it is enabled and a message expires, the Service Bus moves
    * the message from the queue into the queue’s dead-letter sub-queue. If
    * disabled, message will be permanently deleted from the queue. Settable
    * only at queue creation time.* Default: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public boolean getDeadLetteringOnMessageExpiration() { return this.deadLetteringOnMessageExpiration; }
    
    /**
    * This field controls how the Service Bus handles a message whose TTL has
    * expired. If it is enabled and a message expires, the Service Bus moves
    * the message from the queue into the queue’s dead-letter sub-queue. If
    * disabled, message will be permanently deleted from the queue. Settable
    * only at queue creation time.* Default: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setDeadLetteringOnMessageExpiration(boolean deadLetteringOnMessageExpiration) { this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration; }
    
    private String defaultMessageTimeToLive;
    
    /**
    * Depending on whether DeadLettering is enabled, a message is automatically
    * moved to the DeadLetterQueue or deleted if it has been stored in the
    * queue for longer than the specified time. This value is overwritten by a
    * TTL specified on the message if and only if the message TTL is smaller
    * than the TTL set on the queue. This value is immutable after the Queue
    * has been created:* Range: 1 second - TimeSpan.MaxValue* Default:
    * TimeSpan.MaxValue  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public String getDefaultMessageTimeToLive() { return this.defaultMessageTimeToLive; }
    
    /**
    * Depending on whether DeadLettering is enabled, a message is automatically
    * moved to the DeadLetterQueue or deleted if it has been stored in the
    * queue for longer than the specified time. This value is overwritten by a
    * TTL specified on the message if and only if the message TTL is smaller
    * than the TTL set on the queue. This value is immutable after the Queue
    * has been created:* Range: 1 second - TimeSpan.MaxValue* Default:
    * TimeSpan.MaxValue  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setDefaultMessageTimeToLive(String defaultMessageTimeToLive) { this.defaultMessageTimeToLive = defaultMessageTimeToLive; }
    
    private String duplicateDetectionHistoryTimeWindow;
    
    /**
    * Specifies the time span during which the Service Bus detects message
    * duplication:* Range: 1 second - 7 days* Default: 10 minutes  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public String getDuplicateDetectionHistoryTimeWindow() { return this.duplicateDetectionHistoryTimeWindow; }
    
    /**
    * Specifies the time span during which the Service Bus detects message
    * duplication:* Range: 1 second - 7 days* Default: 10 minutes  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setDuplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) { this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow; }
    
    private boolean enableBatchedOperations;
    
    /**
    * Enables or disables service side batching behavior when performing
    * operations for the specific queue. When enabled, service bus will
    * collect/batch multiple operations to the backend to be more connection
    * efficient. If user wants lower operation latency then they can disable
    * this feature.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public boolean getEnableBatchedOperations() { return this.enableBatchedOperations; }
    
    /**
    * Enables or disables service side batching behavior when performing
    * operations for the specific queue. When enabled, service bus will
    * collect/batch multiple operations to the backend to be more connection
    * efficient. If user wants lower operation latency then they can disable
    * this feature.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setEnableBatchedOperations(boolean enableBatchedOperations) { this.enableBatchedOperations = enableBatchedOperations; }
    
    private String entityAvailabilityStatus;
    
    /**
    * The current availability status of the queue.
    */
    public String getEntityAvailabilityStatus() { return this.entityAvailabilityStatus; }
    
    /**
    * The current availability status of the queue.
    */
    public void setEntityAvailabilityStatus(String entityAvailabilityStatus) { this.entityAvailabilityStatus = entityAvailabilityStatus; }
    
    private boolean isAnonymousAccessible;
    
    /**
    * Gets whether anonymous access is allowed.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public boolean getIsAnonymousAccessible() { return this.isAnonymousAccessible; }
    
    /**
    * Gets whether anonymous access is allowed.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setIsAnonymousAccessible(boolean isAnonymousAccessible) { this.isAnonymousAccessible = isAnonymousAccessible; }
    
    private String lockDuration;
    
    /**
    * Determines the amount of time in seconds in which a message should be
    * locked for processing by a receiver. After this period, the message is
    * unlocked and available for consumption by the next receiver. Settable
    * only at queue creation time:* Range: 0 - 5 minutes. 0 means that the
    * message is not locked* Default: 30 seconds  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public String getLockDuration() { return this.lockDuration; }
    
    /**
    * Determines the amount of time in seconds in which a message should be
    * locked for processing by a receiver. After this period, the message is
    * unlocked and available for consumption by the next receiver. Settable
    * only at queue creation time:* Range: 0 - 5 minutes. 0 means that the
    * message is not locked* Default: 30 seconds  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setLockDuration(String lockDuration) { this.lockDuration = lockDuration; }
    
    private int maxDeliveryCount;
    
    /**
    * The maximum number of times a message SB will try to deliver before being
    * dead lettered or discarded.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public int getMaxDeliveryCount() { return this.maxDeliveryCount; }
    
    /**
    * The maximum number of times a message SB will try to deliver before being
    * dead lettered or discarded.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setMaxDeliveryCount(int maxDeliveryCount) { this.maxDeliveryCount = maxDeliveryCount; }
    
    private int maxSizeInMegabytes;
    
    /**
    * Specifies the maximum queue size in megabytes. Any attempt to enqueue a
    * message that will cause the queue to exceed this value will fail. You
    * can only set this parameter at queue creation time using the following
    * values: * Range: 1 - 1024 (valid values are 1024, 2048, 3072, 4096,
    * 5120) * Default: 1*1024 (valid values are 1024, 2048, 3072, 4096, 5120)
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    */
    public int getMaxSizeInMegabytes() { return this.maxSizeInMegabytes; }
    
    /**
    * Specifies the maximum queue size in megabytes. Any attempt to enqueue a
    * message that will cause the queue to exceed this value will fail. You
    * can only set this parameter at queue creation time using the following
    * values: * Range: 1 - 1024 (valid values are 1024, 2048, 3072, 4096,
    * 5120) * Default: 1*1024 (valid values are 1024, 2048, 3072, 4096, 5120)
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    */
    public void setMaxSizeInMegabytes(int maxSizeInMegabytes) { this.maxSizeInMegabytes = maxSizeInMegabytes; }
    
    private int messageCount;
    
    /**
    * Displays the number of messages currently in the queue.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public int getMessageCount() { return this.messageCount; }
    
    /**
    * Displays the number of messages currently in the queue.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setMessageCount(int messageCount) { this.messageCount = messageCount; }
    
    private String name;
    
    /**
    * The name of the queue.
    */
    public String getName() { return this.name; }
    
    /**
    * The name of the queue.
    */
    public void setName(String name) { this.name = name; }
    
    private boolean requiresDuplicateDetection;
    
    /**
    * Settable only at queue creation time.* Default for durable queue: false
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    */
    public boolean getRequiresDuplicateDetection() { return this.requiresDuplicateDetection; }
    
    /**
    * Settable only at queue creation time.* Default for durable queue: false
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    */
    public void setRequiresDuplicateDetection(boolean requiresDuplicateDetection) { this.requiresDuplicateDetection = requiresDuplicateDetection; }
    
    private boolean requiresSession;
    
    /**
    * Settable only at queue creation time. If set to true, the queue will be
    * session-aware and only SessionReceiver will be supported. Session-aware
    * queues are not supported through REST.* Default for durable queue: false
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    */
    public boolean getRequiresSession() { return this.requiresSession; }
    
    /**
    * Settable only at queue creation time. If set to true, the queue will be
    * session-aware and only SessionReceiver will be supported. Session-aware
    * queues are not supported through REST.* Default for durable queue: false
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    */
    public void setRequiresSession(boolean requiresSession) { this.requiresSession = requiresSession; }
    
    private int sizeInBytes;
    
    /**
    * Reflects the actual bytes that messages in the queue currently occupy
    * toward the queue’s quota.* Range: 0 -MaxTopicSizeinMegaBytes  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public int getSizeInBytes() { return this.sizeInBytes; }
    
    /**
    * Reflects the actual bytes that messages in the queue currently occupy
    * toward the queue’s quota.* Range: 0 -MaxTopicSizeinMegaBytes  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setSizeInBytes(int sizeInBytes) { this.sizeInBytes = sizeInBytes; }
    
    private String status;
    
    /**
    * Gets or sets the current status of the queue (enabled or disabled). When
    * a queue is disabled, that queue cannot send or receive messages.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public String getStatus() { return this.status; }
    
    /**
    * Gets or sets the current status of the queue (enabled or disabled). When
    * a queue is disabled, that queue cannot send or receive messages.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setStatus(String status) { this.status = status; }
    
    private boolean supportOrdering;
    
    /**
    * Gets or sets whether the queue supports ordering.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public boolean getSupportOrdering() { return this.supportOrdering; }
    
    /**
    * Gets or sets whether the queue supports ordering.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    */
    public void setSupportOrdering(boolean supportOrdering) { this.supportOrdering = supportOrdering; }
    
    private Calendar updatedAt;
    
    /**
    * The time the queue was last updated.
    */
    public Calendar getUpdatedAt() { return this.updatedAt; }
    
    /**
    * The time the queue was last updated.
    */
    public void setUpdatedAt(Calendar updatedAt) { this.updatedAt = updatedAt; }
    
    /**
    * Initializes a new instance of the ServiceBusQueue class.
    *
    */
    public ServiceBusQueue()
    {
        this.authorizationRules = new ArrayList<ServiceBusSharedAccessAuthorizationRule>();
    }
}
