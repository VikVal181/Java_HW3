package org.example.hw3.task2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {

    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer sort;

}
