/**
 * 
 */
package ui;

import java.util.ArrayList;
import mylibs.*;

import mylibs.BookingJDBC;

/**
 * @author dipesh
 *
 */
public class BookingJDBCTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> roomtype = new ArrayList<String>();
		ArrayList<Integer> roomno = new ArrayList<Integer>();
		
		BookingJDBC bjd = new BookingJDBC();
		roomtype=bjd.getRoom_Type();
		System.out.println(roomtype);
		
		roomno = bjd.getRoomNo("Double");
		System.out.println("Room numbers of single type: "+ roomno);
		
		double roomprice = bjd.getRoomPrice(203);
		System.out.println("Price of room 203 is: "+roomprice);
		
		RegistrationJDBC regjdbc = new RegistrationJDBC();
		ArrayList<Registration> arr = regjdbc.selectAll();
		System.out.println(arr);
	}

}
