package ca.bdeb.projetsynthese.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IAdministrateurRepositoryTest {
    @Autowired
    private IAdministrateurRepository administrateurRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll(){
        System.out.println(administrateurRepository.findById(1).get());
    }

}