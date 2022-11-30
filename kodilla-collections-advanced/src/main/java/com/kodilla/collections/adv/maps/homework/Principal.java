package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String principalName;
    private String principalSurname;

    public Principal(String principalName, String principalSurname) {
        this.principalName = principalName;
        this.principalSurname = principalSurname;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getPrincipalSurname() {
        return principalSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Principal principal = (Principal) o;
        return Objects.equals(principal.principalName, principalName)
                && Objects.equals(principal.principalSurname, principalSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName, principalSurname);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                ", principalSurname'" + principalSurname + '\'' +
                '}';
    }
}
