/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package br.pegoraro.feed.generated.api;

import br.pegoraro.feed.generated.api.model.AuthRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-18T21:31:07.973792343-03:00[America/Sao_Paulo]")
@Validated
@Tag(name = "auth", description = "the auth API")
public interface AuthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /auth
     * Based on the name you provide, all feed will fall under your name in searches. Will hash within storage. 
     *
     * @param authRequestDto  (optional)
     * @return Will return a token that will be on for 24h or 7d based on extent provided  (status code 200)
     */
    @Operation(
        operationId = "authenticate",
        responses = {
            @ApiResponse(responseCode = "200", description = "Will return a token that will be on for 24h or 7d based on extent provided ")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> _authenticate(
        @Parameter(name = "AuthRequestDto", description = "") @Valid @RequestBody(required = false) AuthRequestDto authRequestDto
    ) {
        return authenticate(authRequestDto);
    }

    // Override this method
    default  ResponseEntity<Void> authenticate(AuthRequestDto authRequestDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
