package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class io001 {

	// 改行コード定義
	static String zero_d_zero_a = "\r\n";

	public static void main(String[] args) {
		File file = new File("C:\\Users\\user\\Desktop\\java io 基本概念.log");

		List<String> list = new ArrayList<String>();

		//文字コードUTF-8を指定してファイルを読み込む
		FileInputStream input;
		try {
			input = new FileInputStream(file);
			InputStreamReader stream = new InputStreamReader(input, "UTF-8");
			BufferedReader buffer = new BufferedReader(stream);

			String line;
			//ファイルの最終行まで読み込む
			while ((line = buffer.readLine()) != null) {
				if (line.contains("不正ログインが検知されました")) {
					String[] parts = line.split("\\s+");
					if (parts.length >= 5) {
						String firstValue = parts[0];
						String secondValue = parts[1];
						String fifthValue = parts[4];
						System.out.println(firstValue + secondValue + fifthValue);
					}
				}
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		writeFile(list);

	}

	public static void writeFile(List<String> list) {

		File file = new File("C:\\Users\\user\\Desktop\\不正ログイン情報.log");

		try {
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

			for (String op : list) {

				out.write(op + zero_d_zero_a);
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
