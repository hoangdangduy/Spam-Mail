package DocGhiFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DocFile {

	public ArrayList<String> DocFile(String path) {
		BufferedReader br = null;
		ArrayList<String> arr = new ArrayList<String>();
		try {
			String sCurrentLine;

			br = new BufferedReader(new FileReader(path));
			while ((sCurrentLine = br.readLine()) != null) {
				String[] split = sCurrentLine.split(" ");
				// System.out.println(sCurrentLine);
				for (int i = 0; i < split.length; i++)
					arr.add(split[i]);
			}
		} catch (Exception e) {
		}
		return arr;
	}

}

//test commit 123 123
