import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class numSort {

    public static ArrayList<Integer> sort(File input) throws FileNotFoundException {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> tempAL = new ArrayList<>();
        Scanner sc = new Scanner(input);

        while(sc.hasNext()) {
            if(sc.hasNextInt()) tempAL.add(sc.nextInt());
            else sc.next();
        }

        int[] tempA = new int[tempAL.size()];
        
        for(int j=0; j<tempA.length; j++) {
            tempA[j] = tempAL.get(j);
        }

        for(int x = 0; x<tempA.length-1; x++) {
            int min = x;
    
            for(int y = x+1; y<tempA.length; y++) {
                if(tempA[y] < tempA[min]) min = y;
            }

            int num = tempA[min];
            tempA[min] = tempA[x];
            tempA[x] = num;

        }

        for(int z = 0; z<tempA.length; z++) nums.add(tempA[z]);
        return nums;

    }


    public static void main(String[] args) throws FileNotFoundException {
        File input = new File(args[0]);
        ArrayList<Integer> nums = sort(input);
	    System.out.println(nums);
    }
}