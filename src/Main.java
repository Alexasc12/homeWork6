public class Main {
    public static void main(String[] args) {

        int[] arrint = new int[3];
        arrint[0] = 1;
        arrint[1] = 2;
        arrint[2] = 3;

        for (int i = 0; i < arrint.length; i++){
            if (arrint[i] % 2 == 0) {
                System.out.println(arrint[i]);
            } else System.out.println(arrint[i] + 1);
        }
        for (int i = 0; i < arrint.length; i++) {
            if (i == arrint.length - 1) {
                System.out.println(arrint[i]);
            } else {
                System.out.print(arrint[i] + ", ");
            }
        }
        int counter = arrint.length - 1;
        while (0 < counter) {
                        System.out.print(arrint[counter] + ", ");
            counter--;
        }
        System.out.println(arrint[0]);
        double[] arr1 = new double[]{1.57, 7.654, 9.986};{
        for (int i = 0; i < arr1.length - 1; i++) System.out.print(arr1[i] + ", ");
        System.out.println(arr1[arr1.length - 1]);}

        int couter = arr1.length - 1;
        while (0 < couter) {
            System.out.print(arr1[couter] + ", ");
            couter--;
        }
        System.out.println(arr1[0]);

        int[] arr2 = new int[]{11, 12, 13, 14};
        int couter1 = arr2.length - 1;
        while (0 < couter1){
            System.out.print(arr2[couter1] + ", ");
            couter1--;
                    }
        System.out.println(arr2[0]);
        for (int i = 0; i < arr2.length - 1; i++){
            System.out.print(arr2[i] + ", ");
        }
        System.out.print(arr2[arr2.length - 1]);
             }
        }











