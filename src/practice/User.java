package practice;


/**
 * User is an interface for creating users on a platform
 * that are authorised to access a platform. Interface specifies 
 * that subclass must verify the user with specific 
 * 
 * 
 * 
 * @author leefowler
 *
 * @param <T>
 * @param <K>
 */

public interface User<T,K>{
	
	public T setUserName(T name);
	public T getUserName();
	
	public K setUserPassword();
	public K getUserPassword();
	
	public <E extends Comparable<T>> void userVerify(E key,E value);
	public <E extends Comparable<T>> Boolean fileCheckUser(E email, E passWord);
	
	
	
}
