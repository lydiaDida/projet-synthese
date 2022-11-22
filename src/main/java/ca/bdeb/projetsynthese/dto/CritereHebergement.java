package ca.bdeb.projetsynthese.dto;

import ca.bdeb.projetsynthese.models.SecteurDeHebergement;
import ca.bdeb.projetsynthese.models.TypeDeHebergement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CritereHebergement {
    private int id;
//    private float prixMin;
//    private float prixMax;
//    private float fraisDeNettoyage;
//    private float fraisDeService;
    private String prixMin;
    private String prixMax;
    private String fraisDeNettoyage;
    private String fraisDeService;
    private boolean etatDeHebergement = true;
//    private int typeDeHebergementId;
//    private int secteurDeHebergementId;
    private String typeDeHebergementId;
    private String secteurDeHebergementId;
    private LocalDate dateDeArrive;
    private LocalDate dateDeDepart;
}
