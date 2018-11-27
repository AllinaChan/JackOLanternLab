public class Runner {
    public static void main(String[] args )
    {
        String[][] face = new String [5][15];
        JackOLantern face1= new JackOLantern(face);

        face1.fill("X");
        face1.edit(" ", 0, 0);
        face1.edit(" ", 4, 7);
        face1.edit(" ", 4, 0);
        face1.edit(" ", 0, 9);
        face1.edit(" ", 4, 8);
        face1.edit(" ", 4, 9);

        face1.edit(" ", 4, 10);
        face1.edit(" ", 4, 11);
        face1.edit(" ", 4, 12);
        face1.edit(" ", 4, 13);
        face1.edit(" ", 4, 14);
        face1.edit(" ", 3, 10);
        face1.edit(" ", 3, 11);
        face1.edit(" ", 3, 12);
        face1.edit(" ", 3, 13);
        face1.edit(" ", 3, 14);
        face1.edit(" ", 2, 10);
        face1.edit(" ", 2, 11);
        face1.edit(" ", 2, 12);
        face1.edit(" ", 2, 13);
        face1.edit(" ", 2, 14);
        face1.edit(" ", 1, 10);
        face1.edit(" ", 1, 11);
        face1.edit(" ", 1, 12);
        face1.edit(" ", 1, 13);
        face1.edit(" ", 1, 14);
        face1.edit(" ", 0, 10);
        face1.edit(" ", 0, 11);
        face1.edit(" ", 0, 12);
        face1.edit(" ", 0, 13);
        face1.edit(" ", 0, 14);

        face1.edit("Z", 4, 10);
        face1.edit("Z", 4, 11);
        face1.edit("Z", 4, 12);
        face1.edit("Z", 4, 13);
        face1.edit("Z", 4, 14);

        face1.edit("-", 0, 2);
        face1.edit("-", 0, 3);
        face1.edit("-", 0, 6);
        face1.edit("-", 0, 7);
        face1.edit("X", 4, 7);
        face1.edit("X", 4, 8);
        face1.edit("X", 0, 8);
        face1.edit("0", 1, 3);
        face1.edit("0", 1, 6);
        face1.edit("^", 2, 4);
        face1.edit("^", 2, 5);
        face1.edit("|", 3, 2);
        face1.edit("|", 3, 3);
        face1.edit("_", 3, 4);
        face1.edit("_", 3, 5);
        face1.edit("|", 3, 6);
        face1.edit("|", 3, 7);
        System.out.println(face1);
    }
}
