package ca.bdeb.projetsynthese.dao;

import ca.bdeb.projetsynthese.models.Propretie;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ProprieteDAO implements IProprieteDAO{

    @Override
    public List<Propretie> findAll() {
        return null;
    }

    @Override
    public List<Propretie> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Propretie> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Propretie> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Propretie entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Propretie> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Propretie> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Propretie> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Propretie> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Propretie> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Propretie> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Propretie> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Propretie getOne(Long aLong) {
        return null;
    }

    @Override
    public Propretie getById(Long aLong) {
        return null;
    }

    @Override
    public Propretie getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Propretie> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Propretie> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Propretie> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Propretie> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Propretie> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Propretie> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Propretie, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
