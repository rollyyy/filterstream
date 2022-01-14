package ioPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		
		//수업시간에 진행했던 코드를 백지에서 다시 시작하여 복습해보았다.
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/ioPractice/Application1"));
		
		bw.write("안녕하세요\n");
		bw.write("반갑습니다\n");
		
		bw.flush();
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		BufferedReader br = null; 
		
		try {
			br = new BufferedReader(new FileReader("src/ioPractice/Application1"));
			
			String temp;
			
			while((temp = br.readLine()) != null ) {
				
				System.out.println(temp);
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
