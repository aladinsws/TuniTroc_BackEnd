package org.sid.entite;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    @Id
    private String id;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String nom;
    private String prenom;
    private String image;
    private String tel;
    private String email;
    private String adresse;
    private Collection<String> roles=new ArrayList<>();



//    @JsonManagedReference(value="abonne-annonces")
    @DBRef
    private Collection<Annonce> annonces=new ArrayList<>();
    private Collection<String> favoris=new ArrayList<>();

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", etat=" + etat +
                ", dateInscription=" + dateInscription +
                ", roles=" + roles +
                ", annonces=" + annonces +
                '}';
    }


























    private boolean etatAdmin ;
    private boolean etat;
    private Date dateAdmin;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy")
    private Date dateInscription;
}
