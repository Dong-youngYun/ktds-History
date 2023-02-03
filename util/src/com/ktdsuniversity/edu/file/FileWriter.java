package com.ktdsuniversity.edu.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriter { // 예외 잡으라 하면 그냥 잡아/ 던질거면 runtime으로 바꿔서 던져

	public static File createNewFile() throws IOException { // textFile.createNewFile();이 해야될 try catch의 책임을 떠넘김
		File testFile = new File("C:\\logs", "test.txt"); // 타입 활용법 모를때 crtl 클릭 \표현위해 \한개 더들어가 / c드라이브 logs 폴더안에서
															// test.txt파일을 가져오거나 정의하겟다 / txt 없으면 logs라는 파일을 가져오겟다
		testFile.createNewFile();
		return testFile;
	}

	public static File createNewFileThrowsRuntimeException() {
		File textFile = new File("C:\\logs", "text.txt");
		try {
			textFile.createNewFile();
		} catch (IOException ioe) {
			throw new RuntimeException(ioe.getMessage(), ioe); // throw 예외객체/Runtime으로 바꿔서 던져 /받는 쪽에서 굳이 잡을필요없어 근데 JVM에
																// 에러가 전달되/ 잡을거면 잡고 말려면 마
		} // ioe를 줬기때문에 cause by문이 나와 /예외를 던질때는 메세지와 원래 발생한 예외객체를 적어서 던져줘야 해 ioe
		return textFile; // 내가 뭘할지 모르겟으니 던져줄테니 니가 해봐
	}

	public static void main(String[] args) {

//		File textFile = new File("C:\\logs", "text.txt");
		File textFile = new File("C:\\logs");
		if (textFile.isDirectory()) {
			// if(textFile.exists() && textFile.isFile()) { //파일이 존재하고 폴더가 아니라 파일이라면 /내용을
			// 연결하거나 쓸때 Stream/ Stream같은 연결 객체들은 닫는게 원칙 아니면 메모리누수일어난다
			// java.io.OutputStream
			// java.io.FileOutputStream /import할때 참고
			OutputStream fos = null;
			try {
				fos = new FileOutputStream(textFile);
				fos.write("파일 내용을 씁니다.".getBytes()); // 파일 아웃풋을 쓰는 방법 /add catch to surround~~~ // ""문자열을 바이트배열 형식으로 바꿔주기 위해 getByte
				fos.flush();
				// fos.close(); //.close 이런애들은 무조건 finally에 에러가 낫든 안낫든 메모리누수를 막기위해 무조건 닫아야해서
			} catch (FileNotFoundException e) {
//				e.printStackTrace();
			} catch (IOException e) {
//				e.printStackTrace();
			} finally {
				if (fos != null) { //try에서 if 쓰면 길어지니까 finally 전체에서 해
					try {
						fos.close(); // 얘가 지금 null이다 close를 할때는 무조건 null체크필수 fos=null로 줘서 
										//fos = new FileOutputStream(textFile);에서 터져 fos자체가 이미 null이야
					} catch (IOException e) {
					} // finally에서 오류는 우리가 할수 있는게 없어 지워 e.printStackTrace();
				}
			}
		}

////		createNewFileThrowsRuntimeException();
//		try {
//			createNewFile(); //얘한테 책임 떠넘김 또 떠넘김 main은 JVM이 해 JVM에게 떠넘겨 근데 JVM은 try catch를 안해 에러나와 윈도우가 준 에러 우리 인코딩과 윈도우 인코딩이 달라서 글자깨져
//		}						
//		catch (IOException ioe) {
//			System.out.println("에러가 발생했습니다." + ioe.getMessage());
//		}
//	}
	}
}
//자바는 괜찮은데 웹으로 가면 우리가 보는 에러들이 사용자들에게 보여진다. (보안상 매우 위험해)