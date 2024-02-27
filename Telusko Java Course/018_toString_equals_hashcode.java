class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Alien {
    int aId;
    String aName;
    public Alien(int aId, String aName) {
        this.aId = aId;
        this.aName = aName;
    }
    @Override
    public String toString() {
        return "Alien [aId=" + aId + ", aName=" + aName + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + aId;
        result = prime * result + ((aName == null) ? 0 : aName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (aId != other.aId)
            return false;
        if (aName == null) {
            if (other.aName != null)
                return false;
        } else if (!aName.equals(other.aName))
            return false;
        return true;
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        // 1. without overriding methods
        Student obj1 = new Student(101, "Akash");
        System.out.println(obj1.hashCode());    // 2055281021
        System.out.println(obj1.toString());    // Student@7a81197d
        
        Student obj2 = new Student(101, "Akash");
        System.out.println(obj2.hashCode());    // 1554547125
        System.out.println(obj2.toString());    // Student@5ca881b5
        
        System.out.println(obj1.equals(obj2));  // false
        
        // 2. with overridden methods
        Alien alien1 = new Alien(101, "Akash");
        System.out.println(alien1.hashCode());    // 63317480
        System.out.println(alien1.toString());    // Alien [aId=101, aName=Akash]
        
        Alien alien2 = new Alien(101, "Akash");
        System.out.println(alien2.hashCode());    // 63317480
        System.out.println(alien2.toString());    // Alien [aId=101, aName=Akash]
        
        System.out.println(alien1.equals(alien2));  // true
    }
}