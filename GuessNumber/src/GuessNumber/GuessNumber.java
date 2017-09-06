//Zadanie 1.2
//Zgadnij liczbę z zakresu
//Program losuje liczbę z zakresu od 0 do 999. Użytkownik ma zgadnąć tę liczbę nie widząc jej.
//Kiedy użytkownik poda nieprawidłowy wynik, program podpowiada pisząc czy podana liczba
//była za duża, czy za mała. Gdy użytkownik poda właściwą liczbę, program wypisuje gratulacje
//jednocześnie informując, w której próbie udało się zgadnąć liczbę.
//Do losowania można użyć klasy java.util.Random, a do interakcji najlepiej JOptionPane (jeśli
//wolisz, można Scannera i konsoli).

package GuessNumber;

public class GuessNumber {
	
	public static void main(String[] args) {
		GenerateNumber randValue = new GenerateNumber();
		new PlayGame(randValue.getRandomValue());		
	}

}
