package tn.esprit.tpfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    String idReservation;
    Date anneeUniversiatire;
    Boolean estValide;

    @ManyToMany()
    Set<Etudiant> etudiants;


}
