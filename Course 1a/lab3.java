public class lab3 {
    public static void main(String[] args) {
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        System.out.println("Superhero Names:");
        for(int i = 0; i < superheroes.length; ++i)  {
            System.out.println(superheroes[i]);
        }
        System.out.println("Introduction Years:");
        for(int j = 0; j < superheroes.length; ++j)  {
            System.out.println(introductionYears[j]);
        }
        /////////////////////////////////////////////////////////////////////////
        System.out.println(superheroes[2]);
        superheroes[2] = "Thor";
        System.out.println(superheroes[2]);
        /////////////////////////////////////////////////////////////////////////
        System.out.println(introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println(introductionYears[2]);
        /////////////////////////////////////////////////////////////////////////
        System.out.println(superheroes.length);
        System.out.println(introductionYears.length);

   }

}
