package hellojpa.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Team {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;
    private String name;
}
