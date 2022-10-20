package ca.bdeb.projetsynthese.dao;
import ca.bdeb.projetsynthese.models.Categorie;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CategogieDAO implements ICategorieDAO {

    @Override
    public List<Categorie> findAll() {
        return null;
    }

    @Override
    public List<Categorie> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Categorie> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Categorie> findAllById(Iterable<Long> longs) {
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
    public void delete(Categorie entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Categorie> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Categorie> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Categorie> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Categorie> findById(Long aLong) {
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
    public <S extends Categorie> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Categorie> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Categorie> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Categorie getOne(Long aLong) {
        return null;
    }

    @Override
    public Categorie getById(Long aLong) {
        return null;
    }

    @Override
    public Categorie getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Categorie> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Categorie> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Categorie> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Categorie> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Categorie> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Categorie> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Categorie, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
