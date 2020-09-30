package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Manager <T,K> extends validUser <T,K> {
	
	

	@Override
	public <E extends Comparable<T>> Boolean fileCheckUser(E email, E passWord) {
		// TODO Auto-generated method stub
		super.fileCheckUser(E email, E passWord);
	}

	public void checkUser() {
		
		
	try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("Resources/RegisteredUsers.txt")))){
//		will read the user name one password from file then check it against the login provided
	}catch(Exception e){
		
		System.err.println("error occurred");
		e.getStackTrace();
		
	}
	
	}

	@Override
	public <E> void userVerify(E key, E value) {
		// TODO Auto-generated method stub
		super.userVerify(key, value);
		
	}

	
	

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <E extends Comparable<T>> void userVerify(E key, E value) {
		// TODO Auto-generated method stub
		
	}
	

	
	

}
