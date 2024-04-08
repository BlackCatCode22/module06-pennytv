public class Animal
{
    public String name;
    public int age;
    public String gender;
    public String species;
    public String birthSeason;
    public String color;
    public double weight;
    public String origin;

    public Animal(String name, int age, String gender, String species, String birthSeason, String color, double weight, String origin) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.species = species;
        this.birthSeason = birthSeason;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecies() {
        return species;
    }

    public String getBirthSeason() {
        return birthSeason;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Shenzi", 4, "female", "Hyena", "spring", "tan", 70, "Friguia Park, Tunisia"),
                new Animal("Banzai", 12, "male", "Hyena", "fall", "brown", 150, "Friguia Park, Tunisia"),
                new Animal("Ed", 4, "male", "Hyena", "spring", "black", 120, "Friguia Park, Tunisia"),
                new Animal("Zig", 8, "female", "Hyena", "unknown", "black and tan striped", 105, "Friguia Park, Tunisia"),
                new Animal("Scar", 6, "female", "Lion", "spring", "tan", 300, "Zanzibar, Tanzania"),
                new Animal("Mufasa", 12, "female", "Lion", "winter", "dark tan", 375, "KopeLion, Tanzania"),
                new Animal("Simba", 22, "male", "Lion", "fall", "golden", 450, "Zanzibar, Tanzania"),
                new Animal("Kiara", 4, "female", "Lion", "spring", "tan and brown", 275, "KopeLion, Tanzania"),
                new Animal("Tony", 2, "male", "Tiger", "spring", "gold and tan stripes", 270, "Dhaka, Bangladesh"),
                new Animal("Tigger", 4, "female", "Tiger", "spring", "black stripes", 400, "Dhaka, Bangladesh"),
                new Animal("Amber", 18, "male", "Tiger", "fall", "gold and tan", 300, "Bardia, Nepal"),
                new Animal("Cosmia", 3, "female", "Tiger", "spring", "black stripes", 285, "Bardia, Nepal"),
                new Animal("Yogi", 7, "male", "Bear", "spring", "brown", 320, "Alaska Zoo, Alaska"),
                new Animal("Smokey", 25, "female", "Bear", "spring", "black", 425, "Woodland park Zoo, Washington"),
                new Animal("Paddington", 4, "female", "Bear", "fall", "black", 355, "Woodland park Zoo, Washington"),
                new Animal("Lippy", 4, "male", "Bear", "spring", "brown", 405, "Alaska Zoo, Alaska")
        };

        // Printing out the details of each animal
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Gender: " + animal.getGender());
            System.out.println("Species: " + animal.getSpecies());
            System.out.println("Birth Season: " + animal.getBirthSeason());
            System.out.println("Color: " + animal.getColor());
            System.out.println("Weight: " + animal.getWeight() + " pounds");
            System.out.println("Origin: " + animal.getOrigin());
            System.out.println();
        }
    }
}