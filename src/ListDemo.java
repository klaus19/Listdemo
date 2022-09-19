import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    int getValue(@NotNull int nums[],int n){

        n = nums.length;
        int tr =0;
        for (int i=0;i<n;i++){
            tr = nums[n-1];
        }
        return tr;
    }

    int getArrayList(int arr[],int n){

        n = arr.length;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        int ts=0;

        for (int i=0;i<list.size();i++){
             ts += list.get(list.size()-1);

        }
        return ts;
    }

    public static void main(String[] args) {
        int[]no = new int[]{1,2,3,4,5};
        int r = no.length;
        ListDemo ls = new ListDemo();
        System.out.println(ls.getValue(no,r));

    }
}
