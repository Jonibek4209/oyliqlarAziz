package pdp.uz.sexnew.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pdp.uz.sexnew.entity.enums.Roles;
import pdp.uz.sexnew.entity.template.AbsEntity;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Work extends AbsEntity {

    @ManyToOne
    private  User client;

    @ManyToOne
    private User worker;

    @ManyToOne
    private Mebels mebels;

    @OneToOne
    private Price price;


}
