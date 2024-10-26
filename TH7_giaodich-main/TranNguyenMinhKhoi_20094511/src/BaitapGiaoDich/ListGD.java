package BaitapGiaoDich;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		ls = new ArrayList<GiaoDich>(2);
	}
	
	public boolean themGD(GiaoDich g) {
		if (!ls.contains(g)) {
			return false;
		}else {
			return ls.add(g);
		}
	}
	
	//xuat giao dich
	public List<GiaoDich> getAll(){
		return ls;
	}
	
	//sap xep
	public GiaoDich tim(String ma) {
		for (GiaoDich giaoDich : ls) {
			if (giaoDich.getMaGD().equalsIgnoreCase(ma))
				return giaoDich;
		}
		return null;
	}
	
	//xoa giao dich
	public boolean xoaGD (String maGD) {
		if (tim(maGD) != null)
			ls.remove(maGD);
		return false;
	}
	
}
