package pertemuan4.src;

import java.sql.Date;

abstract class Orang {
  // deklarasi variabel
  String nama;
  Date tanggalLahir;

  // constructor default
  public Orang(){

  }

  abstract public String getAlamat();
  abstract public void setAlamat(String alamat);
}