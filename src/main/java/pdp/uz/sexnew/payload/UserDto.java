package pdp.uz.sexnew.payload;

import lombok.Data;
import pdp.uz.sexnew.entity.enums.Roles;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class UserDto {

    private String fullname;

    private Roles roles;

    private String phoneNumber;

}
