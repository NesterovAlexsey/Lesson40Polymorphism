
public class Man extends Person { //Создайте классы "Мужчина", наследник класса "Человек".

  public Man(String name) {
    super(name);
  }

  // Попытка вывести на экран должна приводить к выводу строки
  // "Мужчина по имени ..."
  @Override
  public String toString() {
    return String.format("Мужчина по имени %s", getName());
  }
}
