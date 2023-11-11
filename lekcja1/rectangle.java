package lekcja1;

public class rectangle {
    private int dimensionOne;
    private int dimensionTwo;

    public rectangle(int dimensionOne, int dimensionTwo){
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;

    }
    public void surface(){
         System.out.println("Dimensions are: "+dimensionOne+"x"+dimensionTwo+" and surface is "+dimensionOne*dimensionTwo);
    }

}
