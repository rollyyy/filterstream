package ioPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		DataOutputStream dout = null;
		
		
		try {
			dout = new DataOutputStream(new FileOutputStream("src/ioPractice/Application"));
		
		dout.writeUTF("김영희");
		dout.writeInt(95);
		dout.writeChar('A');
		dout.writeUTF("김철수");
		dout.writeInt(87);
		dout.writeChar('B');
		dout.writeUTF("홍길동");
		dout.writeInt(73);
		dout.writeChar('C');
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dout != null) {
				try {
					dout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		DataInputStream din = null;
		
		try {
			din = new DataInputStream(new FileInputStream("src/ioPractice/Application"));
		
			while(true) {
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일 읽기를 완료했습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(din != null) {
				try {
					din.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		

	}

}
