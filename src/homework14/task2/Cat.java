package homework14.task2;

@Info(
        name = "Murka",
        color = "Black",
        say = "Mrrr",
        age = 4,
        weight = 4
)

public class Cat<N, C, A> {
    private N name;
    private C color;
    private A age;

    public Cat(N name, C color, A age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", color=" + color +
                ", age=" + age +
                '}';
    }
}
