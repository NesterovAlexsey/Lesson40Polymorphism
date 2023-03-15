//    Создайте класс "Женщина",
//    которые будут наследниками класса "Человек".
public class Woman extends Person {
  public Woman(String name) {
    super(name);
  }

  //   Попытка вывести на экран должна приводить к выводу строки "Женщина по имени ..."
  @Override
  public String toString() {
    return String.format("Женщина по имени %s", getName());
  }

  //    Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"
  @Override
  public void helloWorld() {
    System.out.println("Я родилась!");
  }
}
