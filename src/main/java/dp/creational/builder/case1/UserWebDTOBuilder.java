package dp.creational.builder.case1;

import java.time.LocalDate;
import java.time.Period;

// The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate birthDate) {
        Period ageInYears = Period.between(birthDate, LocalDate.now());
        //Integer.toString is more efficient than String.valueOf.
        this.birthDate = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" + address.getCity() + "\n" + address.getState() + ", " + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, birthDate);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
