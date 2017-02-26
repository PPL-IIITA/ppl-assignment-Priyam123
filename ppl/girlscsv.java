/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

/**
 *
 * @author Priyam
 */
import java.io.*;
import java.util.*;
public class girlscsv {
     String nameg;// naam ladke ka.
    int intelligenceg;//attractiveness 
    int attractivenessg;//his IQ
    int  main_budgetg;//his bidget
    //bool isCommitted;
    String statusg="Single";
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    void generate()throws FileNotFoundException, IOException
    //public ArrayList<boys> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("girls12.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<boys> B = new ArrayList<boys>(100);
        for(int i=0;i<100;i++)
        {
            nameg="Girl#"+(i);
            attractivenessg=(int)(10+(Math.random()*19));
            main_budgetg=(int)(100+(Math.random()*1000));
            intelligenceg=(int)(10+(Math.random()*25));
            statusg = "Single";
            sb.append(nameg);
            sb.append(',');
            sb.append(intelligenceg);
            sb.append(',');
            sb.append(attractivenessg);
            sb.append(',');
            sb.append(main_budgetg);
            sb.append(',');
            sb.append(statusg);
            sb.append("\n");
            //sb.append(',');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("girls12.csv Done!");
    }
}