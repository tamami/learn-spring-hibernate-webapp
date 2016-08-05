package lab.aikibo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import lab.aikibo.model.Sppt;
import lab.aikibo.model.SpptPK;

@Repository("spptDao")
public class SpptDaoImpl extends AbstractDao<Integer, Sppt> implements SpptDao {

  public List<Sppt> getAllSppt() {
    Criteria criteria = createEntityCriteria();
    return (List<Sppt>) criteria.list();
  }

  public List<Sppt> getSpptTerpilih() {

    Query qry = getSession().createQuery("from Sppt where spptPK = :pk");
		qry.setParameter("pk", new SpptPK("332901000100100010", "2013"));
		List<Sppt> list = (List<Sppt>) qry.list();

		return list;
  }
}
