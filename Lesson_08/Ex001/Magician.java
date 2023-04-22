package Lesson_08.Ex001;
 
public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100));
        this.maxMana = Magician.r.nextInt(50);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }

    @Override
    public void die() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'die'");
    }
}