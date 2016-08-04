package lab.aikibo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import lab.aikibo.dao.SpptDao;
import lab.aikibo.model.Sppt;

@Service("spptService")
@Transactional
public class SpptServiceImpl implements SpptService {
  @Autowired
  private SpptDao dao;

  /*
  public Sppt getSpptByNopThn(String nop, String thn) {
    Sppt sppt = spptRespository.getSpptByNopThn(nop, thn);

    return sppt;
  }
  */
  public List<Sppt> getAllSppt() {
    return dao.getAllSppt();
  }
}
