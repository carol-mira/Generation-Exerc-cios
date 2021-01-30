package Turma15;

import java.util.Scanner;

public class ExMatriz1 {

	public static void main(String[] args) {
		int i,n=5;
		int vet[] = new int[n],soma=0;
		
      Scanner ler = new Scanner(System.in);
		
		for(i=0;i<n;i++)
		{
			System.out.println("Digite sua "+(i+1)+" nota:");
			vet[i] = ler.nextInt();
			
		}
				int menor=vet[0],maior=vet[0];
				for(i=0;i<n;i++)
				{
					soma = soma + vet[i];
					if(vet[i]<menor) 
					{
						menor = vet[i];	
					}
					if(vet[i]>maior)
					{
						maior = vet[i];
					}
						
				}
				System.out.printf("\n");
				for(i=0;i<n;i++)
				{
					if(vet[i] == maior)	
					{
						System.out.printf("Vet[%d] = %2d <-- Maior valor \n",i,vet[i]);
					}
					else 
					{
						System.out.printf("Vet[%d] = %2d\n",i,vet[i]);
					}
				}
				System.out.printf("\nSoma = %d\n",soma); 	

	}

}
		
			
			
		

