package ca.bdeb.projetsynthese.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationDTO {
    private LocalDate dateDeArrive;
    private LocalDate dateDeDepart;
    private Integer nombreAdulte;
    private Integer nombreEnfant;
    private Integer nombreBebe;
    private Integer nombreAnimauxAssistance;
    private String emailLocataire;
    private Integer hebergementId;
}
