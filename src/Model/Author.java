package Model;

public class Author extends Model {
	private String name;
	private int age;
	private int numberBook;
	private boolean gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumberBook() {
		return numberBook;
	}
	public void setNumberBook(int numberBook) {
		this.numberBook = numberBook;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Author(int id, String name, int age, int numberBook, boolean gender) {
		super(id);
		this.name = name;
		this.age = age;
		this.numberBook = numberBook;
		this.gender = gender;
	}
	public Author(int id) {
		super(id);
	}
	public Author() {
		
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", numberBook=" + numberBook + ", gender=" + gender + ", id="
				+ id + "]";
	}

}
