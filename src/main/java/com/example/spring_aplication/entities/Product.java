package com.example.demo.entities;

import com.example.spring_aplication.entities.Store;
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

    private List<Store> stores;

}
