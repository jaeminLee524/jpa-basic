package hellojpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    // 예시를 위해 추가
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    //Member 1:N MemberProduct
    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "team_id")
//    private Team team;
 }
