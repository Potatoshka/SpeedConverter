package potato;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение в километрах: ");
        SpeedConverter.printConversion(Double.parseDouble(reader.readLine()));
    }


    public class SpeedConverter{
        public static double toMilesPerHour (double kilometresPerHour){
            if(kilometresPerHour<0){
                return -1;
            }
            else {


            double miles =  kilometresPerHour*0.62d;


            return miles;
        }
    }
    public static void printConversion(double kilometresPerHour) throws IOException {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           double miles = toMilesPerHour(kilometresPerHour);

            if(kilometresPerHour<0){
                System.out.println("Invalid value");
            }
            else {

        System.out.println(kilometresPerHour+" km/h = "+miles+"mi/h");
    }
}}}
