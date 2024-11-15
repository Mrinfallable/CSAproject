class Main
{
      public static void main(String[] args) {
            Lex speak = new Lex();
            for(int i = 0; i < 15; i++){System.out.print(speak.getSample(i).replaceAll("ingy", "").replaceAll("ent", ""));}   
      }
}
