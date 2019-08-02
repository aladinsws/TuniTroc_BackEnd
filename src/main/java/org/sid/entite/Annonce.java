package org.sid.entite;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@org.springframework.data.elasticsearch.annotations.Document(indexName = "indexannonce" ,type = "annonce",shards = 2)
@Document //create  Category
@Data                       //getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Annonce {
    @Id
    private String id;
    private String image1;
    private String image2;
    private String image3;
    private String titre;
    private String description;
    private String type;
    private String tel;
    private String gouvernorat;
    private String ville;
    private Date datePublication ;
    private Boolean disponible ;
    private String prixLocation;
    private boolean etatSuppression;
    private List<String> echangePar;
    private Collection<String> Suggestion=new ArrayList<>();
    private  Collection<Commentaire> commentaires=new ArrayList<>();
    private String categorie;
    private String sousCategorie;
    private String username;
//    @JsonBackReference(value="abonne-annonces")


}
