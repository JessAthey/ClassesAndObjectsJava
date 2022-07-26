package classesAndObjects;

	
public class FavoritePet {

	public static void main(String[] args) {
		
		
		
		
		}		
	
	
	public class Pet{
		private String name;
		private int age;
		private String location;
		private String type;
		
		
		public Pet(String name, int age, String location, String type) {
			this.name = name;
			this.age = age;
			this.location = location;
			this.type = type;
			
		}
		
		public Pet() {
			System.out.println("an animal");
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getType() {
			return type;
		}
		
		public String setLocation(String newLocation) {
			location = newLocation;
			return location;
		}
		
		public String setName(String newName) {
			name = newName;
			return name;
		}
		
		public int setAge(int newAge) {
			age = newAge;
			return age;
		}
		
	public class Cat{
		private String catName;
		private int catAge;
		private String furLength;
		
	
		public Cat(String catName, int catAge, String furLength) {
			this.catName = catName;
			this.catAge = catAge;
			this.furLength = furLength;
			
		}
		
		public String getCatName() {
			return catName;
		}
		
		public int getCatAge() {
			return catAge;
		}
		public String getFurLength() {
			return furLength;
		}
		public String setCatName(String newCatName) {
			catName = newCatName;
			return catName;
		}
		public int setCatAge(int newCatAge) {
			catAge = newCatAge;
			return catAge;
		}
		public String setFurLength(String newFurLength) {
			furLength = newFurLength;
			return furLength;
		}
		
		public Boolean favorite(Boolean favoriteCat) {
			favoriteCat = true;
			return favoriteCat;
		}
		
	}
	

	}

}
