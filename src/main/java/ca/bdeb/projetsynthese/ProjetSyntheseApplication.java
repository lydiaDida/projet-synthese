package ca.bdeb.projetsynthese;



import ca.bdeb.projetsynthese.dao.ICategorieDAO;
import ca.bdeb.projetsynthese.dao.IProprieteDAO;
import ca.bdeb.projetsynthese.models.Categorie;
import ca.bdeb.projetsynthese.models.Propretie;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ProjetSyntheseApplication implements CommandLineRunner {
	@Autowired private ICategorieDAO iCategorieDAO;
	@Autowired private IProprieteDAO iProprieteDAO;
	public static void main(String[] args) {
		SpringApplication.run(ProjetSyntheseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iCategorieDAO.save(new Categorie(null,"Maison",null));
		iCategorieDAO.save(new Categorie(null,"double",null));
		iCategorieDAO.save(new Categorie(null,"triplet",null));
		iCategorieDAO.save(new Categorie(null,"duplex",null));
		Random r = new Random();
		iCategorieDAO.findAll().forEach(c-> {
			iProprieteDAO.save(new Propretie(null, RandomString.make(6),RandomString.make(33),"",(100+r.nextInt(122)),c));
			iProprieteDAO.save(new Propretie(null, RandomString.make(6),RandomString.make(33),"",(100+r.nextInt(122)),c));
			iProprieteDAO.save(new Propretie(null, RandomString.make(6),RandomString.make(33),"",(100+r.nextInt(122)),c));
			iProprieteDAO.save(new Propretie(null, RandomString.make(6),RandomString.make(33),"",(100+r.nextInt(122)),c));
			iProprieteDAO.save(new Propretie(null, RandomString.make(6),RandomString.make(33),"",(100+r.nextInt(122)),c));
			iProprieteDAO.save(new Propretie(null, RandomString.make(6),RandomString.make(33),"",(100+r.nextInt(122)),c));


		});


	}
}
