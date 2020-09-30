package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public abstract class validUser<T,K> implements User<T, K>{

	@Override
	public T setUserName(T name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K setUserPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K getUserPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public <E> void userVerify(E key,E value) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	public <E extends Comparable<T>> void checkLogin(E email, E passWord) {
		
		
		
		
		
	}
	
	
	public <E extends Comparable<T>> Boolean fileCheckUser(T email, T passWord) {
		
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("Resources/RegisteredUser.txt"))){
			
		}catch(Exception e) {
			System.err.println("error occurred in fileCheckUser method");
			e.getStackTrace();
		}
		
		
	}

	

}
