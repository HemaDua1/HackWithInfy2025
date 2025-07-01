import java.util.*;
public  class Maximum_Units_In_A_Truck{
public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>0){
                if(truckSize-boxTypes[i][0]>=0){
               ans=ans+(boxTypes[i][0]*boxTypes[i][1]);
                }
                else{
                    ans=ans+((truckSize)*boxTypes[i][1]); 
                }
                truckSize=truckSize-boxTypes[i][0];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number of box types: " + n);
        System.out.println("Enter box types (number of boxes and units per box):");
        int[][] boxTypes = new int[n][2];
        for (int i = 0; i < n; i++) {
            boxTypes[i][0] = sc.nextInt(); 
            boxTypes[i][1] = sc.nextInt(); 
        }
        int truckSize = sc.nextInt(); 
        System.out.println("Maximum units in the truck: " + maximumUnits(boxTypes, truckSize));
    }
}