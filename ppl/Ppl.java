package ppl;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 *
 */
public class Ppl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException, IOException {
        int i, j,l=0,t;
        i = 0;
        j = 0;
        boyscsv obj=new boyscsv();
        obj.generate();
        
        boys b[] = new boys[1000];
        String csvFile = "boys12.csv";
        String line = "";
        String csvSplit = ",";
    
        BufferedReader buff = null;
        try {
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line = buff.readLine()) != null) {
                String[] boy = line.split(csvSplit);
                //	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
                b[i] = new boys();
                b[i].name = boy[0];
                b[i].intelligence = Integer.parseInt(boy[1]);
                b[i].attractiveness = Integer.parseInt(boy[2]);
                b[i].min_attraction = Integer.parseInt(boy[3]);
                b[i].budget = Integer.parseInt(boy[4]);
                b[i].status = boy[5];
                i++;

            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int k;
        /*for (k = 0; k < i; k++) {
            System.out.println(b[k].name + "fgdfgd");
        }*/
        girlscsv obj1=new girlscsv();
        obj1.generate();
        
        girls g[] = new girls[1000];
        csvFile = "girls12.csv";
        line = "";
        csvSplit = ",";
        buff=null;
        try {
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line = buff.readLine()) != null) {
                String[] girl = line.split(csvSplit);
                	//System.out.println(girl[0] + girl[1] + girl[2] + girl[3]);
                g[l] = new girls();
                g[l].nameg = girl[0];
                g[l].intelligenceg = Integer.parseInt(girl[1]);
                g[l].attractivenessg = Integer.parseInt(girl[2]);
               // b[i].min_attraction = Integer.parseInt(girl[3]);
                g[l].main_budgetg = Integer.parseInt(girl[3]);
                g[l].statusg = girl[4];
                l++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
				if(buff != null){
					try{
						buff.close();
					}catch(IOException e){
					e.printStackTrace();
					}
				}
		}
        int w;
       /* for (w = 0; w < l; w++) {
            System.out.println(g[w].nameg + "fgdfgd");
        }*/
        Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        //fh = new FileHandler("C:\\Users\\Priyam\\Documents\\NetBeansProjects\\ppl\\log.log");  
        fh = new FileHandler("log.log"); 
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
       

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

     


       
       
       
       
       
       
       
       for(j=0;j<i;j++)
        {
            for(t=0;t<l;t++)
            {
                if(g[t].statusg.equals("Single")&&b[j].status.equals("Single")&&g[t].main_budgetg<=b[j].budget&&b[j].min_attraction<g[t].attractivenessg)
                {
                    g[t].statusg="Comitted";
                    b[j].status="Comitted";
                    
                    logger.info(b[j].name+" commited with "+g[t].nameg);
                 
                    
                }
            }
        }
      // System.out.println(g[1].statusg);
    }

}
