import java.util.Arrays;

public class problem9 {
    public static void main(String[] args) {
        double[] weight = new double[]{234.2, 123.0, 344.8, 455.4, 150.6};

        System.out.println("Weights; "+ Arrays.toString(weight));
        System.out.println("Number under 250kg: "+String.format("%.0f",under(weight)));
        System.out.println("Percentage over 400kg: "+String.format("%.0f", percentageOver(weight))+"%");
        System.out.println("Lightest animal: "+String.format("%.1f",lightest(weight))+"kg");
        System.out.println("Number under 250kg: "+String.format("%.1f",AVG(weight))+"kg");
    }
    public static double under(double[] weight)
    {
        double sorted=0;

        for(int i = 0;i<weight.length;i++)
        {
            while(weight[i] < 250)
            {
                sorted++;
                break;
            }

        }
        return sorted;
    }
    public static double percentageOver(double[] weight)
    {
        double sorted=0, percentage=0;

        for(int i = 0;i<weight.length;i++)
        {
            while(weight[i] > 400)
            {
                sorted++;
                break;
            }

        }
        percentage = sorted * 20;

        return percentage;
    }
    public static double lightest(double[] weight)
    {
        double lightest = weight[0];

        for(int i = 0; i<weight.length;i++)
        {
            if(lightest > weight[i])
            {
                lightest = weight[i];
            }


        }
        return lightest;
    }
    public static double AVG(double[] weight)
    {
        double stored=0;

        for(int i = 0;i<weight.length;i++)
        {
             stored += weight[i];
        }

        return stored / 5;


    }

}
