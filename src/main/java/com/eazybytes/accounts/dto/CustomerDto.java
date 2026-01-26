package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
        name = "Customer",
        description = "Schema to hold customer and account information"
)
@Data
public class CustomerDto {
    @Schema(
            description = "Mobile number of customer",
            example = "0712345678"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Name of customer",
            example = "Raphael Ndonga"
    )
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of customer",
            example = "xyz@mail.com"
    )
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email address should be  valid value")
    private String email;

    private AccountsDto accountsDto;
}
