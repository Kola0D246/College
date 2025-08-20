public class Ladder {
    public static void main(String[] args){
        if (args.length != 6) {
            System.out.println("Usage: java Ladder <word> <storey:int> <indent:int> <slant:boolean>");
            return;
        }

        String word = args[0];
        int wordSize = args[0].length();
        int storey = Integer.parseInt(args[1]);
        int gap = Integer.parseInt(args[2])+1;
        int width = Integer.parseInt(args[3]);
        int indent = Integer.parseInt(args[4]);
        int slantStep = Integer.parseInt(args[5]);
        int shift;

        for (int line=storey*gap+2; line>0; line--){
            shift = indent + slantStep*line;
            System.out.print(" ".repeat(shift));
            if (line%gap == 0) {
                System.out.println(word.repeat(width+2));
            }
            else {
                System.out.println(word+ " ".repeat(wordSize*width) +word);
            }
        }
    }
}

// javac Ladder.java
// java Ladder <char:str> <storey:int> <gap:int> <width:int> <indent:int> <slantStep:int>