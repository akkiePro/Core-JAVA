class Encap{
	public static void main(String[] args) {
		Second myObj = new Second();
    	myObj.setName("John");
    	System.out.println(myObj.getName());
	}
}

class Second{
	private String name;

   // Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }
}