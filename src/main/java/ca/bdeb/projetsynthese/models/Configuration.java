package ca.bdeb.projetsynthese.models;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Adresse")
@Validated
@ApiModel(value = "Adresse Entity")
public class Configuration {

    // todo: Lydia ajouter xxx

    // todo: Luisa ajouter atruu

}
