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

package com.amazonaws.service.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a get pipeline action.
 * </p>
 */
public class GetPipelineResult implements Serializable, Cloneable {

    private PipelineDeclaration pipeline;

    /**
     * Sets the value of the Pipeline property for this object.
     * 
     * @param pipeline
     *        The new value for the Pipeline property for this object.
     */
    public void setPipeline(PipelineDeclaration pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * Returns the value of the Pipeline property for this object.
     * 
     * @return The value of the Pipeline property for this object.
     */
    public PipelineDeclaration getPipeline() {
        return this.pipeline;
    }

    /**
     * Sets the value of the Pipeline property for this object.
     * 
     * @param pipeline
     *        The new value for the Pipeline property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetPipelineResult withPipeline(PipelineDeclaration pipeline) {
        setPipeline(pipeline);
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
        if (getPipeline() != null)
            sb.append("Pipeline: " + getPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineResult == false)
            return false;
        GetPipelineResult other = (GetPipelineResult) obj;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null
                && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineResult clone() {
        try {
            return (GetPipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}