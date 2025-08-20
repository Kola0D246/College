public class Birds {
    public static void main(String[] args){
        Bird b1 = new Bird("Crow");
        Bird b2 = new Bird("Parrot","Cockatiel", "Psittaciformes");
        Bird b3 = new Bird("Eagle", "Dark brown", 4, 2);
        Bird b4 = new Bird("Sparrow", 3, 'M');
        Bird b5 = new Bird("Owl", 12, 'S');     // gender won't print, since its not M or F
        Bird b6 = new Bird("Kingfisher", "wetland", false);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        b4.printInfo();
        b5.printInfo();
        b6.printInfo();
    }
}

class Bird {
    String name, specie, scientificName, color, habitat;
    int weight, wingSpan, age;
    char gender;
    Boolean migratory;

    // constructor only using name
    Bird (String name){
        this.name = name;
    }

    Bird (String name, String specie, String scientificName){
        this.name = name;
        this.specie = specie;
        this.scientificName = scientificName;
    }

    Bird (String name, String color, int weight, int wingSpan){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.wingSpan = wingSpan;
    }

    Bird (String name, int age, char gender){
        this.name = name;
        this.age = age;
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }

    Bird (String name, String habitat, boolean migratory){
        this.name = name;
        this.habitat = habitat;
        this.migratory = migratory;
    }

    void printInfo(){
        System.out.println("<< Bird Information >>");
        System.out.println("Name: "+name);

        // remaining value print only after initialize (or non-zero in int case)
        if (specie != null) System.out.println("Specie: " +specie);
        if (scientificName != null) System.out.println("Scientific Name: "+scientificName);
        if (color != null) System.out.println("Color: "+color);
        if (habitat != null) System.out.println("Habitat: "+habitat);
        if (weight != 0) System.out.println("Weight: "+weight);
        if (wingSpan != 0) System.out.println("Wing Span: "+wingSpan);
        if (age != 0) System.out.println("Age: "+age);
        if (gender != '\0') System.out.println("Gender: "+gender);
        if (migratory != null) System.out.println("Migratory: "+(migratory ? "yes":"no"));

        System.out.println("-------------------------");
    }
}
