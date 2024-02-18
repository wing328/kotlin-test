# DefaultApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1EndpointPost**](DefaultApi.md#v1EndpointPost) | **POST** v1/endpoint | 





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)
val stage : kotlin.String = stage_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val summary : kotlin.String = summary_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : V1EndpointPost200Response = webService.v1EndpointPost(stage, id, type, scope, name, description, summary, key)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  | [enum: prod, int]
 **id** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional] [enum: value1, value2, value3]
 **scope** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **summary** | **kotlin.String**|  | [optional]
 **key** | **kotlin.String**|  | [optional]

### Return type

[**V1EndpointPost200Response**](V1EndpointPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded; charset=utf-8
 - **Accept**: application/json

