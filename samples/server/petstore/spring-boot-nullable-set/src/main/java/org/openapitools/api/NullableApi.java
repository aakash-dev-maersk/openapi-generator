/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ObjectWithUniqueItems;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
@Validated
@Tag(name = "nullable", description = "the nullable API")
public interface NullableApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /nullable
     * nullable test
     *
     * @param objectWithUniqueItems  (optional)
     * @return processed (status code 204)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "nullableTest",
        description = "nullable test",
        responses = {
            @ApiResponse(responseCode = "204", description = "processed"),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/nullable",
        consumes = "application/json"
    )
    
    default ResponseEntity<Void> nullableTest(
        @Parameter(name = "ObjectWithUniqueItems", description = "") @Valid @RequestBody(required = false) ObjectWithUniqueItems objectWithUniqueItems
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
