import java.util.Random;
import java.util.Scanner;

public class RPGGame {
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int gold;
    private int potions;
    private int experience;
    private int level;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public RPGGame() {
        maxHealth = 100 + random.nextInt(51); // 100-150
        health = maxHealth;
        attack = 10 + random.nextInt(11); // 10-20
        defense = 5 + random.nextInt(6); // 5-10
        speed = 5 + random.nextInt(6); // 5-10
        luck = random.nextInt(101); // 0-100
        gold = 50;
        potions = 3;
        experience = 0;
        level = 1;
    }

    private void displayStats() {
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Speed: " + speed);
        System.out.println("Luck: " + luck);
        System.out.println("Gold: " + gold);
        System.out.println("Potions: " + potions);
        System.out.println("Experience: " + experience);
        System.out.println("Level: " + level);
    }

    private void buyPotion() {
        int potionCost = 10;
        if (gold >= potionCost) {
            potions++;
            gold -= potionCost;
            System.out.println("Bought a potion! Potions: " + potions + ", Gold: " + gold);
        } else {
            System.out.println("Not enough gold to buy a potion.");
        }
    }

    private void usePotion() {
        if (potions > 0 && health < maxHealth) {
            potions--;
            health = Math.min(maxHealth, health + 50);
            System.out.println("Used a potion! Health: " + health + ", Potions left: " + potions);
        } else if (potions == 0) {
            System.out.println("No potions left!");
        } else {
            System.out.println("Health is already full.");
        }
    }

    private void fight() {
        int beastHealth = 50 + random.nextInt(51); // 50-100
        int beastAttack = 8 + random.nextInt(6); // 8-13
        int beastDefense = 3 + random.nextInt(4); // 3-6
        int beastSpeed = 4 + random.nextInt(4); // 4-7

        System.out.println("A wild beast appears!");
        while (health > 0 && beastHealth > 0) {
            if (speed >= beastSpeed) {
                beastHealth = attackBeast(beastHealth, beastDefense);
                if (beastHealth > 0) health = beastAttack(beastAttack, health);
            } else {
                health = beastAttack(beastAttack, health);
                if (health > 0) beastHealth = attackBeast(beastHealth, beastDefense);
            }
        }

        if (health > 0) {
            int earnedGold = 10 + random.nextInt(11); // 10-20
            int earnedExp = 15 + random.nextInt(11); // 15-25
            gold += earnedGold;
            experience += earnedExp;
            System.out.println("You defeated the beast! Earned " + earnedGold + " gold and " + earnedExp + " experience.");
            levelUp();
        } else {
            System.out.println("You were defeated by the beast...");
        }
    }

    private int attackBeast(int beastHealth, int beastDefense) {
        int damage = Math.max(0, attack - beastDefense + random.nextInt(5) - 2);
        beastHealth -= damage;
        System.out.println("You hit the beast for " + damage + " damage. Beast's health: " + Math.max(0, beastHealth));
        return beastHealth;
    }

    private int beastAttack(int beastAttack, int playerHealth) {
        int beastDamage = Math.max(0, beastAttack - defense + random.nextInt(5) - 2);
        playerHealth -= beastDamage;
        System.out.println("The beast hits you for " + beastDamage + " damage. Your health: " + Math.max(0, playerHealth));
        return playerHealth;
    }

    private void levelUp() {
        int levelThreshold = 100;
        if (experience >= levelThreshold) {
            level++;
            experience -= levelThreshold;
            maxHealth += 10;
            health = maxHealth;
            attack += 2;
            defense += 2;
            speed += 1;
            System.out.println("Level up! You are now level " + level);
        }
    }

    public void start() {
        while (true) {
            System.out.println("\nChoose an action: ");
            System.out.println("1. Fight");
            System.out.println("2. Buy Potion");
            System.out.println("3. Use Potion");
            System.out.println("4. View Stats");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fight();
                    break;
                case 2:
                    buyPotion();
                    break;
                case 3:
                    usePotion();
                    break;
                case 4:
                    displayStats();
                    break;
                case 5:
                    System.out.println("Exiting game. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            if (health <= 0) {
                System.out.println("Game Over.");
                return;
            }
        }
    }

    public static void main(String[] args) {
        RPGGame game = new RPGGame();
        game.start();
    }
}
