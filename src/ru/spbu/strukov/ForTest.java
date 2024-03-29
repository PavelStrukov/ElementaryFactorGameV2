package ru.spbu.strukov;

import ru.spbu.strukov.CharacteristicFunctions.TableFunction;
import ru.spbu.strukov.PayOffs.*;
import java.util.ArrayList;
import ru.spbu.strukov.subsets.Partitioning;

/**
 * Created on 28.09.2019 16:02:35
 * @author Alexander Mikhailovich Kovshov
 */
public class ForTest {
    
    public static Game getGame(){
        String file_path = "example_1.csv";
//        return new Game(4, new OutProportionalPayOff(), new TableFunction(file_path));
//        return new Game(4, new SingleProportionalPayOff(), new TableFunction(file_path));
//        return new Game(4, new ShapleyPayOff(), new TableFunction(file_path));
//        return new Game(4, new PreProportionalExcessPayOff(), new TableFunction(file_path));
//        return new Game(4, new EqualExcessPayOff(), new TableFunction(file_path));

//        TODO: example for Diploma
//        Более выгодное для 1 это эта конфигурация
//        return new Game(5, new SingleProportionalPayOff(), false, TypeOfDecision.PERSONAL, new TableFunction(file_path));
//        return new Game(5, new OutProportionalPayOff(), false, TypeOfDecision.PERSONAL, new TableFunction(file_path));
//        return new Game(5, new PreProportionalExcessPayOff(), false, TypeOfDecision.PERSONAL, new TableFunction(file_path));
//        return new Game(5, new EqualExcessPayOff(), false, TypeOfDecision.PERSONAL, new TableFunction(file_path));
        return new Game(5, new ShapleyPayOff(), false, TypeOfDecision.PERSONAL, new TableFunction(file_path));
//
//
//        return new Game(4, new ShapleyPayOff(), false, TypeOfDecision.AVERAGE, new TableFunction(file_path));

//        return new Game(4, new OutProportionalPayOff(), new ElementaryFactorsFunction());

//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), true, 5, 8, 13);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), true, 5, 8, 13);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), true, 5, 8, 13);
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), true, 5, 8, 13);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, 5, 8, 13);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 5, 8, 13);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), false, 1, 4, 6);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, 5, 8, 13);
        
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, 1, 4, 6);
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), true, 1, 4, 6);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, 1, 4, 6);

//        return new Game(16, new OutProportionalPayOff(), new ElementaryFactorsFunction(), false);
//        return new Game(16, new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false);
//        return new Game(3, new OutProportionalPayOff() new ElementaryFactorsFunction(),);
        
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), false, 1, 5, 8, 9, 10, 12, 27);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, 1, 5, 8, 9, 10, 12, 27);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, 1, 5, 8, 9, 10, 12, 27);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 1, 5, 8, 9, 10, 12, 27);
        
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), false, 24, 25, 27, 32, 36, 40, 42, 45, 49 );
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), false, 24, 25, 27, 32, 36, 49);
        
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 24, 28, 32, 36, 40, 42);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), true, 24, 28, 32, 36, 40, 42);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), false, 24, 28, 32, 36, 40, 42);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, 24, 28, 32, 36, 40, 42);
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), false, 24, 28, 32, 36, 40, 42);
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), true, 24, 28, 32, 36, 40, 42);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, 24, 28, 32, 36, 40, 42);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), true, 24, 28, 32, 36, 40, 42);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), false, 24, 28, 32, 36, 40, 42);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), true, 24, 28, 32, 36, 40, 42);

//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), true, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), false, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), false,TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), true, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), true, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), false, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), true, TypeOfDecision.AVERAGE, 24, 28, 32, 36, 40, 42);

//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), false, 3, 10, 15, 8); //Two perfect coalitions. Perfect partition.
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), true, 3, 10, 15, 8); //
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), false, 3, 10, 15, 8);           //Two perfect coalitions. Perfect partition.
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), true, 3, 10, 15, 8);            //
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, 3, 10, 15, 8);               //Two perfect coalitions. Perfect partition.
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), true, 3, 10, 15, 8);                //
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 3, 10, 15, 8);       //Two perfect coalitions. Perfect partition.
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), true, 3, 10, 15, 8);       //
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, TypeOfDecision.PERSONAL, 3, 107, 15, 8);       //
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), false, 3, 10, 15, 8);       //
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, 3, 10, 15, 8);       //
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), true, TypeOfDecision.AVERAGE, 3, 10, 15, 8);       //
        
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), false, 1, 10, 15, 8); //Two perfect coalitions. Perfect partition.
//        return new Game(new PreProportionalExcessPayOff(), new ElementaryFactorsFunction(), true, 1, 10, 15, 8); //
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), false, 1, 10, 15, 8);           //Two perfect coalitions. Perfect partition.
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), true, 1, 10, 15, 8);            //
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), false, 1, 10, 15, 8);               //Two perfect coalitions. Perfect partition.
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), true, 1, 10, 15, 8);                //
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 1, 10, 15, 8);       //Two perfect coalitions. Perfect partition.
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), true, 1, 10, 15, 8);       //
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), false, 1, 10, 15, 8);       //
        
