package ru.spbu.strukov.CharacteristicFunctions;

import ru.spbu.strukov.Coalition;
import ru.spbu.strukov.Gamer;
import ru.spbu.strukov.NumberOwner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TableFunction implements CharacteristicFunction{

    private final HashMap<List<Integer>, Integer> table = new HashMap<>();
    private final String separator;

    @Override
    public void calculateIncome(NumberOwner gamerOrCoalition) {
        List<Integer> key = new ArrayList<>();

        if (gamerOrCoalition instanceof Gamer){
            key.add(gamerOrCoalition.getNumber());
        } else {
            ArrayList<Gamer> gamers = ((Coalition) gamerOrCoalition).gamers;

            if (gamers.size() == 0){
                gamerOrCoalition.setIncome(0);
                return;
            }

            for (Gamer gamer: gamers){
                key.add(gamer.getNumber());
            }
        }

        Collections.sort(key);

        gamerOrCoalition.setIncome(this.table.get(key));

    }

    public TableFunction(String path_to_file, String... separator){
        this.separator = separator.length > 0 ? separator[0] : ";";
        List<List<String>> rows = readTable(path_to_file);
        parseTable(rows);
    }

    private void parseTable(List<List<String>> rows) {
        for (List<String> row: rows){
            List<Integer> custom_coalition = getCoalition(row.get(0));
            Integer income = Integer.parseInt(row.get(1).strip());
            this.table.put(custom_coalition, income);
        }
    }

    private List<Integer> getCoalition(String str_coalition) {
        str_coalition = str_coalition.replaceAll("[^0-9?!\\.]"," ").strip(); // Remove all non digit symbols

        ArrayList<Integer> gamers= new ArrayList<>();
        for (String str_gamer: str_coalition.split(" ")){
            gamers.add(Integer.parseInt(str_gamer));
        }

        return gamers;
    }

    private List<List<String>> readTable(String path_to_file) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path_to_file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(this.separator);
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }

    @Override
    public String toString() {
        StringBuilder output_string = new StringBuilder("Coalition  |  Income\n");
        for(List<Integer> coalition: table.keySet()){
            output_string.append(coalition.toString()).append("  |  ").append(table.get(coalition).toString()).append("\n");
        }
        return output_string.toString();
    }
}

//class Main {
//    public static void main(String[] args) {
//        String pathToFile = "/Users/pstrukov/Desktop/Мучеба/Наушка/example.csv";
//        CharacteristicFunction function = new TableFunction(pathToFile);
//
//        Gamer gamer1 = new Gamer(1);
//        Gamer gamer2 = new Gamer(2);
//        Gamer gamer3 = new Gamer(3);
//        ArrayList<Gamer> gamers = new ArrayList<>();
//        gamers.add(gamer2);
//        gamers.add(gamer1);
////        gamers.add(gamer3);
//        Coalition coalition = Coalition.makeCoalition(gamers);
//
//        function.calculateIncome(gamer2);
//
//        System.out.println(gamer2.toString() + " -> " + gamer2.getIncome());
//
//        function.calculateIncome(coalition);
//
//        System.out.println(coalition.toString() + " -> " + coalition.getIncome());
//        System.out.println(gamer2.toString() + " -> " + gamer2.getIncome());
//    }
//}
