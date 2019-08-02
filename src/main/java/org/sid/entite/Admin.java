package org.sid.entite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Utilisateur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Utilisateur {
    private boolean etatAdmin ;
    private Date dateAdmin;
}
