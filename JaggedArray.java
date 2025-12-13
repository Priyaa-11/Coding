import java.util.Scanner;
class JaggedArray {
    public static void main (String args[]) {
        int[][] JaggedArray;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows");
        int numrows = sc.nextInt();
        JaggedArray = new int[numrows][];
        for(int i=0;i<numrows;i++) {
            System.out.print("Enter cols for rows"+i+":");
            int numcols = sc.nextInt();
            JaggedArray[i] =new int[numcols];
        }
        for(int i=0;i<JaggedArray.length;i++){
            for(int j=0;j<JaggedArray[i].length;j++){
                System.out.print("Enter elements at ["+i+"]["+j+"]:");
                JaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("JaggedArray is :");
        for(int i=0;i<numrows;i++){
            for(int j=0;j<JaggedArray[i].length;j++){
                System.out.print(JaggedArray[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}