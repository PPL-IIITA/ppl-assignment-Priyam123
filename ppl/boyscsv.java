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
public class boyscsv {
    
    String name;// naam ladke ka.
    int intelligence;//attractiveness 
    int attractiveness;//his IQ
    int  budget;//his bidget
    //bool isCommitted;
    int min_attraction;
    String status="Single";
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    void generate()throws FileNotFoundException, IOException
    //public ArrayList<boys> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("boys12.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<boys> B = new ArrayList<boys>(100);
        for(int i=0;i<100;i++)
        {
            name="Boy#"+(i);
            attractiveness=(int)(10+(Math.random()*19));
            budget=(int)(100+(Math.random()*1000));
            intelligence=(int)(10+(Math.random()*25));
            min_attraction=(int)(0+(Math.random()*10));
            status = "Single";
            sb.append(name);
            sb.append(',');
            sb.append(intelligence);
            sb.append(',');
            sb.append(attractiveness);
            sb.append(',');
            sb.append(min_attraction);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(status);
            sb.append("\n");
            //sb.append(',');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("boys12.csv Done!");
    }
}
    

