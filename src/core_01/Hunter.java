package core_01;

import java.util.Random;


public class Hunter {
    private Random random = new Random(System.currentTimeMillis());
    private int randomBow1 = random.nextInt(3);
    private int randomBow2 = random.nextInt(3);
    private int randomBow3 = random.nextInt(3);
    private int randomBow4 = random.nextInt(3);
    private int randomBow5 = random.nextInt(3);
    private int randomShotgun1 = random.nextInt(3);
    private int randomShotgun2 = random.nextInt(3);
    private int randomShotgun3 = random.nextInt(3);
    private int randomShotgun4 = random.nextInt(3);
    private int randomShotgun5 = random.nextInt(3);
    private int randomRifle1 = random.nextInt(3);
    private int randomRifle2 = random.nextInt(3);
    private int randomRifle3 = random.nextInt(3);
    private int randomRifle4 = random.nextInt(3);
    private int randomRifle5 = random.nextInt(3);
    private String name;
    private Bow bow;
    private Shotgun shotgun;
    private Rifle rifle;
    private int totalPoints;
    private Bow bowList [] = {new Bow("лук", "Яструб", 24, 25), new Bow("лук", "Орел", 30, 20),
            new Bow("лук", "Ворон", 36, 17)};
    private Shotgun shotgunList [] = {new Shotgun("рушниця", "SF-13", 12, 50), new Shotgun("рушниця", "SR-54", 15, 40),
            new Shotgun("рушниця", "SA-567", 18, 33)};
    private Rifle rifleList [] = {new Rifle("гвинтівка", "RT-shark", 8, 75), new Rifle("гвинтівка", "RW-tiger", 9, 67),
            new Rifle("гвинтівка", "RU-bear", 10, 60)};

    public Hunter(String name) {
        this.name = name;
        this.bow = getBow();
        this.shotgun = getShotgun();
        this.rifle = getRifle();
        this.totalPoints = getTotalPoints();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bow getBow() {
        if(getName().equals("Петро")) {
            bow = bowList[randomBow1];
        }
        else if(getName().equals("Василь")) {
            bow = bowList[randomBow2];
        }
        else if(getName().equals("Іван")) {
            bow = bowList[randomBow3];
        }
        else if(getName().equals("Юра")) {
            bow = bowList[randomBow4];
        }
        else if(getName().equals("Микола")) {
            bow = bowList[randomBow5];
        }
        return bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public Shotgun getShotgun() {
        if(getName().equals("Петро")) {
            shotgun = shotgunList[randomShotgun1];
        }
        else if(getName().equals("Василь")) {
            shotgun = shotgunList[randomShotgun2];
        }
        else if(getName().equals("Іван")) {
            shotgun = shotgunList[randomShotgun3];
        }
        else if(getName().equals("Юра")) {
            shotgun = shotgunList[randomShotgun4];
        }
        else if(getName().equals("Микола")) {
            shotgun = shotgunList[randomShotgun5];
        }
        return shotgun;
    }

    public void setShotgun(Shotgun shotgun) {
        this.shotgun = shotgun;
    }

    public Rifle getRifle() {
        if(getName().equals("Петро")) {
            rifle = rifleList[randomRifle1];
        }
        else if(getName().equals("Василь")) {
            rifle = rifleList[randomRifle2];
        }
        else if(getName().equals("Іван")) {
            rifle = rifleList[randomRifle3];
        }
        else if(getName().equals("Юра")) {
            rifle = rifleList[randomRifle4];
        }
        else if(getName().equals("Микола")) {
            rifle = rifleList[randomRifle5];
        }
        return rifle;
    }

    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
