package com.example.controller;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class EqualEmail implements Serializable {

    private static final long serialVersionID = 1L;

    @NotNull
    @Size(min = 1, max = 50)
    private String name;

    @NotNull
    @Size(min = 9, max = 11)
    private String tel;

    @NotNull
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private String dateOfBirth;

    @NotNull
    @Size(min = 9, max = 256)
    private String email;

    @Size(min = 1, max = 10)
    private String address;

    @AssertTrue
    private boolean isAgreed;

}
