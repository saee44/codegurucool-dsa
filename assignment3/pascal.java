class Demo {
public static void main(String[] args) {
    
    int n = 8;

        for (int i = 1; i <= n; i++) {

            int value = 1; 

          
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

      
            for (int k = 1; k <= i; k++) {
                System.out.print(value + " ");
                value = value * (i - k) / k;
            }

            System.out.println();
        }
    }
}