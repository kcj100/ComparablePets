package io.zipcoder;
import org.junit.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {
     /*
    Andy's Tests
     */
    @Test
    public void catConstructorTest() {
        String name = "Tom";
        String type = "cat";

        Cat cat = new Cat(name);

        assertThat(cat).isInstanceOf(Cat.class);
        assertThat(cat.getName()).isEqualTo(name);
    }

    @Test
    public void dogConstructorTest() {
        String name = "Oliver";

        Dog dog = new Dog(name);

        assertThat(dog).isInstanceOf(Dog.class);
        assertThat(dog.getName()).isEqualTo(name);
    }

    @Test
    public void hamsterConstructorTest() {
        String name = "Robert";

        Hamster hamster = new Hamster(name);

        assertThat(hamster).isInstanceOf(Hamster.class);
        assertThat(hamster.getName()).isEqualTo(name);
    }

    @Test
    public void testStoringPets() {
        List<Pet> animals = new ArrayList<>();
        Pet dog = new Dog("Oliver");
        Pet cat = new Cat("Thomas");

        animals.add(dog);
        animals.add(cat);

        assertThat(animals).contains(dog);
        assertThat(animals).contains(cat);
        assertThat(animals.size()).isEqualTo(2);
    }

    @Test
    public void testSortingByName() {
        List<Pet> animals = new ArrayList<>();
        Pet dog = new Dog("Able");
        Pet cat = new Cat("Zander");

        animals.add(cat);
        animals.add(dog);

        Collections.sort(animals);
        assertThat(animals.get(0)).isEqualTo(dog);
        assertThat(animals.get(1)).isEqualTo(cat);
    }

    @Test
    public void testSortingByType() {
        List<Pet> animals = new ArrayList<>();
        Pet dog = new Dog("Buddy");
        Pet cat = new Cat("Whiskers");

        animals.add(cat);
        animals.add(dog);

        MyComparator typeComparator = new MyComparator();
        animals.sort(typeComparator);

        assertThat(animals.get(0)).isEqualTo(cat);
        assertThat(animals.get(1)).isEqualTo(dog);
    }
}
