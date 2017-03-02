package core_01;


import java.util.Random;

public class Tournament {
    private Random random = new Random(System.currentTimeMillis());
    private Hunter hunter1 = new Hunter("Петро");
    private Hunter hunter2 = new Hunter("Василь");
    private Hunter hunter3 = new Hunter("Іван");
    private Hunter hunter4 = new Hunter("Юра");
    private Hunter hunter5 = new Hunter("Микола");
    private Hunter hunterList[] = {hunter1, hunter2, hunter3, hunter4, hunter5};
    private Hunter winner = hunterList[0];


    public void start() {
        System.out.println("Вітаю на змаганні мисливців!");
        System.out.println("У ньому беруть участь: " + hunter1.getName() + ", " + hunter2.getName() + ", " + hunter3.getName()
                + ", " + hunter4.getName() + " та " + hunter5.getName());
        System.out.println("Перший етап: полювання на зайців використовуючи лук");
        System.out.println();
        firstCompetition();
        System.out.println();
        System.out.println("Другий етап: полювання на качок використовуючи рушницю");
        System.out.println();
        secondCompetition();
        System.out.println();
        System.out.println("Третій етап: полювання на оленів використовуючи гвинтівку");
        System.out.println();
        thirdCompetition();
        System.out.println();
        results();
    }

    public void results(){
        for(int i = 0; i < hunterList.length; i++){
            if(winner.getTotalPoints() < hunterList[i].getTotalPoints()){
                winner = hunterList[i];
            }
            System.out.println(hunterList[i].getName() + " у підсумку отримав " + hunterList[i].getTotalPoints());
        }
        System.out.println();
        System.out.println("Переможцем стає " + winner.getName() + " набравши " + winner.getTotalPoints() + " балів!!!");
    }

    public void firstCompetition(){
        for(int i = 0; i < hunterList.length; i++){
            int countDeath = 0;
            int countNoMortal = 0;
            int countMortal = 0;
            int countHead = 0;
            int countHeart = 0;
            for(int j = 1; j <= hunterList[i].getBow().getAmmunition(); j++){
                int prey = random.nextInt(101 - 1) + 1;
                if(prey <= hunterList[i].getBow().getPrecision()){
                    countDeath = countDeath + 1;
                    int shot = random.nextInt(101 - 1) + 1;
                    if(shot <= 20){
                        countNoMortal = countNoMortal + 1;
                    }
                    else if(shot > 20 && shot <= 70){
                        countMortal = countMortal + 1;
                    }
                    else if(shot > 70 && shot <= 90){
                        countHead = countHead + 1;
                    }
                    else{
                        countHeart = countHeart + 1;
                    }
                }
            }
            hunterList[i].setTotalPoints((countNoMortal * 5) + (countMortal * 20) + (countHead * 30) + (countHeart * 50));
            System.out.println(hunterList[i].getName() + " вполював " + countDeath + " зайців, з яких " + countNoMortal
                    + " поранено, " + countMortal + " попадання у важливі органи, " + countHead + " попадання в голову та " + countHeart + " у серце");
        }
    }

    public void secondCompetition(){
        for(int i = 0; i < hunterList.length; i++){
            int countDeath = 0;
            int countNoMortal = 0;
            int countMortal = 0;
            int countHead = 0;
            int countHeart = 0;
            for(int j = 1; j <= hunterList[i].getShotgun().getAmmunition(); j++){
                int prey = random.nextInt(101 - 1) + 1;
                if(prey <= hunterList[i].getShotgun().getPrecision()){
                    countDeath = countDeath + 1;
                    int shot = random.nextInt(101 - 1) + 1;
                    if(shot <= 20){
                        countNoMortal = countNoMortal + 1;
                    }
                    else if(shot > 20 && shot <= 70){
                        countMortal = countMortal + 1;
                    }
                    else if(shot > 70 && shot <= 90){
                        countHead = countHead + 1;
                    }
                    else{
                        countHeart = countHeart + 1;
                    }
                }
            }
            hunterList[i].setTotalPoints(hunterList[i].getTotalPoints() + (countNoMortal * 5) + (countMortal * 20) + (countHead * 30) + (countHeart * 50));
            System.out.println(hunterList[i].getName() + " вполював " + countDeath + " качок, з яких " + countNoMortal
                    + " поранено, " + countMortal + " попадання у важливі органи, " + countHead + " попадання в голову та " + countHeart + " у серце");
        }
    }

    public void thirdCompetition(){
        for(int i = 0; i < hunterList.length; i++){
            int countDeath = 0;
            int countNoMortal = 0;
            int countMortal = 0;
            int countHead = 0;
            int countHeart = 0;
            for(int j = 1; j <= hunterList[i].getRifle().getAmmunition(); j++){
                int prey = random.nextInt(101 - 1) + 1;
                if(prey <= hunterList[i].getRifle().getPrecision()){
                    countDeath = countDeath + 1;
                    int shot = random.nextInt(101 - 1) + 1;
                    if(shot <= 20){
                        countNoMortal = countNoMortal + 1;
                    }
                    else if(shot > 20 && shot <= 70){
                        countMortal = countMortal + 1;
                    }
                    else if(shot > 70 && shot <= 90){
                        countHead = countHead + 1;
                    }
                    else{
                        countHeart = countHeart + 1;
                    }
                }
            }
            hunterList[i].setTotalPoints(hunterList[i].getTotalPoints() + (countNoMortal * 5) + (countMortal * 20) + (countHead * 30) + (countHeart * 50));
            System.out.println(hunterList[i].getName() + " вполював " + countDeath + " оленів, з яких " + countNoMortal
                    + " поранено, " + countMortal + " попадання у важливі органи, " + countHead + " попадання в голову та " + countHeart + " у серце");
        }
    }
}
