import java.util.*;

public class Animal {
	
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);

	public Animal() {
		numberOfAnimals++;
		System.out.println("An animal was created!");
		
		System.out.print("Enter the animal name: \n");
		
		if (userInput.hasNextLine()) {
			this.setName(userInput.nextLine());
			
		}
		
		this.setFavoriteChar(favoriteChar);
		this.setUniqueID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public void setUniqueID() {
		this.uniqueID = 1 + (long)(Math.random() * 1000000);
		System.out.println(this.name + "'s ID is set to " + this.uniqueID);
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public static void main(String[] args) {
		Animal theAnimal = new Animal();
	}
	
}
