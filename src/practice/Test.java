package practice;

//import java.util.HashMap;
//import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Test {
	
	public static <T extends List<T>> boolean checkLogin(T email, T passWord){
		
//		Map<T,T> checkerMap = new HashMap<>();
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("../Resources/RegisteredUsers.txt")))){
			
		}catch(Exception e) {
			System.err.println("error occurred");
			e.getStackTrace();
		}
		
		
		return true;
	}

}
