/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.paimon.web.engine.flink.common.status;

/** This enum represents the status of a cluster heartbeat. */
public enum HeartbeatStatus {
    /** * The cluster is active. */
    ACTIVE,
    /** Unable to connect to the target machine, usually due to network anomalies. */
    UNREACHABLE,
    /**
     * The cluster is in an unknown state, usually due to a cluster don't result heartbeat
     * information, but its network is normal.
     */
    UNKNOWN,
    /**
     * The cluster is dead, usually due to a cluster don't obtain heartbeat information for a long
     * time.
     */
    DEAD;
}
