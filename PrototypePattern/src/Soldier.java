class Soldier implements Cloneable{
    private int health,speed,power;
    private boolean isAvailableForWar;
    public Soldier(int health,int speed,int power,boolean isAvailableForWar){
        this.health=health;this.speed=speed;this.power=power;
        this.isAvailableForWar=isAvailableForWar;
    }
    public void showSoldierInfo(){
        System.out.println("Health: " + health + 
        " Speed: " + speed + " Power: " + power);
        if(isAvailableForWar){
            System.out.println("ready for war.");
        }else{
            System.out.println("not ready fotr war.");
        }
    }

    /*In order to perform object copying,
     the Cloneable Interface is implemented
      and the clone method is overridden.*/
    @Override
    public Soldier clone(){
        Soldier soldier = null;
        try{
            soldier=(Soldier) super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
        return soldier;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power=power;
    }

    public boolean getisAvailableForWar(){
        return isAvailableForWar;
    }
    public void setisAvailableForWar(boolean isAvailableForWar){
        this.isAvailableForWar=isAvailableForWar;
    }

}