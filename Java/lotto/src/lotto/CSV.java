package lotto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSV {

	public static void main(String[] args) {
		
		// 파일을 읽어 온다.
		
		try {
			List<String> csv = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\점수표.csv"));
			// 라인별로 반복한다.
			for(int i = 0; i<csv.size(); i+=1) {
				if (i==0) {
					continue;
					//break;
				}
				//라인을 "," 로 분리한다.
				String[] strArr = csv.get(i).split(",");
				/*
				 * strArr[0] = Java
				 * strArr[1] = 100
				 * strArr[2] = A+
				 */
				//분리된 텍스트를 반복하여 출력한다.	
				//반복2번, 반복중첩이 여러번이면 문제있는 코드
				//for each문 위의 데이터를 순서대로 가지고 와서 
//				for (String word: strArr) {
//					System.out.println(word);
//				}
				System.out.println(strArr[0] + "과목의 점수는 "
                                 + strArr[1] + "점이고 등급은 "
						         + strArr[2] + "입니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}


