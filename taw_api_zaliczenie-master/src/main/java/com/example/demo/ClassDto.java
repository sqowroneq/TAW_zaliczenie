package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;


@JsonSerialize
@Data
public class ClassDto {
    @JsonProperty("id")
    Integer id;

    @JsonProperty("nazwa")
    String name;

    @JsonProperty("ects")
    Integer ects;

    @JsonProperty("sala")
    Integer sala;

    @JsonProperty("egzamin")
    Boolean isExam;

    public ClassDto(Integer id, String name, Integer ects, Integer sala, Boolean isExam) {
        this.id = id;
        this.name = name;
        this.ects = ects;
        this.sala = sala;
        this.isExam = isExam;
    }
}
