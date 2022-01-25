package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // WerServer가 올라오는 시점에 딱 한개만 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        // begin transaction
        tx.begin();

        try {
            // select one
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("helloJPA");

            // select all
            List<Member> members = em.createQuery("select m from Member m", Member.class)
                    .getResultList();


            members.forEach(System.out::println);
            members.forEach(m -> System.out.println("member.name " + m.getName()));

            // commit transaction
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
