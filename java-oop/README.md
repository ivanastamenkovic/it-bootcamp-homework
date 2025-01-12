# java-oop
This folder contains homework assignments focused on Object-Oriented Programming (OOP) in Java, completed as part of a QA course (manual and automation).

## homework-01

### Task 1 (Worker): 

- Create a class `Worker` that has attributes `name`, `surname`, and `yearOfEmployment`.
- Create a method that checks if the employee has been with the company for more than 10 years.
- Create three different `Worker` objects and check whether each worker has been working for more than 10 years in the company.

### Task 2 (Movie):

- Create a class `Movie` with attributes `title`, `director`, and `releaseYear`.
- Create two different `Movie` objects and determine which movie is more recent.

## homework-02

### Task 1 (Currency Converter):

- Create a class `Converter` that has `RSD` (integer) and `currency` (enum) as attributes.
- Currency is an enum, while `RSD` is an integer.
- You can input values for `RSD` and `currency` through the constructor, and there are setters, but no getters.
- Create a method for converting currency to the one specified through the constructor or setter (converting `RSD` to the specified currency).
- Use `if-else` or `switch` for comparisons in the method.
- Create an object of type `Converter` and test it for all currencies: EUR, USD, AUD, CAD, RUB, and GBP.

### Task 2 (Java Math):

- Create a static method in the main function that mimics SQL's `min`, `max`, `sum`, `avg`, and `distinct` using `ArrayList<Integer>`.
- You don't need to create another class except for the main class.
- The methods should accept `ArrayList<Integer>` as a parameter.
- The `distinct` method returns a new `ArrayList<Integer>`, while the other methods have return types of `int` (for `min`, `max`, and `sum`) and `double` (for `avg`).

## homework-03

### Task 1 (Animals):

- Create an abstract class that represents an animal.
- An animal should have a `name`, a `nickname`, and an abstract method representing the sound the animal makes.
- Create classes `Dog` and `Cat` that inherit from the `Animal` class.
  - Class `Cat`
    - `Cat` has an attribute for weight and a method that prints "I’m a chonk" or "I’m not a chonk" depending on whether the weight is over 5kg or not.
    - Implement `toString`, where the name and nickname are printed, as well as whether it is a "chonk" or not (by calling the specific method).
    - Implement a method for the sound that the animal makes - for a cat, it returns the string "meow" - add a call to this method in `toString`.
  - Class `Dog`
    - `Dog` has an additional attribute called `goodBoy`.
    - Implement a method that prints "I am a good boy" or "I am a bad boy" depending on whether the `goodBoy` variable is true or false.
    - Implement `toString`, where the name and nickname are printed, as well as whether it is a good boy or not (by calling the specific method).
    - Implement a method for the sound that the animal makes - for a dog, it returns the string "woof" - add a call to this method in `toString`.
  - In the main method, create several cats and dogs, put them in a list, and iterate through all elements.
    - For dogs, print "dog: " and append the result of `toString` from the dog.
    - For cats, print "cat: " and append the result of `toString` from the cat.
    - Use `instanceof` for this.

### Task 2 (Devices):

- Create a class representing a device with the number of processors, the amount of RAM memory, and the amount of storage memory.
- It has a `toString` method implemented as:
    `"Number of processors: 4, RAM: 16GB, storage: 512GB"`.
- Enum for supported keyboard types (international, US).
- Create a class `Laptop` that inherits from class `Device` and has an additional field for screen size and an enum for the keyboard type (international or US).
  - Implement the `toString` method similarly, but add screen size and keyboard type as follows:
    `"Number of processors: 4, RAM: 16GB, storage: 512GB, screen: 15.6 inches, keyboard: INTERNATIONAL"`.
- Create a class `MobilePhone` that inherits from class `Device` and has an additional field for camera resolution in megapixels and an enum for the supported network type (3G, 4G, 5G).
  - Implement the `toString` method to print:
    `"Number of processors: 8, RAM: 6GB, storage: 128GB, camera: 32 Megapixels, network: 5G"`.
- Enum for supported network types (3G, 4G, 5G).
- In the main method, create a list of devices, iterate through a loop, and print the class to which each object belongs (whether it's a laptop or mobile).


