package game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.security.ntlm.NTLMException;

import game.fields.Field;

public class MapReader {
	public static Board read(String path, State state) {

		try {
			InputStream is = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			line = br.readLine();
			Board b = new Board(Integer.parseInt(line));
			int row = 0;
			while ((line = br.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					char x = line.charAt(i);
						Field f = FieldFactory.charToField(x, state);
						b.setField(row,  i, f);
				}
				row++;
			}
			return b;
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

}
