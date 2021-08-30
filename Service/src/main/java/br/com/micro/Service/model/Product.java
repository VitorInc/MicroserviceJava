package br.com.micro.Service.model;


import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Document(indexName = "product", indexStoreType = "catalog")
public class Product {
    private Long id;
    private String name;
    private Integer amount;



}
