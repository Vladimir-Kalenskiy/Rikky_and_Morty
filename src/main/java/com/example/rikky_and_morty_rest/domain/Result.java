package com.example.rikky_and_morty_rest.domain;

import lombok.Data;

import java.util.Date;

/**
 * Представляет информацию о конкретном персонаже.
 */
@Data
public class Result {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;
    private String url;
    private Date created;
}
