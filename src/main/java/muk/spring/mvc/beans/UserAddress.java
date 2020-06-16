package muk.spring.mvc.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

public class UserAddress {

    @NotBlank(message = "{address.street}")
    private String street;

    @Size(min=2, max=2, message = "Size of state must be 2")
    private String state;

    @NotNull(message = "zipcode is a required field")
    private Integer zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }
}
