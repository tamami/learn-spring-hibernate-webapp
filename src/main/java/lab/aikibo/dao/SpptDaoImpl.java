package lab.aikibo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import lab.aikibo.model.Sppt;

@Repository("spptDao")
public class SpptDaoImpl extends AbstractDao<Integer, Sppt> implements SpptDao {
  public List<Sppt> getAllSppt() {
    Criteria criteria = createEntityCriteria();
    return (List<Sppt>) criteria.list();
  }
}
