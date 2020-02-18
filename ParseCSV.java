


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ParseCSV {
    public static void main(String[] args) {

        String csvFile = "/Users/Kavitha/Desktop/Interview Preparation/temperature_series.csv";
        String line = "";
        String cvsSplitBy = ",";
        double initialWeight = 100.00;
        ArrayList<String> tempList = new ArrayList<String>();
        double finalWeight,weight_cur;
        double alpha = 0.038,beta = 0.6667, tau = 0.08;
       
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
            	String[] temperature = line.split(cvsSplitBy);
                //System.out.println(temperature[2]);
                tempList.add(temperature[2]);

            }
            System.out.println("initialWeight"+initialWeight);
            double weightCurExBeta,tempCurMulTau,tempCurExTau,tempcur;
            for(int j=1;j<tempList.size();j++){
            
            	weight_cur = initialWeight;
            	weightCurExBeta =Math.pow(weight_cur, beta) ;
            	tempcur = new Double(tempList.get(j));
            	tempCurMulTau = tempcur * tau;
            	tempCurExTau = Math.exp(tempCurMulTau) ;
            	finalWeight = (alpha * weightCurExBeta * tempCurExTau) + weight_cur;
            	initialWeight = finalWeight;
            }
            System.out.println("FinalWeight"+initialWeight);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
