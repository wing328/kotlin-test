/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param id 
 * @param type 
 * @param scope 
 * @param name 
 * @param description 
 */


data class RequestModelA (

    @SerializedName("id")
    val id: kotlin.String,

    @SerializedName("type")
    val type: RequestModelA.Type,

    @SerializedName("scope")
    val scope: kotlin.String,

    @SerializedName("name")
    val name: kotlin.String,

    @SerializedName("description")
    val description: kotlin.String

) {

    /**
     * 
     *
     * Values: VALUE1,VALUE2,VALUE3
     */
    enum class Type(val value: kotlin.String) {
        @SerializedName(value = "value1") VALUE1("value1"),
        @SerializedName(value = "value2") VALUE2("value2"),
        @SerializedName(value = "value3") VALUE3("value3");
    }
}

