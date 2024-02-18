package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.google.gson.annotations.SerializedName

import org.openapitools.client.models.V1EndpointPost200Response

interface DefaultApi {

    /**
    * enum for parameter stage
    */
    enum class StageV1EndpointPost(val value: kotlin.String) {
        @SerializedName(value = "prod") PROD("prod"),
        @SerializedName(value = "int") INT("int")
    }


    /**
    * enum for parameter type
    */
    enum class TypeV1EndpointPost(val value: kotlin.String) {
        @SerializedName(value = "value1") VALUE1("value1"),
        @SerializedName(value = "value2") VALUE2("value2"),
        @SerializedName(value = "value3") VALUE3("value3")
    }

    /**
     * 
     * 
     * Responses:
     *  - 200: Successful operation
     *
     * @param stage 
     * @param id  (optional)
     * @param type  (optional)
     * @param scope  (optional)
     * @param name  (optional)
     * @param description  (optional)
     * @param summary  (optional)
     * @param key  (optional)
     * @return [V1EndpointPost200Response]
     */
    @FormUrlEncoded
    @POST("v1/endpoint")
    suspend fun v1EndpointPost(@Header("Stage") stage: StageV1EndpointPost, @Field("id") id: kotlin.String? = null, @Field("type") type: kotlin.String? = null, @Field("scope") scope: kotlin.String? = null, @Field("name") name: kotlin.String? = null, @Field("description") description: kotlin.String? = null, @Field("summary") summary: kotlin.String? = null, @Field("key") key: kotlin.String? = null): Response<V1EndpointPost200Response>

}
