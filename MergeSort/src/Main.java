public class Main {
    public static void main(String[] args) {
        int[] A = new int[6];
        int[] B = new int[9];
        A[0]=27;
        A[1]=24;
        A[2]=23;
        A[3]=15;
        A[4]=10;
        A[5]=8;

        B[0]=84;
        B[1]=81;
        B[2]=35;
        B[3]=25;
        B[4]=14;
        B[5]=11;
        B[6]=8;
        B[7]=5;
        B[8]=2;
        int [] C = MergeSort(A, B);
        for (int i : C) {
            System.out.println(i+"");
        }
    }
    public static int[] MergeSort(int[] A, int[] B){
        int size = A.length + B.length;
        int[] C = new int[size];
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        while (index1 < A.length && index2 < B.length) {
            if (A[index1] >= B[index2]) {
                C[count]= A[index1];
                index1++;
            }else{
                C[count] = B[index2];
                index2++;
            }
            count++;
        }
        if (index1 == A.length) {
            while (index2 < B.length) {
                C[count] = B[index2];
                count++;
                index2++;
            }
        } else {
            while (index1 < A.length) {
                C[count] = A[index1];
                count++;
                index1++;
            }
        }
        return C;
    }


}
