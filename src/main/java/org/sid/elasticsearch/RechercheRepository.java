package org.sid.elasticsearch;


import org.sid.entite.Annonce;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "annonceElastic")
public interface RechercheRepository extends ElasticsearchRepository<Annonce, String> {

    public List<Annonce> findAnnonceByCategorie(String cat);
    public List<Annonce> findAnnonceBySousCategorie(String scat);
    public List<Annonce> findAnnonceByGouvernorat(String gov);
    public List<Annonce> findAnnonceByVille(String ville);

    @Query("{\"bool\": {\"should\": [{\"query_string\": {\"query\": \"?0\"}}]}}")
    public List<Annonce> findAnnonceByMotCle(String motCle);
}
