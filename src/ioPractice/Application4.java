package ioPractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application4 {

	public static void main(String[] args) {
		
//		MemberDTO[] outMembers = {
//				new MemberDTO("user01", "pass01", "김영희", "young777@greedy.com", 25, '여', 1250.7),
//			new MemberDTO("user02", "pass02", "김철수", "chul999@greedy.com", 27, '남', 1221.6),
//			new MemberDTO("user03", "pass03", "유관순", "yoo123@greedy.com", 18, '여', 1234.3)
//		};
//	
//			ObjectOutputStream objout = null;
//			
//			try {
//						
//				objout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/ioPractice/testObjectstream.txt")));
//				
//				for(int i = 0; i < outMembers.length; i++) {
//					objout.writeObject(outMembers[i]);
//				}
//		
//			objout.flush();		
//			} catch (IOException e) {
//				e.printStackTrace();
//		} finally {				if(objout != null) {
//					try {
//						objout.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		
	
		
MemberDTO[] inputMembers = new MemberDTO[3];
		
		ObjectInputStream objIn = null;
		
		try {
			
			objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/ioPractice/testObjectstream.txt")));
		
			/* 읽어온 Object가 해당하는 Class가 없을 경우 ClassNotFoundException이 발생할 수 있다. */
//			while(true) {
//				System.out.println(objIn.readObject());
//			}
			
			for(int i = 0; i < inputMembers.length; i++) {
				inputMembers[i] = (MemberDTO) objIn.readObject();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일을 모두 읽어왔습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		for(MemberDTO member : inputMembers) {
			System.out.println(member);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
