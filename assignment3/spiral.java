 class Demo {
    public static void main(String[] args) {
        int n = 5;
        int row = (2*n)-1;

        for(int i = 1 ; i<=row;i++){
            for(int j = 1 ; j<=row;j++){
                int top = i-1;
                int bottom = row-i;
                int  left = j-1;
                int   rights = row-j ;
               int layer = Math.min(Math.min(rights, bottom),
                     Math.min(top, left));
                System.out.print(layer);
            }
            System.out.println();
        }
    
    
    }
    
}