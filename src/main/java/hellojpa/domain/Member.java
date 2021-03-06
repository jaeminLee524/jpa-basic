package hellojpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;

    // 예시를 위해 추가
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    //Member 1:N MemberProduct
    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts = new ArrayList<>();

    @Embedded
    private Period workPeriod;

    @Embedded
    private Address homeAddress;




//    @ManyToOne
//    @JoinColumn(name = "team_id")
//    private Team team;
 }
