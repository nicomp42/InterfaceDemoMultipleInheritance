package PersonPackage;

/**
 * Model a person
 * @author Nicholson.Bill
 *
 */
public class Person {
	private String lastName;
	private String firstName;
	private String middleName;
	private String title;
	
	public String getLastName(){return lastName;}
	public String setLastName(String lastName){this.lastName=lastName; return lastName;}

	public String getFirstName(){return firstName;}
	public String setFirstName(String firstName){this.firstName=firstName; return firstName;}

	public String getMiddleName(){return middleName;}
	public String setMiddleName(String middleName){this.middleName=middleName; return middleName;}
	
	public String getTitle(){return title;}
	public String setTile(String title){this.title = title; return title;}

}
