package hellojpa.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;
}
