package Assignments;

import java.util.Scanner;

public class Repl92 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		String firstname="";
		String lastname = "";
		
		if (json.contains("firstName") && json.contains("firstName") && json.contains("role")) {
		int firstName = json.indexOf("firstName");
		int lastName = json.indexOf("lastName");
		int role = json.indexOf("role");
		firstname = firstname + json.substring(firstName+13,lastName-4);
		lastname = lastname +json.substring(lastName+12,role-4);}
		
		System.out.println("First name: "+ firstname);
		System.out.println("Last name: "+ lastname);
  }
}