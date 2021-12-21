package com.busenurtopuz.caloriecounter.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private UserType userType;
    private String email;
    private String passwordHash;
    private String nameSurname;
    private UserState userState;
    private Date activationDate;
    private Date lastLogin;



}
