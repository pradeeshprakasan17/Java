public class EnhancedForLoop{

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int arr2[][] = {
                       {1,2,3,4},
                       {5,6,7,8},
                       {9,1,0,25}
        };

        System.out.println("One Dimensional Array");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\n2D Array");

        for(int i[] : arr2)
        {
            for(int j : i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}