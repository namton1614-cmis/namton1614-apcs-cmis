public class Genesis
{
    String name;
    String relationship;
    double radius;
    int pop;
    int spaceMarines;
    int starDestroyers;

    public Genesis()
    {
        String[] rels = { "at war", "hostile", "neutral", "friendly", "ally" };
        String[] pres = {"Alpha", "Beta" , "Gamma", "Delta"};
        radius = 1.0;
        pop = 1;
        spaceMarines = 1;
        starDestroyers = 1;
        name = String.format("%s %.2f", pres[(int)(Math.random() * pres.length)], Math.random());
        relationship = rels[(int)(Math.random() * rels.length)];
    }

    public Genesis(int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        String[] pres = {"Alpha", "Beta" , "Gamma", "Delta"};
        pop = (int)(maxPopulation * Math.random());
        radius = Math.random();
        relationship = "hostile";
        spaceMarines = (int)(pop * percentSpaceMarines);

        double spaceMarinesPerStarDestroyer = (double) maxSpaceMarinesPerStarDestroyer * Math.random();
        starDestroyers = (int)(spaceMarines / spaceMarinesPerStarDestroyer);
        name = String.format("%s %.2f", pres[(int)(Math.random() * pres.length)], Math.random());
    }

    public String toString()
    {
        double percentSpaceMarines = (double)spaceMarines / (double)pop;
        double smPerSd = (double)spaceMarines / (double)starDestroyers;

        String result = String.format(
                "Name: %s\n"+
                "Relationship: %s\n"+
                "Radius: %.2f\n"+
                "Population: %d\n"+
                "Space Marines: %d\n"+
                "Space Marines as percent of Pop.: %.2f\n"+
                "Star Destroyers: %d\n"+
                "Space Marines per star destroyer: %.2f\n", 
                name, relationship, radius, pop, spaceMarines, percentSpaceMarines, starDestroyers, smPerSd );
        return result;
    }
}