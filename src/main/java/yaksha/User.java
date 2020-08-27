package yaksha;



public class User {
	
	String name;
	String email;
	static int count ;
	
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		count++;
	}
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		User.count = count;
	}
	

}
