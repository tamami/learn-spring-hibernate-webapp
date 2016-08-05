package lab.aikibo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SpptPK implements Serializable {
  private static final long serialVersionUID = 1L;

  public SpptPK(String nop, String thn) {
    this.nop = nop;
    this.thn = thn;
  }

  @Column(name = "NOP")
  private String nop;

  @Column(name = "THN")
  private String thn;

  // --- setter getter
  public String getNop() {
    return nop;
  }

  public void setNop(String nop) {
    this.nop = nop;
  }

  public String getThn() {
    return thn;
  }

  public void setThn(String thn) {
    this.thn = thn;
  }
}
