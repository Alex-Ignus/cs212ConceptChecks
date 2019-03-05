public interface IBasicMagic {



    /**
     * @return
     */
    //all magic users have theses veriables
    int mana = 0;

    int health = 0;

    int spellRank = 0;

    String MmagicRank = null;

    int magicRank = 0;

    int spellCasterLevel=0;

    //if true, increass all spells by 1.5 its orignal value + its rank + 5 *2
    boolean spellMagnituide = false;

    //all magic regardless of class, have these fucntions for spells

    //calculates magic damage, calculation is dependednt on class type and spell rank
    int magicDamage(int spellRank);

    //calculates magic protection from spells , calculation is dependednt on class type and spell rank
    int magicProtection(int spellRank);

    //calculates magic healing  from spells , calculation is dependednt on class type and spell rank
    int magicHealing(int spellRank);




    //calculates magic rank, I.E. novice-Master
    String magicRank(int magicRankNum);

    //provides a numeric value of the spell casters rank
    int magicRank(int mana, int level);


}
