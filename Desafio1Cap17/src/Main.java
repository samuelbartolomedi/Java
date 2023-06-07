import Entities.Sale;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String filePath = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            List<Sale> salesList = new ArrayList<>();
            String lines = br.readLine();
            while (lines != null)
            {
                String[] fields = lines.split(",");
                salesList.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                lines = br.readLine();
            }
            List<Sale> firstFiveSales = salesList.stream()
                                                .filter(x -> x.getYear() == 2016)
                                                .sorted((x1, x2) -> x2.averagePrice().compareTo(x1.averagePrice()))
                                                .limit(5)
                                                .toList();
            firstFiveSales.forEach(System.out::println);
            System.out.println();

            Double somaVendasLogan = salesList.stream()
                                            .filter(x -> x.getSeller().equals("Logan") && x.getMonth().equals(1)
                                                    || x.getSeller().equals("Logan") && x.getMonth().equals(7))
                                            .map(x -> x.getTotal()).reduce(0.0, (x, y) -> x + y);
            System.out.printf("Vendas do vendedor Logan nos meses 1 e 7: " + String.format("%.2f", somaVendasLogan));
        }
        catch (IOException e)
        {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}