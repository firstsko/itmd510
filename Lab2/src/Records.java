import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Records extends BankRecords {

    //create formatted object to write output directly to console & file
    static FileWriter fw = null;

    public Records(){
        try {
            fw = new FileWriter("bankrecords.txt");
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Records br= new Records();
        br.readData();
        // call functions to perform analytics
        AvgComp();
    }

    public static void AvgComp(){

        Arrays.sort(robjs,new SexComparator());

        int maleCt = 0,femCt =0;
        double maleInc = 0,femInc = 0;
        for (int i =0;i< robjs.length;i++)
            if(robjs[i].getSex().equals("FEMALE")){
                 ++ femCt;
                 femInc += robjs[i].getIncome();
            }else{

            }

            System.out.printf(" ..." );

        try {
            fw.write("Avg inc. for Females: $" + (femInc/femCt) );
            fw.write("...");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
