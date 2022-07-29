package org.academiadecodigo.ObstaclesJorge;

import org.academiadecodigo.Grid.Counters.CashCount;
import org.academiadecodigo.Grid.Counters.HealthCount;
import org.academiadecodigo.Penguin.CunnilinuxPenguin;

import java.awt.*;

public class ObstacleFactory {
    CunnilinuxPenguin peg;

    public ObstacleFactory(CunnilinuxPenguin peg) {
        this.peg = peg;
    }

    public int crashCounter = 0;

    CashCount cashCount = new CashCount(); //To initialize the cash counter
    HealthCount healthCount = new HealthCount(); //To initialize the health counter
    Money O1;
    Obstacle O2;
    Obstacle O3;
    Obstacle O4;
    Obstacle O5;
    Obstacle O6;
    Obstacle O7;
    Obstacle O8;


    public Money getO1() {
        return O1;
    }

    public Obstacle getO2() {
        return O2;
    }

    public Obstacle getO3() {
        return O3;
    }

    public Obstacle getO4() {
        return O4;
    }

    public Obstacle getO5() {
        return O5;
    }

    public Obstacle getO6() {
        return O6;
    }

    public Obstacle getO7() {
        return O7;
    }

    public Obstacle getO8() {
        return O8;
    }


    public void generate() throws InterruptedException {
        while (healthCount.isLiving() == true && cashCount.isPaid() == false) {

            Money O1 = new Money();
            Obstacle O2 = new Obstacle();
            Obstacle O3 = new Obstacle();
            Obstacle O4 = new Obstacle();
            Obstacle O5 = new Obstacle();
            Obstacle O6 = new Obstacle();
            Obstacle O7 = new Obstacle();
            Obstacle O8 = new Obstacle();


            O1.money.draw();
            O2.obst.draw();
            O3.obst.draw();
            O4.obst.draw();
            O5.obst.draw();
            O6.obst.draw();
            O7.obst.draw();
            O8.obst.draw();


            Rectangle rectMoney = new Rectangle(O1.money.getX(), O1.money.getY(),
                    O1.money.getWidth() - 5, O1.money.getHeight() - 5);

            Rectangle rectObstacle2 = new Rectangle(O2.obst.getX(), O2.obst.getY(),
                    O2.obst.getWidth(), O2.obst.getHeight());

            Rectangle rectObstacle3 = new Rectangle(O3.obst.getX(), O3.obst.getY(),
                    O3.obst.getWidth(), O3.obst.getHeight());

            Rectangle rectObstacle4 = new Rectangle(O4.obst.getX(), O4.obst.getY(),
                    O4.obst.getWidth(), O4.obst.getHeight());

            Rectangle rectObstacle5 = new Rectangle(O5.obst.getX(), O5.obst.getY(),
                    O5.obst.getWidth(), O5.obst.getHeight());

            Rectangle rectObstacle6 = new Rectangle(O6.obst.getX(), O6.obst.getY(),
                    O6.obst.getWidth(), O6.obst.getHeight());

            Rectangle rectObstacle7 = new Rectangle(O7.obst.getX(), O7.obst.getY(),
                    O7.obst.getWidth(), O7.obst.getHeight());

            Rectangle rectObstacle8 = new Rectangle(O8.obst.getX(), O8.obst.getY(),
                    O8.obst.getWidth(), O8.obst.getHeight());


            Rectangle rectPeg = new Rectangle(peg.getPenguinPicture().getX(), peg.getPenguinPicture().getY() + 10,
                    peg.getPenguinPicture().getWidth() - 10, peg.getPenguinPicture().getHeight());

            System.out.println(crashCounter);
            for (int i = 0; i < 850; i++) {
                rectPeg.setLocation(peg.getPenguinPicture().getX(), peg.getPenguinPicture().getY() + 10);


                if (rectPeg.intersects(rectMoney)) {

                    cashCount.cashOwed(cashCount.getCashCollected());
                    crashCounter++;
                    System.out.println("Crash!!!!!");
                    O1.money.delete();
                    rectMoney.setLocation(0, 0);


                }
                if (rectPeg.intersects(rectObstacle2)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());

                    System.out.println("Beer1");
                    O2.obst.delete();
                    rectObstacle2.setLocation(0, 0);


                }
                if (rectPeg.intersects(rectObstacle3)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());
                    System.out.println("Beer2");
                    O3.obst.delete();
                    rectObstacle3.setLocation(0, 0);


                }


                if (rectPeg.intersects(rectObstacle4)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());
                    System.out.println("Beer3");
                    O4.obst.delete();
                    rectObstacle4.setLocation(0, 0);


                }
                if (rectPeg.intersects(rectObstacle5)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());
                    System.out.println("Beer4");
                    O5.obst.delete();
                    rectObstacle5.setLocation(0, 0);


                }
                if (rectPeg.intersects(rectObstacle6)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());
                    System.out.println("Beer5");
                    O6.obst.delete();
                    rectObstacle6.setLocation(0, 0);


                }
                if (rectPeg.intersects(rectObstacle7)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());
                    System.out.println("Beer6");
                    O7.obst.delete();
                    rectObstacle7.setLocation(0, 0);


                }
                if (rectPeg.intersects(rectObstacle8)) {
                    cashCount.setCurrentDebt(cashCount.getBeerCost());
                    healthCount.healthUpdate(healthCount.getHealthDamage());
                    System.out.println("Beer7");
                    O8.obst.delete();
                    rectObstacle8.setLocation(0, 0);


                }

//####################### TRANSLATE DAS IMAGENS E RECTANGULOS/DELETE CASO CHEGUEM AO FIM #################################################


                if (O1.getPositionMoney().getRow() < 650) {

                    O1.Translate();
                    rectMoney.translate(0, 2);


                } else {

                    O1.getMoney().delete();

                }

                if (O2.getPositionObstacle().getRow() < 650) {
                    O2.Translate();
                    rectObstacle2.translate(0, 2);


                } else {
                    O2.getObst().delete();
                }


                if (O3.getPositionObstacle().getRow() < 650) {
                    O3.Translate();

                    rectObstacle3.translate(0, 2);


                } else {
                    O3.getObst().delete();
                }


                if (O4.getPositionObstacle().getRow() < 650) {

                    O4.Translate();
                    rectObstacle4.translate(0, 2);


                } else {
                    O4.getObst().delete();
                }


                if (O5.getPositionObstacle().getRow() < 650) {
                    O5.Translate();

                    rectObstacle5.translate(0, 2);


                } else {
                    O5.getObst().delete();
                }


                if (O6.getPositionObstacle().getRow() < 650) {
                    O6.Translate();

                    rectObstacle6.translate(0, 2);


                } else {
                    O6.getObst().delete();
                }


                if (O7.getPositionObstacle().getRow() < 650) {
                    O7.Translate();

                    rectObstacle7.translate(0, 2);


                } else {
                    O7.getObst().delete();
                }


                if (O8.getPositionObstacle().getRow() < 650) {
                    O8.Translate();

                    rectObstacle8.translate(0, 2);


                } else {
                    O8.getObst().delete();
                }


                if (O1.getPositionMoney().getRow() > 650
                        && O2.getPositionObstacle().getRow() > 650
                        && O3.getPositionObstacle().getRow() > 650
                        && O4.getPositionObstacle().getRow() > 650
                        && O5.getPositionObstacle().getRow() > 650
                        && O6.getPositionObstacle().getRow() > 650
                        && O7.getPositionObstacle().getRow() > 650
                        && O8.getPositionObstacle().getRow() > 650) {
                    continue;
                }


                Thread.sleep(5);


            }


        }
    }


}