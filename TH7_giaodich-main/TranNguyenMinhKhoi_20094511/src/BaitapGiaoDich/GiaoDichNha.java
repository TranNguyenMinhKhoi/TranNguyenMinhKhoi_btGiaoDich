package BaitapGiaoDich;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;

// dong goi
	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	@Override
	public double getThanhTien() {
		if (getLoaiNha() == "caocap") {
			return getDientich()*getDonGia();
		}else {
			return getDientich()*getDonGia()*0.9;
		}
	}

	public GiaoDichNha() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(String ma, LocalDate ngayGD, double donGia, double dientich) throws Exception {
		super(ma, ngayGD, donGia, dientich);
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(String ma, LocalDate ngayGD, double donGia, double dientich, String loaiNha, String diaChi)
			throws Exception {
		super(ma, ngayGD, donGia, dientich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		String s2 = "";
		s2+=s2.format("%10s|%10s|", getLoaiNha(), getThanhTien());
		return super.toString()+s2;
	}
}
