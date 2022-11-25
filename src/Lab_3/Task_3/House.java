package Lab_3.Task_3;

public class House {
    Integer flat;
    Integer year;
    String name;

    public static void main(String[] args){
        House house1 = new House (24, 1980, "123");
        house1.culc();

    }

    public House (Integer flat, Integer year, String name){
        this.flat = flat;
        this.year = year;
        this.name = name;
    }

    public String outputdata(){
        //System.out.println(flat + " " + year + " " + name);
        return flat + " " + year + " " + name;
    }

    @Override
    public String toString() {
        return "House{" +
                "flat=" + flat +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer culc(){
    Integer diff = 2022 - year;
    System.out.println(diff);
    return diff;

    }

}
