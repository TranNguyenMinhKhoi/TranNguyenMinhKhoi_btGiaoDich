package BaitapGiaoDich;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;
	
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	@Override
	public double getThanhTien() {
		if (getLoaiDat() == "A") {
			return getDientich()*getDonGia()*1.5;
		}else {
			return getDientich()*getDonGia();
		}
	}
	
	public GiaoDichDat() throws Exception {
	}

	public GiaoDichDat(String ma, LocalDate ngayGD, double donGia, double dientich) throws Exception {
		super(ma, ngayGD, donGia, dientich);
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String ma, LocalDate ngayGD, double donGia, double dientich, String loaiDat) throws Exception {
		super(ma, ngayGD, donGia, dientich);
		this.loaiDat = loaiDat;
	}
	
	@Override
	public String toString() {
		String s1 = "";
		s1+=s1.format("%10s|%10s|", getLoaiDat(), getThanhTien());
		return super.toString()+s1;
	}
}
