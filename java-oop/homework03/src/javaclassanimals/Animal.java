package javaclassanimals;

// Create an abstract class that represents an animal.
// An animal should have a name, a nickname, and an abstract method representing the sound the animal makes.
// Create classes Dog and Cat that inherit from the Animal class.

public abstract class Animal {

    protected String name;
    protected String nickname;

    public Animal(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Nickname: " + nickname;
    }
}
