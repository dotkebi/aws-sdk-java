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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.json.*;

/**
 * GamePropertyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GamePropertyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GameProperty gameProperty, StructuredJsonGenerator jsonGenerator) {

        if (gameProperty == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (gameProperty.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(gameProperty.getKey());
            }
            if (gameProperty.getValue() != null) {
                jsonGenerator.writeFieldName("Value").writeValue(gameProperty.getValue());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GamePropertyJsonMarshaller instance;

    public static GamePropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GamePropertyJsonMarshaller();
        return instance;
    }

}
