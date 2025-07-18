/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.ml;

import javax.annotation.Generated;
import org.opensearch.client.json.JsonEnum;
import org.opensearch.client.json.JsonpDeserializable;

// typedef: ml.ByteOrder

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public enum ByteOrder implements JsonEnum {
    BigEndian("BIG_ENDIAN"),

    LittleEndian("LITTLE_ENDIAN");

    private final String jsonValue;

    ByteOrder(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public String jsonValue() {
        return this.jsonValue;
    }

    public static final JsonEnum.Deserializer<ByteOrder> _DESERIALIZER = new JsonEnum.Deserializer<>(ByteOrder.values());
}
