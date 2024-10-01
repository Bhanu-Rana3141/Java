public class kaprekarNumber {

    public static void main(String[] args) {

        int n = 45;
        int temp = n;

        int cnt = 0;
        while(temp > 0) {
            cnt++;
            temp /= 10;
        }

        int square = n*n;

        int val = 1;
        for(int i = 0; i < cnt; i++) {
            val *= 10;
        }
        
        int split1 = square / val;
        int split2 = square % val;
        

        System.out.println(split1);
        System.out.println(split2);

        System.out.println(split1 + split2);


    }
}