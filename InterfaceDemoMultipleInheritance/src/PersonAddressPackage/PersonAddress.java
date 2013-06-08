/*
 * The Address interface.
 * An interface can contain constants, method signatures, and nested types
 */
package PersonAddressPackage;

/**
 * Model an address for a person.
 * Everybody has to live somewhere.
 * @author Nicholson.Bill
 *
 */
public interface PersonAddress {
	public String toString();

	public String getStreetLine1();
	public String getStreetLine2();
	public String getCity();
	public String getState();
	public String getZipCode();
	
	public String setStreetLine1(String streetLine1);
	public String setStreetLine2(String streetLine2);
	public String setCity(String city);
	public String setState(String state);
	public String setZipCode(String zipCode);

}
