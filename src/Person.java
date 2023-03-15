
//
//    Добавьте в класс "Человек" метод "приветствие",
//    который будет выводить строку: "Я родился!"

public class Person { //    Создайте класс "Человек"

  private String name;

  public Person(String name) { //конструктор которого принимает имя.
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //  При попытке вывести объект этого класса на экран
//    должна выводиться строка "Человек по имени ...".
  @Override
  public String toString() {
    return String.format("Человек по имени %s", name);
  }

  //Добавьте в класс "Человек" метод "приветствие",
  //который будет выводить строку: "Я родился!"
  public void helloWorld() {
    System.out.println("Я родился!");
  }
}
