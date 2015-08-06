package Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import DocGhiFile.DocFile;
import DocGhiFile.GhiFile;
import XuLyDuLieu.LocMail;

public class main {
	public static void main(String[] args) {
		DocFile docFile = new DocFile();
		LocMail locMail = new LocMail();
		GhiFile ghiFile = new GhiFile();
		ArrayList<String> arr = docFile.DocFile("/home/hoang/workspace/Spam-Mail/Data/test");
		HashSet<String> hash = locMail.locMail(arr);
		Iterator<String> iterator = hash.iterator();

//		 while (iterator.hasNext()) {
//		 System.out.println(iterator.next());
//		 }

		ghiFile.ghiFile(hash);

	}
}
