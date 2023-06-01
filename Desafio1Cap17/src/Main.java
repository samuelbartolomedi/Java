import Entities.Sale;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String filePath = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            List<Sale> saleList = new ArrayList<>();
            String lines = br.readLine();
            while (lines != null)
            {
                String[] fields = lines.split(",");
                saleList.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                lines = br.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}