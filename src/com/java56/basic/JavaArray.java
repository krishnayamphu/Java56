package com.java56.basic;

public class JavaArray {
    public static void main(String[] args) {
        int ageList[]=new int[5];
        ageList[0]=50;
        ageList[1]=60;
        ageList[2]=70;
        ageList[3]=80;
        ageList[4]=90;

        for (int age:ageList) {
            System.out.println("Age: "+age);
        }

        String[] students={"Ram","Gita","Hari","Sita","Nita"};
        for(String student:students){
            System.out.println("Student's Name: "+student);
        }

        int[][] A=new int[2][2];
        A[0][0]=11;
        A[0][1]=22;
        A[1][0]=33;
        A[1][1]=44;

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
        int B[][]={{10,20}, {30,40}};
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
