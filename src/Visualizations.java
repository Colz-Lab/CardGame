public class Visualizations {
    public static void main(String[] args) {
    }

    // Below is all the ASCII art printouts with their various methods to call upon.
    static String pointsCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║        Point Card        ║
            ║                          ║
            ║          ♦ ♦ ♦           ║
            ║           ♦ ♦            ║
            ║            ♦             ║
            ║                          ║
            ╠══════════════════════════╣
            ║       Gain Points        ║
            ╚══════════════════════════╝
            """;

    public static void printPointCardVisual() {
        System.out.println(pointsCardVisual);
    }


    static String freezeCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║       Freeze Card        ║
            ║                          ║
            ║           ♦ ♦            ║
            ║       ♦ ♦ ♦ ♦ ♦ ♦        ║
            ║           ♦ ♦            ║
            ║                          ║
            ╠══════════════════════════╣
            ║     Freeze A Player      ║
            ╚══════════════════════════╝
            """;

    public static void freezeCardVisual() {
        System.out.println(freezeCardVisual);
    }


    static String attackCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║       Attack Card        ║
            ║                          ║
            ║          ♦ ♦ ♦           ║
            ║           ♦ ♦            ║
            ║          ♦ ♦ ♦           ║
            ║            ♦             ║
            ╠══════════════════════════╣
            ║     Attack A Player      ║
            ╚══════════════════════════╝
            """;

    public static void attackCardVisual() {
        System.out.println(attackCardVisual);
    }

    static String thiefCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║        Thief Card        ║
            ║                          ║
            ║          ♦ ♦ ♦           ║
            ║       ♦ ♦ ♦ ♦ ♦ ♦        ║
            ║           ♦ ♦            ║
            ║                          ║
            ╠══════════════════════════╣
            ║   Steal A Players Card   ║
            ╚══════════════════════════╝
            """;

    public static void thiefCardVisual() {
        System.out.println(thiefCardVisual);
    }


    static String reverseDirectionCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║  Reverse Direction Card  ║
            ║                          ║
            ║      ♦ ♦ ♦ ♦ ♦           ║
            ║            ♦             ║
            ║          ♦ ♦ ♦ ♦ ♦       ║
            ║                          ║
            ╠══════════════════════════╣
            ║  Reverse Play Direction  ║
            ╚══════════════════════════╝
            """;

    public static void reverseDirectionCardVisual() {
        System.out.println(reverseDirectionCardVisual);
    }

    static String massSwapCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║      Mass Swap Card      ║
            ║                          ║
            ║         ♦   ♦   ♦        ║
            ║         ♦   ♦   ♦        ║
            ║         ♦   ♦   ♦        ║
            ║                          ║
            ╠══════════════════════════╣
            ║   Swap Hands Clockwise   ║
            ╚══════════════════════════╝
            """;

    public static void massSwapCardVisual() {
        System.out.println(massSwapCardVisual);
    }


    static String targetSwapCardVisual = """
            ╔══════════════════════════╗
            ║      REMPEL RUMBLE       ║
            ╠══════════════════════════╣
            ║                          ║
            ║     Target Swap Card     ║
            ║                          ║
            ║          ♦    ♦          ║
            ║         ♦      ♦         ║
            ║        ♦  ♦  ♦  ♦        ║
            ║                          ║
            ╠══════════════════════════╣
            ║ Swap Hands With a Player ║
            ╚══════════════════════════╝
            """;

    public static void targetSwapCardVisual() {
        System.out.println(targetSwapCardVisual);
    }


    // Instanceof is used to check the actual type of the object, if the check is true,
    // that matching visual card will be printed
    public static void displayCard(Card card) {

        if (card instanceof PointCard) {
            printPointCardVisual();
        }

        else if (card instanceof AttackCard) {
            attackCardVisual();
        }

        else if (card instanceof FreezeCard) {
            freezeCardVisual();
        }

        else if (card instanceof ThiefCard) {
            thiefCardVisual();
        }

        else if (card instanceof ReverseDirectionCard) {
            reverseDirectionCardVisual();
        }

        else if (card instanceof MassSwapCard) {
            massSwapCardVisual();
        }

        else if (card instanceof TargetSwapCard) {
            targetSwapCardVisual();
        }
    }
}
