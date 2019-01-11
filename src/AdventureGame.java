class Room {


    String[] rmap = {
            "###########",
            "#         #",
            "#         #",
            "#         #",
            "#         #",
            "#         #",
            "#         #",
            "###########"
    };

    public void draw(){
        for(String row : rmap){
            System.out.println(row);
        }
    }

}

class Hero {

    boolean alive;

    String name;
    int attack;
    int health;

    public Hero(String name, int attack) {
        this.health = 100;
        this.name = name;
        this.attack = attack;
        this.alive = true;
    }

    public void attack(Enemy enemy) {
        enemy.health--;

        if (enemy.health == 0) {
            enemy.alive = false;
            System.out.println("Enemy defeated!");
            System.exit(0);
        }

    }
}

    class Enemy {

        boolean alive;

        String name;
        int attack;
        int health;

        public Enemy(String name, int attack) {
            this.health = 100;
            this.name = name;
            this.attack = attack;
            this.alive = true;
        }

        public void speak() {
            // TODO:
        }

        public void attack(Hero player) {
            player.health--;
            if (player.health == 0) {
                player.alive = false;
                System.out.println("You were defeated!");
                System.exit(0);
            }
        }

        public String toString() {
            return this.name + " " + this.attack;
        }

    }

    class DungeonCrawler {

        public static void main(String[] args) {

            Room r1 = new Room();

            Enemy e1 = new Enemy("Bob", 2);

            Hero h1 = new Hero("Logan", 5);

            while (true) {
                h1.attack(e1);
                e1.attack(h1);
            }
        }
    }

