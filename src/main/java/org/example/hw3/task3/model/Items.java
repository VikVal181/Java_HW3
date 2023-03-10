package org.example.hw3.task3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {

    private String title;
    private String author;
    private Integer price;
    private Integer year;
    private Integer pages;

}
