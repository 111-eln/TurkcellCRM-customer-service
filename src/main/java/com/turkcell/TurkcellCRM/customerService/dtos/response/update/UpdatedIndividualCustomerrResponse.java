package com.turkcell.TurkcellCRM.customerService.dtos.response.update;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatedIndividualCustomerrResponse {
    private String firstName;
    private String lastName;
    private String nationalityNumber;
}