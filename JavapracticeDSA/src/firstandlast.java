import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int [] arr={1,2,3,8,8,8,11,12};
        int[] ab=serach(arr,8);
//        int[] ab={st,end};
        System.out.println(Arrays.toString(ab));

    }
public static int[] serach(int[]num,int tar){
    int st=searchFirstandLast(num,8,true);
    int end=searchFirstandLast(num,8,false);
    int[] ans={0,0};
    ans[0]=st;
    ans[1]=end;
    return ans;

}
    static int searchFirstandLast(int[] num,int tar,boolean first){
        int ans=-1;
        int start=0;
        int end= num.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(tar<num[mid]){
                end=mid-1;
            }
            else if(tar>num[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if(first){
                    end=mid-1;

                }else{
                    start=mid+1;

                }
            }

        }
    return ans;
    }

}
