package entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Human {

    private int id;
    private String name;
    private String surname;
    private List<Animal> animals = new LinkedList<>();

    public Human() {
    }

    public Human(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getId() == human.getId() &&
                Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname()) &&
                Objects.equals(getAnimals(), human.getAnimals());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname());
    }
}
