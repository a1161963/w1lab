import java.util.Scanner;
import java.io.*;


public class Print {

    static void seven(){
        /*try{
            File file = new File("/Users/s3818272/IdeaProjects/HelloWorld/src/filename.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null ){
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            System.out.println(sb.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }*/
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        int t=20;
        for (int i=1; i <=10; i++){
            System.out.print(" "+i+"\t\t"+ (double)Math.round(i*1.609*100)/100 +"\t\t|");

            System.out.println("\t\t" + t +"\t\t" + (double)Math.round(t/1.609*100)/100);
            t += 5;
        }

    }

    static void printJAVA(){
        final String stringJavaUpper = " \tJ\t\t A\t\tV\t\tV\t\tA \n \tJ\t    A A\t\t  V\t  V\t       A A\t \n";
        final String stringJavaUnder = "J \tJ\t   AAAAA\t   V V\t      AAAAA \n J J\t  A\t\tA\t\tV\t\t A\t   A";
        System.out.println(stringJavaUpper + stringJavaUnder);
    }

    static void converCeltoFah(){
        Scanner in = new Scanner(System.in);
        System.out.print("Celcius value: ");
        Double valueCelcius = in.nextDouble();
        Double valueFah = (9.0/5)*valueCelcius +32;
        System.out.println(valueFah);
    }

    static void ba(){
        Scanner in = new Scanner(System.in);
        System.out.print("number value: ");
        String value = in.next();
        int s = 0;
        for (int i = 0; i < value.length(); i++) {
            s = s + value.charAt(i) - 48;}
        System.out.println(s);
    }

    public static void main(String[] args) {

        //printJAVA(); //1
        //converCeltoFah(); //2
        //ba();
        seven();

    }
}
