import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        String ruta = "datos.txt";
        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException fnfe){
            System.out.println("Elarchivo no existe!!!");
            System.out.println(fnfe.getMessage());
                }

            }

        }
