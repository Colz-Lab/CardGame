public class Visualizations {
    public static void main(String[] args) {
    }

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
            ║   Swap Hands CLockwise   ║
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
}
