package ioPractice;

public class MemberDTO implements java.io.Serializable {

	
	private static final long serialVersionUID = 3001893515271257081L;
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	private char gender;
	
	//직렬화 대상에서 제외하고 싶은 필드는 transient 키워드를 이용한다.
	private transient double point;

	public MemberDTO() {
		super();
	}

	public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
