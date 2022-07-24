public class Main {
    public static void main(String[] args) {
        //Задание1
        int[] arrint = new int[3];
        arrint[0] = 1;
        arrint[1] = 2;
        arrint[2] = 3;

        for (int i = 0; i < arrint.length; i++){
            if (arrint[i] % 2 == 0) {
                System.out.println(arrint[i]);
            } else System.out.println(arrint[i] + 1);




        }


  //      {
   //         if (i == arrint.length - 1) {
   //             System.out.println(arrint[i]);
  //          } else {
  //              System.out.print(arrint[i]+ ", ");
  //          }
  //      }





        double[] arr1 = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < arr1.length - 1; i++) System.out.print(arr1[i] + ", ");
        System.out.println(arr1[arr1.length - 1]);


        int[] arr2 = new int[]{1, 2, 3, 4};
        int counter = arr2.length - 1;
        while (0 < counter) {
            System.out.print(arr2[counter] + ", ");
            counter--;


        }
        System.out.print(arr2[0]);

    }
      }









