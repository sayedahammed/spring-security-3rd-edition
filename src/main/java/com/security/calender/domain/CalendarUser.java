package com.security.calender.domain;

import java.io.Serializable;
import java.security.Principal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.Subject;

/**
 * {@link CalendarUser} is this applications notion of a user. It is good to use your own objects to interact with a
 * user especially in large applications. This ensures that as you evolve your security requirements (update Spring
 * Security, leverage new Spring Security modules, or even swap out security implementations) you can do so easily.
 *
 * @author Rob Winch
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalendarUser implements Principal, Serializable {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean implies(Subject subject) {
        return Principal.super.implies(subject);
    }
} // The End...
