class BubbleSort {
    static void bSort(int[] A){
        for (int j=0; j<A.length; j++){
            for (int i=1; i<(A.length-j); i++){
                if (A[i-1] > A[i]){
                    int temp = A[i];
                    A[i] = A[i-1];
                    A[i-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr =  new int[args.length];
        for (int i=0; i< arr.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        bSort(arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
