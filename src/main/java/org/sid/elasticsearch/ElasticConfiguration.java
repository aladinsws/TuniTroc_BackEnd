package org.sid.elasticsearch;



import org.elasticsearch.client.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "org.sid.elasticsearch")
public class ElasticConfiguration {

//    @Bean
//    public Client client() {
//        Settings elasticsearchSettings = Settings.builder()
//                .put("client.transport.sniff", true)
//                .put("path.home", elasticsearchHome)
//                .put("cluster.name", clusterName).build();
//        TransportClient client = new PreBuiltTransportClient(elasticsearchSettings);
//        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
//        return client;
//    }
//
//    @Bean
//    public ElasticsearchOperations elasticsearchTemplate() {
//        return new ElasticsearchTemplate(client());
//    }

}
