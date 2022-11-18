package ca.bdeb.projetsynthese.services;

import ca.bdeb.projetsynthese.dao.*;
import ca.bdeb.projetsynthese.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private IReservationRepository repository;

    @Autowired
    private ILocataireRepository ILocataireRepository;

    @Autowired
    private IHebergementRepository IHebergementRepository;

    @Autowired
    private IFactureRepository IFactureRepository;

    @Autowired
    private ICarteCreditRepository carteCreditRepository;

    // get reservation list
    public List<Reservation> getReservationList() {
        return repository.findAll();
    }

    // get reservation by numero(id)
    public Reservation getReservationByNumero(Integer numero) {
        return repository.findByNumeroDeReservation(numero);
    }

    // add reservation
    public Reservation addReservation(Reservation reservation) {
        // get locataire for this reservation
        Locataire locataire =
                ILocataireRepository.findByEmailLocataire(reservation.getLocataire().getEmailLocataire());
        reservation.setLocataire(locataire);

        // get hebergement for this reservation
        Hebergement hebergement =
                IHebergementRepository.findById(reservation.getHebergement().getId()).get();
        reservation.setHebergement(hebergement);

        // get facture for this reservation
        Facture facture =
                IFactureRepository.findByNumeroDeFacture(reservation.getFacture().getNumeroDeFacture());

        // get credit car for this reservation
        CarteCredit carteCredit =
                carteCreditRepository.findByNumero(reservation.getCarteCredit().getNumero());
        reservation.setCarteCredit(carteCredit);
        // todo: modifier disponibiliteDeLogementList

        // todo: ajout facture


        // add reservation
        return repository.save(reservation);
    }

    // update reservation
    public Reservation updateReservation(Reservation reservation) {
        // get reservation if it exists
        Reservation reservationExisted =
                repository.findByNumeroDeReservation(reservation.getNumeroDeReservation());

        if (reservationExisted != null) {
            reservationExisted = reservation;

            // get reservation for this reservation
            Locataire locataire =
                    ILocataireRepository.findByEmailLocataire(reservation.getLocataire().getEmailLocataire());
            reservationExisted.setLocataire(locataire);

            // get hebergement for this reservation
            Hebergement hebergement =
                    IHebergementRepository.findById(reservation.getHebergement().getId()).get();
            reservationExisted.setHebergement(hebergement);

            // get facture for this reservation
            Facture facture =
                    IFactureRepository.findByNumeroDeFacture(reservation.getFacture().getNumeroDeFacture());
            reservationExisted.setFacture(facture);

            // get credit car for this reservation
            CarteCredit carteCredit =
                    carteCreditRepository.findByNumero(reservation.getCarteCredit().getNumero());
            reservationExisted.setCarteCredit(carteCredit);

            //todo: modifier disponibiliteDeLogementList

            return repository.save(reservation);
        } else {
            return null;
        }
    }

    // delete reservation
    public void deleteReservation(Integer numero) {
        Reservation reservation = repository.findByNumeroDeReservation(numero);
        repository.delete(reservation);
    }
}
