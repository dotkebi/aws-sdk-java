/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.json.*;

/**
 * DeploymentInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DeploymentInfo deploymentInfo, StructuredJsonGenerator jsonGenerator) {

        if (deploymentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deploymentInfo.getApplicationName() != null) {
                jsonGenerator.writeFieldName("applicationName").writeValue(deploymentInfo.getApplicationName());
            }
            if (deploymentInfo.getDeploymentGroupName() != null) {
                jsonGenerator.writeFieldName("deploymentGroupName").writeValue(deploymentInfo.getDeploymentGroupName());
            }
            if (deploymentInfo.getDeploymentConfigName() != null) {
                jsonGenerator.writeFieldName("deploymentConfigName").writeValue(deploymentInfo.getDeploymentConfigName());
            }
            if (deploymentInfo.getDeploymentId() != null) {
                jsonGenerator.writeFieldName("deploymentId").writeValue(deploymentInfo.getDeploymentId());
            }
            if (deploymentInfo.getRevision() != null) {
                jsonGenerator.writeFieldName("revision");
                RevisionLocationJsonMarshaller.getInstance().marshall(deploymentInfo.getRevision(), jsonGenerator);
            }
            if (deploymentInfo.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(deploymentInfo.getStatus());
            }
            if (deploymentInfo.getErrorInformation() != null) {
                jsonGenerator.writeFieldName("errorInformation");
                ErrorInformationJsonMarshaller.getInstance().marshall(deploymentInfo.getErrorInformation(), jsonGenerator);
            }
            if (deploymentInfo.getCreateTime() != null) {
                jsonGenerator.writeFieldName("createTime").writeValue(deploymentInfo.getCreateTime());
            }
            if (deploymentInfo.getStartTime() != null) {
                jsonGenerator.writeFieldName("startTime").writeValue(deploymentInfo.getStartTime());
            }
            if (deploymentInfo.getCompleteTime() != null) {
                jsonGenerator.writeFieldName("completeTime").writeValue(deploymentInfo.getCompleteTime());
            }
            if (deploymentInfo.getDeploymentOverview() != null) {
                jsonGenerator.writeFieldName("deploymentOverview");
                DeploymentOverviewJsonMarshaller.getInstance().marshall(deploymentInfo.getDeploymentOverview(), jsonGenerator);
            }
            if (deploymentInfo.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(deploymentInfo.getDescription());
            }
            if (deploymentInfo.getCreator() != null) {
                jsonGenerator.writeFieldName("creator").writeValue(deploymentInfo.getCreator());
            }
            if (deploymentInfo.getIgnoreApplicationStopFailures() != null) {
                jsonGenerator.writeFieldName("ignoreApplicationStopFailures").writeValue(deploymentInfo.getIgnoreApplicationStopFailures());
            }
            if (deploymentInfo.getAutoRollbackConfiguration() != null) {
                jsonGenerator.writeFieldName("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(deploymentInfo.getAutoRollbackConfiguration(), jsonGenerator);
            }
            if (deploymentInfo.getUpdateOutdatedInstancesOnly() != null) {
                jsonGenerator.writeFieldName("updateOutdatedInstancesOnly").writeValue(deploymentInfo.getUpdateOutdatedInstancesOnly());
            }
            if (deploymentInfo.getRollbackInfo() != null) {
                jsonGenerator.writeFieldName("rollbackInfo");
                RollbackInfoJsonMarshaller.getInstance().marshall(deploymentInfo.getRollbackInfo(), jsonGenerator);
            }
            if (deploymentInfo.getDeploymentStyle() != null) {
                jsonGenerator.writeFieldName("deploymentStyle");
                DeploymentStyleJsonMarshaller.getInstance().marshall(deploymentInfo.getDeploymentStyle(), jsonGenerator);
            }
            if (deploymentInfo.getTargetInstances() != null) {
                jsonGenerator.writeFieldName("targetInstances");
                TargetInstancesJsonMarshaller.getInstance().marshall(deploymentInfo.getTargetInstances(), jsonGenerator);
            }
            if (deploymentInfo.getInstanceTerminationWaitTimeStarted() != null) {
                jsonGenerator.writeFieldName("instanceTerminationWaitTimeStarted").writeValue(deploymentInfo.getInstanceTerminationWaitTimeStarted());
            }
            if (deploymentInfo.getBlueGreenDeploymentConfiguration() != null) {
                jsonGenerator.writeFieldName("blueGreenDeploymentConfiguration");
                BlueGreenDeploymentConfigurationJsonMarshaller.getInstance().marshall(deploymentInfo.getBlueGreenDeploymentConfiguration(), jsonGenerator);
            }
            if (deploymentInfo.getLoadBalancerInfo() != null) {
                jsonGenerator.writeFieldName("loadBalancerInfo");
                LoadBalancerInfoJsonMarshaller.getInstance().marshall(deploymentInfo.getLoadBalancerInfo(), jsonGenerator);
            }
            if (deploymentInfo.getAdditionalDeploymentStatusInfo() != null) {
                jsonGenerator.writeFieldName("additionalDeploymentStatusInfo").writeValue(deploymentInfo.getAdditionalDeploymentStatusInfo());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentInfoJsonMarshaller instance;

    public static DeploymentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentInfoJsonMarshaller();
        return instance;
    }

}
