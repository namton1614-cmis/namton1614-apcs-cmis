
class Planet
{
    private double rand =1* (Math.random());
    private double radius=1* (Math.random());
    private int maxPopulation=1;
    private double percentSpaceMarines=1;
    private double maxSpaceMarinesPerStarDestroyer=(int)(maxPopulation*percentSpaceMarines);
    private String [] name = { "Alpha" , "Beta", "Gamma", "Delta"};
    private String [] relation = { "hostile" , "hostile", "hostile", "hostile", "hostile"};
    public String toString()
    {
        return String.format(
            "Name: %s %.2f\n" +
            "Relationship: %s\n" + 
            "Radius: %.2f\n" +
            "Population: %d\n" +
            "Space Marines as percent of Pop.: %.2f\n" +
            "Space Marines: %d\n" +
            "Star Destroyers: %d\n" +
            "Space Marines per star destroyer: %.2f\n" ,
            name[ (int)(Math.random()*4)],rand, relation[ (int)(Math.random()*5)],
            radius,(int)((Math.random()*maxPopulation+1)),percentSpaceMarines,(int)(maxPopulation*percentSpaceMarines),
            (int)(Math.random()*maxSpaceMarinesPerStarDestroyer+1),
            (double)((int)((maxPopulation*percentSpaceMarines)/maxSpaceMarinesPerStarDestroyer)/(int)(maxPopulation*percentSpaceMarines)));
    }

    public Planet()
    {
      relation = new String []{ "hostile" , "at war", "neutral", "friendly", "ally"};
      radius = 1;
    }

    public Planet( int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation = maxPopulation;
        this.percentSpaceMarines = percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
    }
}
