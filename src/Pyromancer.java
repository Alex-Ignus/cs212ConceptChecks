import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Pyromancer extends Mage {

    private Map<String, Integer> Attrubites = new HashMap<>(getAtrubutes());

    String magicRank = super.magicRank(Attrubites.get("Magical Ranking"));

    public Pyromancer(){

        super();
    }

    public Pyromancer(int health, int mana, int spellCasterLevel){
        super(health, mana, spellCasterLevel);

    }
    List<String> slottedSpells =  new ArrayList<>(baseSpells);
    int slotSpells = numOfSpellSLots(Attrubites.get("Magical Ranking"), slottedSpells.size());
    //()->  {slottedSpells.add("im a new spell");}


    @Override
    public int magicDamage(int spellRank) {
        return 0;
    }

    @Override
    public int magicProtection(int spellRank) {
        return 0;
    }

    @Override
    public int magicHealing(int spellRank) {
        return 0;
    }

    @Override
    public void addSpells(int spellSlotSize, List<String> slottedSpells) {

    }

    @Override
    public void removeSpells(int indexOfSpell) {

    }


}
