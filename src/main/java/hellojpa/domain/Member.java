package hellojpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    // 예시를 위해 추가
    @OneToMany(mappedBy = "MEMBER_ID")
    private List<Order> orders = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "team_id")
//    private Team team;
}