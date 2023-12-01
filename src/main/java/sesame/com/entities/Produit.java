package sesame.com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Produit {
		@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
		private Long idProduit;
		private String nomProduit;
		private double prixProduit;
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date dateCreation;
}
