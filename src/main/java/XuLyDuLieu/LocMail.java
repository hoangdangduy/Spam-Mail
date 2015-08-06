package XuLyDuLieu;

import java.util.ArrayList;
import java.util.HashSet;

public class LocMail {

	static String[] listMail = { "@gmail.com", "@hotmail.com", "@live.com", "@yahoo.com" };

	/*
	 * Kiem tra String co phai la dia chi mail hay ko? Mail -> return true
	 */
	public boolean phanTichMail(String str) {
		for (int i = 0; i < listMail.length; i++) {
			if (str.toLowerCase().contains(listMail[i])) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Them mail vao 1 HashSet
	 */
	public HashSet<String> locMail(ArrayList<String> arr) {
		HashSet<String> hashListMail = new HashSet<String>();
		for (int i = 0; i < arr.size(); i++) {
			if (phanTichMail(arr.get(i)))
				hashListMail.add(arr.get(i));
		}
		return hashListMail;
	}
}
