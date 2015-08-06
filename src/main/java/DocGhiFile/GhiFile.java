package DocGhiFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class GhiFile {
	public void ghiFile(HashSet<String> hashListMail) {
		// Dung TreeSet de ghi ra file theo thu tu ABC
		TreeSet<String> treeSetMail = new TreeSet<String>();
		treeSetMail.addAll(hashListMail);

		File writeFile = new File("/home/hoang/workspace/Spam-Mail/Data/FileDaPhanTich");
		if (!writeFile.exists()) {
			try {
				writeFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			FileWriter writer = new FileWriter(writeFile);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			Iterator<String> itr = treeSetMail.iterator();
			while (itr.hasNext()) {
				bufferedWriter.write(itr.next() + "\n");
				bufferedWriter.flush();
			}
		} catch (Exception e) {
		}
	}
}
