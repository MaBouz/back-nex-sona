package sesame.com;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import sesame.com.entities.Produit;
import sesame.com.repositories.ProduitRepository;
import sesame.com.services.ProduitRestController;
@SpringBootApplication
public class ApiAndroidApplication {
@Autowired
private ProduitRestController prodRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiAndroidApplication.class, args);
	}
	@Bean
	CommandLineRunner start() {
		return args -> {
			
			prodRepository.save(new Produit(null,"DELL",1000.0,new Date()));
			prodRepository.save(new Produit(null,"HP",1200.0,new Date()));
			prodRepository.save(new Produit(null,"ACER",800.0,new Date()));

			//customerRepository.findAll().forEach(System.out::println);
		};
	}

}
