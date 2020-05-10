package pasta;

public class PastaDetails {

    String typeOfPasta;
    String toppingOnPasta;
    int servingSize;

    public PastaDetails() {
    }

    public PastaDetails(String typeOfPasta) {
        this.typeOfPasta = typeOfPasta;
    }

    public PastaDetails(String typeOfPasta, String toppingOnPasta) {
        this.typeOfPasta = typeOfPasta;
        this.toppingOnPasta = toppingOnPasta;
    }

    public PastaDetails(String typeOfPasta, String toppingOnPasta, int servingSize) {
        this.typeOfPasta = typeOfPasta;
        this.toppingOnPasta = toppingOnPasta;
        this.servingSize = servingSize;
    }

    public String getTypeOfPasta() {
        return typeOfPasta;
    }

    public void setTypeOfPasta(String typeOfPasta) {
        this.typeOfPasta = typeOfPasta;
    }

    public String getToppingOnPasta() {
        return toppingOnPasta;
    }

    public void setToppingOnPasta(String toppingOnPasta) {
        this.toppingOnPasta = toppingOnPasta;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public static void pastaInfo(){
        System.out.println("Amaizing pasta in town.");
    }
}
