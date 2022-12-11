package Lab_5;

public class Task_5 {
    static public void main(String[] args) {
                System.out.println(reverseWord("Соображения высшего порядка, а также выбранный нами инновационный путь" +
                        " позволяет оценить значение форм воздействия."));
        System.out.println(reverseWord("Задача организации, в особенности же дальнейшее развитие различных форм " +
                "деятельности позволяет оценить значение новых предложений"));
    }

    static public String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

}
