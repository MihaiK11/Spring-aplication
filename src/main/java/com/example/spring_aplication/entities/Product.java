package com.example.spring_aplication.entities;

import com.example.spring_aplication.entities.Store;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/12/2022, Sat
 **/
@Getter
@Setter
@Entity
@Table(name = "PRODUCT")
public class Product {

//    private String name;
//    private int price;
//    private int quantity;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userGenerator")
    @SequenceGenerator(name = "userGenerator", sequenceName = "seq")
    private long id;

    @Column(name = "NAME")
    private String name;

    @ManyToMany(targetEntity = Store.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinTable(
        name = "store_product",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "store_id")
    )
    @JsonBackReference
    private List<Store> stores;

}
