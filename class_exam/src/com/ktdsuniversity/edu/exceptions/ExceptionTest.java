package com.ktdsuniversity.edu.exceptions;

import java.awt.image.ImagingOpException;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionTest {

	public static void main(String[] args) {

		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("잘못된 경로")); // Exception 던지는 애들은 다 빨간줄이 나온다.
		} 
		catch (IOException ioe) {
			try {
				lines = Files.readAllLines(Paths.get("올바른 경로")); //위아래 둘다 안되면 할 수 있는게 없다.
			}
			catch (IOException ioe2) {
				System.out.println("???");
			}
		}
		System.out.println("숫자로 변환 시작");

		String str = "465 ";
		try {
			int number = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			System.out.println("숫자로 변환중에 에러가 발생했습니다." + nfe.getMessage());
		}

		System.out.println("숫자로 변환 종료");
	}

}
