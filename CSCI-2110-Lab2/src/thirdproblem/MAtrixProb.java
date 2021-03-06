package thirdproblem;

import java.util.Scanner;

public class MAtrixProb {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		double num;
		System.out.print("Enter the size of each matrix: ");                            //Enter size of each matrix
		n = keyboard.nextInt();
		System.out.println("Enter the matrix element");                                 //Enter the element for matrix
		System.out.print("All elements of the matrices are assumed to be the same: ");
		num = keyboard.nextDouble();
		double[][] matrix1 = new double[n][n];                                          //matrix1 is inserted with no
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix1[i][j] = num;
			}
		}
			
		double[][] matrix2 = new double[n][n];                                          // matrix1 is inserted with no
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix2[i][j] = num;
			}
		}
		long startTime, endTime, executionTime;
		startTime = System.currentTimeMillis();
		double[][] resultMatrix = multiplyMatrix(matrix1, matrix2,n);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time: " + executionTime + "  millisecs");
		
		}
		                                                                                 /* The method for multiplying two matrices */
		public static double[][] multiplyMatrix(double[][] m1, double[][] m2,int n)
		{
			double[][] matrix2 = new double[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int z=0;z<n;z++)
					{
					matrix2[i][j]+=m1[i][z]*m2[z][j];
					}
				}
			}
		
			
			return matrix2;
		}
		}

