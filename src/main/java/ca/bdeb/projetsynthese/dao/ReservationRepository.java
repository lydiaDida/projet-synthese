package ca.bdeb.projetsynthese.dao;

import ca.bdeb.projetsynthese.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
