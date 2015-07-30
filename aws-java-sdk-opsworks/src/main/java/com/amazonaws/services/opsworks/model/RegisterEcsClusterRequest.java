/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#registerEcsCluster(RegisterEcsClusterRequest) RegisterEcsCluster operation}.
 * <p>
 * Registers a specified Amazon ECS cluster with a stack. You can
 * register only one cluster with a stack. A cluster can be registered
 * with only one stack. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"> Resource Management </a>
 * .
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#registerEcsCluster(RegisterEcsClusterRequest)
 */
public class RegisterEcsClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The cluster's ARN.
     */
    private String ecsClusterArn;

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The cluster's ARN.
     *
     * @return The cluster's ARN.
     */
    public String getEcsClusterArn() {
        return ecsClusterArn;
    }
    
    /**
     * The cluster's ARN.
     *
     * @param ecsClusterArn The cluster's ARN.
     */
    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }
    
    /**
     * The cluster's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusterArn The cluster's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterEcsClusterRequest withEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
        return this;
    }

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterEcsClusterRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEcsClusterArn() != null) sb.append("EcsClusterArn: " + getEcsClusterArn() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterEcsClusterRequest == false) return false;
        RegisterEcsClusterRequest other = (RegisterEcsClusterRequest)obj;
        
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null) return false;
        if (other.getEcsClusterArn() != null && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        return true;
    }
    
    @Override
    public RegisterEcsClusterRequest clone() {
        
            return (RegisterEcsClusterRequest) super.clone();
    }

}
    