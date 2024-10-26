package BaitapGiaoDich;

import java.time.LocalDate;
import java.util.Objects;

public abstract class GiaoDich {
	public abstract double getThanhTien();
	protected String maGD;
	protected LocalDate ngayGD;
	protected double donGia;
	protected double dientich;
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String ma) throws Exception {
		if (ma != null) {
			this.maGD = ma;
		}else {
			throw new Exception("Loi! Ma khong duoc rong");
		}	
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	
	//ham tao
	public GiaoDich() throws Exception {
		this("", LocalDate.now(), 0, 0);
	}
	public GiaoDich(String ma, LocalDate ngayGD, double donGia, double dientich) throws Exception {
		super();
		if (ma != null) {
			this.maGD = ma;
		}else {
			throw new Exception("Loi! Ma khong duoc rong");
		}
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dientich = dientich;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(maGD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGD, other.maGD);
	}
	@Override
	public String toString() {
		String s = "";
		s+=s.format("|%10s|%15s|%10s|%10s|", getMaGD(), getNgayGD(), getDonGia(), getDientich());
		return s;
	}
}
