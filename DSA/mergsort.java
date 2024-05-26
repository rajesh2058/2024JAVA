//merge sort
public class mergsort {
    public static void conquer(int value[],int st,int mid,int ed){
        int merge []= new int[ed-st+1];
        int idx1 = st;
        int idx2 = mid +1;
        int x = 0;
       // int i =0;
        while(idx1<=mid && idx2<=ed)
        {
               if(value[idx1]<=value[idx2]){
                  merge[x++]=value[idx1++];
               }else{
                merge[x++]=value[idx2++];
               }
        }
        while(idx1 <= mid){
            merge[x++] = value[idx1++];
        }
        while(idx2 <= ed){
            merge[x++] = value[idx2++];
        }
        for (int i =0 ;i<merge.length; i++){
            
             value[st+i]=merge[i];
        
    }

    }
    public static void divide(int value[],int st, int ed){
        if(st>=ed){ //it is single array
            return;
        }
        int mid = st + (ed-st)/2; //if starting index is 999222 and ending
        //index is 999999 then it might go out of int value so
        // we donot use (st+ed)/2
       // System.out.println(mid);
       divide(value,st,mid);//divide into 2 array from st to mid
       divide(value,mid+1,ed);//another start from mid +1 to ed
       conquer(value,st,mid,ed);


    }
    public static void main(String[] args) {
        int[] value = {1,3,4,9,2,10,11,23};
        int n = value.length;
        divide(value,0,n-1);
       for (int i =0;i<n;i++){
        System.out.print(value[i]+" ");
       }
       System.out.println();

    }
}
