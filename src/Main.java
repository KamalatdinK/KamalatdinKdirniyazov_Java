package src;

public class Main {
    //1st task
    public static void printHello(int num){
        if (num > 7){
            System.out.println("Привет");
        }else{
            System.out.println("Error!");
        }
    }
    //2nd task
    public static void greeting(String name){
        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
    //3rd task
    public static void factorOf3(int[] arr){
        for (int i:arr) {
            if (i%3 == 0){
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args){
        //1st task
        printHello(8);
        printHello(6);

        //2nd task
        greeting("Вячеслав");
        greeting("Камал");

        //3rd task
        int[] arr ={2, 3, 4, 5, 6, 8, 9, 21};
        factorOf3(arr);
    }
}
