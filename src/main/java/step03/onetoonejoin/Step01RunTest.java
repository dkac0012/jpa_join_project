package step03.onetoonejoin;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import util.DBUtil;

public class Step01RunTest {

	@Test
	public void step01Test() {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = DBUtil.getEntityManager();
			tx = em.getTransaction();
			tx.begin();

			List<Emp> datas = em.createNativeQuery("select * from Emp", Emp.class).getResultList();

			tx.commit();
			System.out.println("정상출력" + datas);

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
				em = null;
			}
		}

	}
}
