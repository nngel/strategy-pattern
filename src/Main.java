

public class Main {
    public static void main(String [] args){
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());
        
        System.out.println("\nCharacters Attack Actions: \n");
        System.out.println(knight.characterAtk());
        System.out.println(wizard.characterAtk());
        System.out.println(archer.characterAtk());
        System.out.println();

        System.out.println("\nCharacters Defense Actions: \n");
        System.out.println(knight.characterDef());
        System.out.println(wizard.characterDef());
        System.out.println(archer.characterDef());
        System.out.println();
    }
}
