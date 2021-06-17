package pdp.uz.sexnew.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pdp.uz.sexnew.entity.enums.Roles;
import pdp.uz.sexnew.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends AbsEntity {

    private String fullname;

    @Enumerated(EnumType.STRING)
    private Roles roles;

    private String phoneNumber;

}
