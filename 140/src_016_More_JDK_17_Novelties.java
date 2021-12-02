package jdk17;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String socialSecurityNumber;

    @Override
    public int hashCode() {
        return Objects.hash(birthDay, firstName, lastName, 
            socialSecurityNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(birthDay, other.birthDay) 
                && Objects.equals(firstName, 
                       other.firstName)
                && Objects.equals(lastName, other.lastName)
                && Objects.equals(socialSecurityNumber, 
                       other.socialSecurityNumber);
    }
    
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + 
            ", lastName=" + lastName + 
            ", birthDay=" + birthDay + 
            ", socialSecurityNumber=" + 
                    socialSecurityNumber + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String 
          socialSecurityNumber) {
        this.socialSecurityNumber = 
            socialSecurityNumber;
    }
}
