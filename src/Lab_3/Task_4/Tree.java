package Lab_3.Task_4;

import Lab_3.Task_3.House;

public class Tree {
    Integer age;
    Boolean isLife;
    String name;

    public static void main(String[] args){
        Tree tree1 = new Tree(14, "Birch");
        Tree tree2 = new Tree(21, true, "Oak");
        Tree tree3 = new Tree();
        }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLife() {
        return isLife;
    }

    public void setLife(Boolean life) {
        isLife = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(Integer age, Boolean isLife, String name) {
        this.age = age;
        this.isLife = isLife;
        this.name = name;


    }

    public String outputdata(){
        System.out.println(name + " " + age + " Is life? -- " + isLife);
        return name + " " + age + " Is life? -- " + isLife;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isLife=" + isLife +
                ", name='" + name + '\'' +
                '}';
    }
}
