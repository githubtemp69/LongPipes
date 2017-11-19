package pipes;

/**
 *
 * @author up826133
 */
public class Pipe {

    protected double length;
    protected double diameter;
    protected int grade;
    protected String innerInsulation;
    protected String outerReinforcement;   //Outer Metallic Reinforcement
    protected String chemicalRes;   //Chemical Resistance
    protected int colourCount;
    protected final double[] costByGrade;       //Cost of 1 cubic inch of plastic by grade
    protected int quantity;

    public Pipe() {
        costByGrade = new double[5];

        costByGrade[0] = 0.4;
        costByGrade[1] = 0.6;
        costByGrade[2] = 0.75;
        costByGrade[3] = 0.8;
        costByGrade[4] = 0.95;
    }

    /**
     * Constructor of Class Pipe
     *
     * @param _length       User input length of the pipe
     * @param _diameter     User input diametre for the pipe
     * @param _grade        User input grade 
     * @param _colourCount  No of colours in the pipe
     * @param _innerInsulation  whether the pipe has inner insulation or not
     * @param _outerReinforcement   whether the pipe has the outer metallic  reinforcement
     * @param _chemicalRes           whether the pipe has improved chemical resitance
     * @param _quantity             quantity of the pipe of the same type
     */
    public Pipe(double _length, double _diameter, int _grade, int _colourCount, String _innerInsulation, String _outerReinforcement, String _chemicalRes, int _quantity) {
        costByGrade = new double[5];

        length = _length;
        diameter = _diameter;
        grade = _grade;
        colourCount = _colourCount;
        innerInsulation = _innerInsulation;
        outerReinforcement = _outerReinforcement;
        chemicalRes = _chemicalRes;
        quantity = _quantity;

        costByGrade[0] = 0.4;
        costByGrade[1] = 0.6;
        costByGrade[2] = 0.75;
        costByGrade[3] = 0.8;
        costByGrade[4] = 0.95;
    }

    protected int getGrade() {
        return grade;
    }

    protected void changeGrade(int _grade) {
        grade = _grade;
    }

    public double getCostByGrade() {
        return costByGrade[this.grade - 1];

    }

    protected int getColourCount() {
        return colourCount;
    }

    public double getPrice() {
        double finalPrice;
        //costByGrade[grade - 1] * inches;
        //2 *pi* r(h+r)
        System.out.println("PRICE");
        System.out.println(diameter+"");
        System.out.println(length+"");
        finalPrice = 2 * Math.PI * (diameter/2)* (length * (diameter/2));
        return finalPrice;

    }

}
