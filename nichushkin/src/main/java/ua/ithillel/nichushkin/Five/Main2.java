package ua.ithillel.nichushkin.Five;

//### Часть 2:
//
//        Создать классы - `User` и `UserFactory`:
//
//        Поля класса `User`:
//        - `id (int)`,
//        - `age (int)`,
//        - `firstName (String)`,
//        - `lastName (String)`,
//        - `city (String)`.
//
//        Создать один конструктор, который принимает все данные пользователя
//        (Имеется в виду что аргументов столько, сколько полей в классе).
//        Поле `id` нельзя менять после создания объекта (Поле должно быть `final` и не должно быть `setter`-а).
//        Создать `getter`-ы и `setter`-ы для полей (Кроме поля `id`).
//
//        В классе `UserFactory` создать:
//        - статическое поле `nextId` типа `int` (Только статическое! `final` делать не нужно).
//        - метод `createUser`, который будет создавать и возвращать объект класса `User`.
//
//        Для значения поля `id` (для передачи в конструктор) в классе `User` использовать значение статического поля
//        в классе `UserFactory`.
//        После каждого создания объекта класса `User` значение поля `nextId` должно быть увеличено на **1**.
//
//        Создать пользователя, использовав статический метод `createUser` класса `UserFactory`.
public class Main2 {
    public static void main(String[] args) {
        User user1 = new UserFactory().createUser(22, "Petr", "Petruhov", "Dnipro");
        System.out.println(user1.toString());
        User user2 = new UserFactory().createUser(23, "Petr1", "Petruhov1", "Dnipro1");
        System.out.println(user2.toString());
        User user3 = new UserFactory().createUser(24, "Petr2", "Petruhov2", "Dnipro2");
        System.out.println(user3.toString());
    }
}
