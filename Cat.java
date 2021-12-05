/**
 * @(#)Cat.java
 *
 *
 * @author M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/11/29
 */


public class Cat {

    String name;
    int age;

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void jump() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Cat smudge = new Cat();
        smudge.age = 3;
        smudge.name = "Smudge";

        smudge.sayMeow();
        smudge.jump();

    }
}