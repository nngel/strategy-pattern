
public class Archer implements CharacterType {
    ShootArrow shootArrow = new ShootArrow();
    Shield shieldDef = new Shield();

    @Override
    public String characterAttack() {
        return "Archer " + shootArrow.attack();
    }

    @Override
    public String characterDefense() {
        return shieldDef.defense();
    }
}