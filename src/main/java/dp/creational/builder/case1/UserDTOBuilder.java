package dp.creational.builder.case1;

import java.time.LocalDate;

//abstract builder
public interface UserDTOBuilder {
    //methods to build "parts" of product at a time.
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthDate(LocalDate birthDate);
    UserDTOBuilder withAddress(Address address);

    //method to "assemble" final product
    UserDTO build();

    //(optional) method to fetch already build object.
    UserDTO getUserDTO();
}
