public class Test{
    public static void main(String[] args) {
        int tot = getInt();
        for (int i = 0; i< tot; i++) new MyThread().start();
    }
    public static int getInt(){
        try{
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero intero");
            return getInt();
        }
    }
}