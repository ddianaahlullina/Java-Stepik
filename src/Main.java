public class Main {
    public static void main(String[] args) {
        int a = 255;
        int b = a++; // a=256, b=255
        a /= 8; //256/8  = 32
        b *= 2; // 255 * 2 = 510
        int c = b / 10; //510/10 = 51
        if (a + b + c > 600){ //32 + 510 + 51 = 593 условие не выполнится
            System.out.println(--b);
        }else{
            System.out.println(c++); // 51
        }
    }
}