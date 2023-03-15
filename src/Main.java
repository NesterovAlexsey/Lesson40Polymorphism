//Задача 1
//    Создайте класс "Человек", конструктор которого принимает имя.
//    При попытке вывести объект этого класса на экран
//    должна выводиться строка "Человек по имени ...".
//    Добавьте в класс "Человек" метод "приветствие",
//    который будет выводить строку: "Я родился!"
//
//    Создайте классы "Мужчина" и "Женщина",
//    которые будут наследниками класса "Человек".
//    Попытка вывести их на экран должна приводить к выводу строки
//    "Мужчина по имени ..." или "Женщина по имени ..."
//    Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"

public class Main {

  public static void main(String[] args) {
    Person adam = new Person("Adam");
    System.out.println(adam);
    adam.helloWorld();

    Person venja = new Man("Venijamin");
    System.out.println(venja);
    venja.helloWorld();

    Person nastya = new Woman("Anastasija");
    System.out.println(nastya);
    nastya.helloWorld();
  }
}
