//Zadanie 1.1
//Pole trójkąta
//Program, który odczytuje trzy liczby, sprawdza czy liczby te mogą stanowić boki trójkąta (np. z
//2, 2 i 5 nie da się ułożyć trójkąta, prawa?), a jeśli mogą, oblicza pole powierzchni trójkąta o
//takich bokach. Wzór: √ p ( p−a)( p−b)( p−c) , gdzie p jest połową obwodu: (a+ b+c)/2 .
//Użyj jednego (albo kilku?) z poznanych sposobów komunikacji z użytkownikiem. Dla liczb użyj
//typu double. Pierwiastek kwadratowy to metoda Math.sqrt( ).

package Pola;

import java.util.Scanner;

public class PoleTrojkata {

	public static void main(String[] args) {
		System.out.println("Program liczący pola trójkąta");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj długość boku A: ");
		String BokA = sc.next();
		
		Double A = Double.parseDouble(BokA);
		
		System.out.println("Podaj długość boku B: ");
		String BokB = sc.next();
		Double B = Double.parseDouble(BokB);
		
		System.out.println("\nPodaj długość boku C: ");
		String BokC = sc.next();
		Double C = Double.parseDouble(BokC);
		
		System.out.printf("\nPodane długości boków: A: %.2f B: %.2f C: %.2f", A, B, C);
		
		CalculateField calcField = new CalculateField(A, B, C);
		
		System.out.println(calcField.CheckValue());
		
		System.out.println("\nWyliczone pole trójkąta: " + calcField.calculateField());
		System.out.println("\nPole trójkąta: ");

	}

}
