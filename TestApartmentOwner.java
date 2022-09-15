package question3;

public class TestApartmentOwner {
public static void main(String[] args) {
			ApartmentOwner p = new ApartmentOwner("Mr. Obama");   //Creating object of class ApartmentOwner

			//set method of Apartment class to assign address at particular slot
			p.setApartment("Pitambara, 20", 0);
			p.setApartment("SAI- Builders and Developers, 42", 1);
			p.setApartment("Heritage One, 9", 2);
			p.setApartment("Samriddhi Park, 30", 5);
			p.setApartment("Global Garden, 2500", 8);

			System.out.println(p); //Print all the apartment address with respect to its slot values as written above

			System.out.println();

			System.out.println(p.getOwner() + " has " + p.countApartments() + " apartments"); //give total no. of apartment

			System.out.println("Apartment 2: " + p.getApartment(2)); //get method of Apartment class

			System.out.println();

			p.reorganizeApartments();
			System.out.println(p);
		}

	}


