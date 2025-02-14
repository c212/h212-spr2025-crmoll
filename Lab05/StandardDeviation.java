package Labs.Lab05.LabProbs05;

class StandardDeviation{
    public static void main(String[] args){

        double sum = 0;
        double sumOfSquares = 0;
        double count = 0;
        for (String arg: args){
            double n = Double.parseDouble(arg);
            sum += n;
            sumOfSquares += n * n;
            count += 1;
        }
        System.out.print("Standard deviation is: ");
        System.out.println(Math.sqrt( (sumOfSquares - sum * sum / count) / (count - 1) ));

    }
}