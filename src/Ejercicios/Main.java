import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //test
        System.out.println("INVERTIR MATRIZ");
        int[] a = {5,4,67,3,2,1};
        printArray(a);
        printArray(invertirMatriz(a));

        System.out.println("ROTACION IZQUIERDA");
        printArray(a);
        printArray(rotacionIzquierda(a,2));

        trianguloRecursivo(5);   
    
    }
    //Ejercicio 1
    public static int[] invertirMatriz(int[] arr){
        //invierte una matriz
		int size = arr.length;
		int large = size-1;
		
		int[] reverse = new int[size];
		
		// 
		for (int i = 0; i < size; i++) {
			reverse[i] = arr[large];
			large--;
		}
		
		return reverse;
    }

    //Ejercicio 2 : rotacion a la izquierda
    public static int[] rotacionIzquierda(int[] arr, int d){
        //rotacion a la izquierda
        int [] leftArr = new int[arr.length];
		
		int move = (d%arr.length),
			size = arr.length - move,
			i=0,
			index = move;
		
		for (; i < size; i++) {
			leftArr[i] = arr[index];
			index++;
		}
		
		for (int j = 0; j < move; j++) {
			leftArr[i] = arr[j];
			i++;
		}
		
		return leftArr;
        
    }

    //Ejercicio 3 : Triangulo recursivo
    public static void trianguloRecursivo(int n){
        //triangulo recursivo
        if(n == 1)
            System.out.println("*");
        else{
            trianguloRecursivo(n-1);
            for(int i = 0; i < n; i++)
                System.out.print("*");
            System.out.println();
        }
    }
    //print array
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}