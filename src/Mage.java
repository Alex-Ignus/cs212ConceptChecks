
import java.util.*;

public abstract class Mage implements IBasicMagic {



    /* the amount of energy the spell caster has to cast spells */
    private int mana;


    //the life points a spell caster has in order to live
    private int health;

    //the over all level of the spell caster
    private int spellCasterLevel;

    //the rank of a spell being casted
    int spellRank;

    //the string rank of a spellcaster, I.E. Novice
    String magicRank;

    //the numberic value of a spellcasters rank, I.E. novice=1
    private int magicRankNum;


    Mage() {
        health = 1;
        mana = 0;
        spellCasterLevel = 0;
        magicRankNum = magicRank(mana, spellCasterLevel);
    }
    Mage(int health, int mana, int spellCasterLevel) {

        this.health = health;
        this.mana = mana;
        this.spellCasterLevel = spellCasterLevel;
        this.magicRankNum = magicRank(mana, spellCasterLevel);
    }

    public Map<String, Integer> getAtrubutes(){
        Map<String, Integer> attrubutes = new HashMap<String, Integer>();
        attrubutes.put("Health", this.health);
        attrubutes.put("Mana",this.mana);
        attrubutes.put("Caster Level",this.spellCasterLevel);
        attrubutes.put("Magical Ranking",this.magicRankNum);
        return attrubutes;

    }


    /* All subclasses of mages must of the same implemnentation of the following magic machanics */

    /* calculates magic rank, I.E. novice-Master */
    @Override
    public  String magicRank(int magicRankNum){
        switch(magicRankNum){
            case 1:
                return "Novice";
            case 2:
                return "Apprentice";
            case 3:
                return "Adept";
            case 4:
                return "Expert";
            case 5:
                return "Master";
            case 6:
                return "Grand Master";
            case 7:
                return "Arch Mage";
            case 8:
                return "Transcendent Magus";
            default:
                return "Non magical Being";
        }
    }

    /* provides a numeric value of the spell casters rank */
    @Override
    public int magicRank(int mana, int spellCasterLevel){
        double casterPower = ((mana*spellCasterLevel)*.01);
        if ( casterPower>=10 && casterPower < 50 ) {
            return 1;

        } else if ( casterPower>=50 && casterPower < 100 ) {
            return 2;

        } else if (casterPower>=100 && casterPower < 200 ) {
            return 3;

        } else if (casterPower>=200 && casterPower < 350 ) {
            return 4;

        } else if ( casterPower>=350 &&casterPower < 500 ) {
            return 5;

        } else if (casterPower>=500 && casterPower < 650 ) {
            return 6;

        } else if (casterPower>=650 && casterPower < 900 ) {
            return 7;

        } else if (casterPower > 900 ) {
            return 8;

        } else {
            return 0;
        }
    }





    /* subclasses implement this based on their mage clas*/
    /* calculates magic damage, calculation is dependednt on class type and spell rank */
    @Override
    abstract public int magicDamage(int spellRank);

    /* calculates magic protection from spells , calculation is dependednt on class type and spell rank */
    abstract public int magicProtection(int spellRank);

    /* calculates magic healing  from spells , calculation is dependednt on class type and spell rank */
    abstract  public int magicHealing(int spellRank);


    /* Mage only functions */
    /**
     * sets the number of spell slots for the magic in question based on their magical ranking
     *
     * @param  //int magicRank, int BaseSpellsSize;
     * @return int
     */
    public int numOfSpellSLots(int magicRank, int slottedSpells){
        int random = (int)(Math.random() * 10 + 1);
        return  (slottedSpells +magicRank ) + random;
    }

    /* create add and remove lambda functions */
    abstract public void addSpells(int spellSlotSize, List<String> slottedSpells);
    abstract public void removeSpells(int indexOfSpell);

    //list of spells for and mage branch class
    public List<String> baseSpells = Arrays.asList("Magic Bolt", "Magic Shield", "Magic Heal");

    public List<String> slottedSpells = new ArrayList<>(baseSpells);
    //the number of spells a mage can have
    int spellSlotSize = numOfSpellSLots(magicRankNum, slottedSpells.size());







}
