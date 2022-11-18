package ca.bdeb.projetsynthese.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class CommentaireRepositoryTest {
    @Autowired
    private ICommentaireRepository commentaireRepository;

    @Test
    void testFindAll() {
//        Logger logger = LoggerFactory.getLogger(CommantaireRepositoryTest.class);
//        logger.info(String.valueOf(commantaireRepository.findAll()));
    }

}