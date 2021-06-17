package pdp.uz.sexnew.payload;

import lombok.Data;
import pdp.uz.sexnew.entity.Mebels;
import pdp.uz.sexnew.entity.Price;
import pdp.uz.sexnew.entity.User;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
public class WorkDto {

    private Integer client;

    private Integer worker;

    private Integer mebels;

    private Integer price;
}