//        return new Game(new ShapleyPayOff(), new ElementaryFactorsFunction(), true, 1, 2, 3, 4);
//        return new Game(new OutProportionalPayOff(), new ElementaryFactorsFunction(), false, 8, 9, 10, 5);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), 10, 13);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), 8, 5);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 4,6,8,21,32);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), true, 4,6,8,21,32);
//        return new Game(new EqualExcessPayOff(), new ElementaryFactorsFunction(), false, 98,100,120,125, 105,108,112,114);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), true, 98,100,120,125, 105,108,112,114);
//        return new Game(new SingleProportionalPayOff(), new ElementaryFactorsFunction(), false, 98,100,120,125, 105,108,112,114);
    }
    
    public static void main(String[] args) {
//        test_elementaryFactors(24+28+32+36+40+42);
//        test_elementaryFactors(   28+32+36+40+42);
//        test_elementaryFactors(40+42);
        /*
        24, 9;   28, 11;   32, 10;   36, 10;   40, 11;   42, 12
        
        Правило, по которому коалиция изгоняет игрока глядя лишь на средний выигрыш до и после,
        приводит к тому, что, если доля игрока в коалиции меньше, чем уменьшение общего выигрыша
        уменьшенной коалиции (без этого игрока), то его изгнание из коалиции приведёт
        к уменьшению выигрыша оставшихся игроков и они снова попросят его войти в коалицию,
        что приводит к последовательному изгнанию и привлечению к этой коалиции такого игрока.
        Нужно изменить правило, по которому коалиция изгоняет игрока:
        учитывать его долю.
        */
        
        bestCoalitions();
        
//        Game.test_elementaryFactors(9); 
//        Game.test_elementaryFactors(1024+1029); 
//        Game.test_elementaryFactors(1024);
//        Game.test_elementaryFactors(1029);
//        Game.test_elementaryFactors(1025);
//        Game.test_elementaryFactors(1026);
//        Game.test_elementaryFactors(1031);
//        Game.test_elementaryFactors(1033);
//        Game.test_elementaryFactors(1035);
//        Game.test_elementaryFactors(100+120+125+98);
//        Game.test_elementaryFactors(105);
//        Game.test_elementaryFactors(108);
//        Game.test_elementaryFactors(125);
//        Game.test_elementaryFactors(114);
//        Game.test_elementaryFactors(105+108+112+114);
//        Game.test_elementaryFactors(125 + 108);
//        System.out.println("GG " + game.gamers.get(0).getNumber() + "   CC " + game.coalitions.get(0).toString() + " " + game.coalitions.get(0).getNumber());
    }

    public static void bestCoalitions() {
        Game g = ForTest.getGame();
        Partitioning<Gamer> partitions = new Partitioning<>(g.gamers);
        ArrayList<ArrayList<ArrayList<Gamer>>> bestPartitions = new ArrayList<>();
        int maxSummaryProfit = 0;
        for (ArrayList<ArrayList<Gamer>> partition : partitions) {  //Subsets
            int summaryProfit = 0;
            System.out.print("Partition       ");
            for (ArrayList<Gamer> set : partition) {                //Coalitions
                printSet(set);
                Coalition c = Coalition.makeTemporaryCoalition(g, set);
                g.characteristicFunction.calculateIncome(c);
                summaryProfit += c.getIncome;
}
            System.out.println(" -> (" + summaryProfit + ")");
            if (summaryProfit > maxSummaryProfit) {
                maxSummaryProfit = summaryProfit;
                bestPartitions.clear();
                bestPartitions.add(partition);
            } else if (summaryProfit == maxSummaryProfit) {
                bestPartitions.add(partition);
            }
        }
        System.out.println("");
        int sumIncome = 0;
        for (Gamer gamer : g.gamers) {
            sumIncome += gamer.getIncome;
        }
        System.out.println("Sum alone income " + sumIncome);
        for (ArrayList<ArrayList<Gamer>> bestPartition : bestPartitions) {
            System.out.print("Best Partition  ");
            for (ArrayList<Gamer> set : bestPartition) {
                printSet(set);
            }
            System.out.println(" -> (" + maxSummaryProfit + ")");
        }
    }

    private static void printSet(ArrayList<Gamer> set) {
        System.out.print("{");
        for (Gamer gamer : set) {
            System.out.print(gamer.getNumber() + ",");
        }
        System.out.print("}");
    }

//    /**
//     * for testing elementaryFactors method
//     *
//     * @param n
//     */
//    public static void test_elementaryFactors(int n) {
//        System.out.println("--------------------------------- " + n);
//        ArrayList<Integer> ret = ElementaryFactorsFunction.elementaryFactors(n);
//        int sum = 0;
//        for (Integer re : ret) {
//            System.out.println("*" + re);
//            sum += re;
//        }
//        System.out.println("Elementary factors sum " + sum);
//    }
    

}