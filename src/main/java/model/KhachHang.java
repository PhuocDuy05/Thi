package model;

/**
 *
 * Họ tên sinh viên:Nguyễn Phước Duy
 */
public class KhachHang {

    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //phương thức tính toán    
    public double getTieuThu() {
        double tieuThu = chisomoi - chisocu;
        return tieuThu;
    }

    public double getDinhMuc() {
        double dinhMuc = 0;
       // if (getTieuThu() = sonhankhau* 4) {
       //     dinhMuc = 6.700;
       // } else if (getTieuThu() /sonhankhau < 6) {
         //   dinhMuc = 12.900;
      //  } else if (getTieuThu() / sonhankhau > 6) {
       //     dinhMuc = 14.400;
       // }
        return dinhMuc;
    }

    public double tinhTienTra() {
        double tienTra = getDinhMuc() + getDinhMuc()*0.05 + getDinhMuc()*0.25 + getDinhMuc()*0.08; 
        return tienTra;
    }

}
