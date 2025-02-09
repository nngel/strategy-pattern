

public class Wizard implements CharacterType {
    CastSpell castSpell = new CastSpell();
    CreateMagic magicBarrier = new CreateMagic();

    @Override
    public String characterAttack() {
        return "Wizard " + castSpell.attack();
    }

    @Override
    public String characterDefense() {
        return magicBarrier.defense();
    }
}
