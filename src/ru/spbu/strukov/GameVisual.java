package ru.spbu.strukov;

import java.awt.Color;

/**
 * Created on 2022-01-30 19:08:49
 * @author Alexander Mikhailovich Kovshov
 */
public class GameVisual extends Game {
    
    public javax.swing.JTextArea textArea;
    public javax.swing.JPanel canvas;
    public Color[] gamerColors = {
        new Color(0xFFB0B0),
        new Color(0xEAD5B0),
        new Color(0xD5EAB0),
        new Color(0xB0FFB0),
        new Color(0xB0EAD5),
        new Color(0xB0D5EA),
        new Color(0xB0B0FF),
        new Color(0xD5B0EA),
        new Color(0xEAB0D5),
        new Color(0xD5D5D5),
    };
    public Color coalitionBorderColor = new Color(0x8844AA);
    public Color coalitionFillColor = new Color(0xDD44AA);
    int topEnd = 10;
    

    public GameVisual(Game game) {
        super(game.gamers.size(), game.payoff, game.isLargeInitialCoalition, game.decision, game.characteristicFunction);
        this.gamers = game.gamers;
        this.coalitions = game.coalitions;
    }
        
    @Override
    public void play() {
        textArea.setText("");
        for (int i = 0; i < 20; i++) { //Петля по ходам игры.
            //make coalitions
            clearOffers();
            //Делаем предложения
            makeOffers();
            //вывод
            for (Gamer gamer : gamers) {
                gamer.pie = gamer.coalition.pies.get(gamer);
                textArea.append(gamer + "->" + gamer.offer); textArea.append("\r\n");
//                System.out.println(gamer + "->" + gamer.offer);
            }
            for (Coalition coalition : coalitions) {
                textArea.append(coalition + "->" + coalition.offer); textArea.append("\r\n");
//                System.out.println(coalition + "->" + coalition.offer);
            }
            //Принимаем (не принимаем) предложения
            processOffers();
            //вывод
            int sumCoal = 0;//суммарный выигрыш всех коалиций
            for (Coalition coalition : coalitions) {
                sumCoal += coalition.getIncome;
            }
            int sumGamr = 0;//суммарный выигрыш всех игроков
            for (Gamer gamer : gamers) {
                sumGamr += gamer.getIncome;
            }
            int minLastChange = 1000;
            for (Coalition coalition : coalitions) {
                if (coalition.lastChange < minLastChange) {
                    minLastChange = coalition.lastChange;
                }
                coalition.lastChange++;
            }
            if (minLastChange > 5) {
                break;
            }
            textArea.append(" ------------------------------------------------------- " 
                    + i + " # " + sumCoal + " ~ " + sumGamr);  textArea.append("\r\n");
//            System.out.println(" ------------------------------------------------------- " 
//                    + i + " # " + sumCoal + " ~ " + sumGamr);
        }
        textArea.append("===============================  Game over ==============================");
//        System.out.println("===============================  Game over ==============================");
    
    }
    
    public void playOneStep() {
            //make coalitions
            clearOffers();
            //Делаем предложения
            makeOffers();
            //вывод
            for (Gamer gamer : gamers) {
                gamer.pie = gamer.coalition.pies.get(gamer);
                textArea.append(gamer + "->" + gamer.offer); textArea.append("\r\n");
//                System.out.println(gamer + "->" + gamer.offer);
            }
            for (Coalition coalition : coalitions) {
                textArea.append(coalition + "->" + coalition.offer); textArea.append("\r\n");
//                System.out.println(coalition + "->" + coalition.offer);
            }
            showCoalitions();
            //Принимаем (не принимаем) предложения
            processOffers();
            //вывод
            int sumCoal = 0;//суммарный выигрыш всех коалиций
            for (Coalition coalition : coalitions) {
                sumCoal += coalition.getIncome;
            }
            int sumGamr = 0;//суммарный выигрыш всех игроков
            for (Gamer gamer : gamers) {
                sumGamr += gamer.getIncome;
            }
            int minLastChange = 1000;
            for (Coalition coalition : coalitions) {
                if (coalition.lastChange < minLastChange) {
                    minLastChange = coalition.lastChange;
                }
                coalition.lastChange++;
            }
            textArea.append(" ------------------------------------------------------- " 
                     + " # " + sumCoal + " ~ " + sumGamr);  textArea.append("\r\n");
//            System.out.println(" ------------------------------------------------------- " 
//                    + i + " # " + sumCoal + " ~ " + sumGamr);
    }
    
    
    private void showCoalitions() {
        int rightEnd = 10;
        int ballRadix = 16;
        int ballSize = ballRadix * 2;
        int addSize = 4;
        int addSize2 = addSize * 2;
        int boxSize = ballSize + addSize2;
        java.awt.Graphics g = canvas.getGraphics();
//        int gamerCount = 0;
        for (Coalition coalition : coalitions) {
            g.setColor(coalitionFillColor);
            g.fillRect(rightEnd, topEnd, coalition.gamers.size() * ballSize + addSize2, boxSize);
            g.setColor(coalitionBorderColor);
            g.drawRect(rightEnd, topEnd, coalition.gamers.size() * ballSize + addSize2, boxSize);
            g.drawRect(rightEnd + 1, topEnd + 1, coalition.gamers.size() * ballSize + addSize2 - 2, boxSize - 2);
            for (int i = 0; i < coalition.gamers.size(); i++) {
                Gamer gr = coalition.gamers.get(i);
                g.setColor(gamerColors[gr.getNumber() % gamerColors.length]);
                g.fillOval(rightEnd + addSize + ballSize * i, topEnd + addSize, ballSize, ballSize);
                g.drawOval(rightEnd + addSize + ballSize * i, topEnd + addSize, ballSize, ballSize);
                g.setColor(Color.black);
                g.drawString("" + gr.getNumber(), rightEnd - addSize + ballSize * i + ballRadix - 2, topEnd + addSize + ballRadix + 2);
            }
            rightEnd += coalition.gamers.size() * ballSize + 15;
        }
        topEnd += boxSize + 10;
    }
    
}
