public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    public void wyswietl(){
        System.out.println("Jestem prawdziwa Dzika Kaczka");
    }
}