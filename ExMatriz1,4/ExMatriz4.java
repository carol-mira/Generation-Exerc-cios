package Turma15;

import java.util.Scanner;

public class ExMatriz4 {
	public static void main(String[] args) {
		
		int mat[][] = new int[3][3],i,j,somamat=0,somadiagonal=0;
		
		Scanner ler= new Scanner(System.in);
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("\nEntre com o valor da Matriz:");
				mat[i][j]=ler.nextInt();
				
				somamat = somamat + mat[i][j];
				
				if(i==j)
				{
					somadiagonal = somadiagonal + mat[i][j];
				}
			}
		}
		System.out.println("\nO valor do somatório total:"+somamat);
		System.out.println("\nO valor do somatório da diagonal:"+somadiagonal);
	}

}
