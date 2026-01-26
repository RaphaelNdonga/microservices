package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Response to hold successful response information"
)
@Data @AllArgsConstructor
public class ResponseDto {
    @Schema(
            name = "Status Code",
            example = "200"
    )
    private String statusCode;

    @Schema(
            name = "Status Message",
            example = "Request processed successfully"
    )
    private String statusMsg;
}
