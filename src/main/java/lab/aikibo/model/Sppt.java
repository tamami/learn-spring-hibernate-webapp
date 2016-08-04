package lab.aikibo.model;

import java.io.Serializable;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="sppt_terhutang")
public class Sppt {

  @EmbeddedId
  private SpptPK pk;

  @Column(name = "nama")
  private String nama;

  @Column(name = "alamat_op")
  private String alamatOp;

  @Column(name = "pokok")
  private BigInteger pokok;

  @Column(name = "denda")
  private BigInteger denda;

  // --- setter getter

  public SpptPK getPk() {
    return pk;
  }

  public void setPk(SpptPK pk) {
    this.pk = pk;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getAlamatOp() {
    return alamatOp;
  }

  public void setAlamatOp(String alamatOp) {
    this.alamatOp = alamatOp;
  }

  public BigInteger getPokok() {
    return pokok;
  }

  public void setPokok(BigInteger pokok) {
    this.pokok = pokok;
  }

  public BigInteger getDenda() {
    return denda;
  }

  public void setDenda(BigInteger denda) {
    this.denda = denda;
  }

  // --- inherit

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Integer.parseInt(pk.getNop());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null) return false;
    if(!(obj instanceof Sppt)) return false;

    Sppt other = (Sppt) obj;
    if(pk != other.pk) return false;
    return true;
  }

}
