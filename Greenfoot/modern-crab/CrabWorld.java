import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,245,108);
        Worm worm2 = new Worm();
        addObject(worm2,323,440);
        Worm worm3 = new Worm();
        addObject(worm3,137,510);
        Worm worm4 = new Worm();
        addObject(worm4,52,306);
        Worm worm5 = new Worm();
        addObject(worm5,223,179);
        Worm worm6 = new Worm();
        addObject(worm6,486,139);
        Worm worm7 = new Worm();
        addObject(worm7,456,404);
        Worm worm8 = new Worm();
        addObject(worm8,377,425);
        Worm worm9 = new Worm();
        addObject(worm9,127,194);
        Worm worm10 = new Worm();
        addObject(worm10,200,56);
        Worm worm11 = new Worm();
        addObject(worm11,375,77);
        Worm worm12 = new Worm();
        addObject(worm12,193,338);
        Crab crab = new Crab();
        addObject(crab,358,244);
        Lobster lobster = new Lobster();
        addObject(lobster,398,504);
        Worm worm13 = new Worm();
        addObject(worm13,464,258);
        Worm worm14 = new Worm();
        addObject(worm14,332,434);
        Worm worm15 = new Worm();
        addObject(worm15,206,320);
        Worm worm16 = new Worm();
        addObject(worm16,275,177);
        Worm worm17 = new Worm();
        addObject(worm17,399,186);
        Worm worm18 = new Worm();
        addObject(worm18,373,379);
        Worm worm19 = new Worm();
        addObject(worm19,225,468);
        Worm worm20 = new Worm();
        addObject(worm20,60,278);
        Worm worm21 = new Worm();
        addObject(worm21,45,86);
        Worm worm22 = new Worm();
        addObject(worm22,328,95);
        Worm worm23 = new Worm();
        addObject(worm23,472,86);
        Worm worm24 = new Worm();
        addObject(worm24,301,71);
        Worm worm25 = new Worm();
        addObject(worm25,223,287);
        Worm worm26 = new Worm();
        addObject(worm26,190,427);
        Worm worm27 = new Worm();
        addObject(worm27,57,458);
        Worm worm28 = new Worm();
        addObject(worm28,85,442);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,513,515);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,465,49);
        Lobster lobster4 = new Lobster();
        addObject(lobster4,155,89);
        Lobster lobster5 = new Lobster();
        addObject(lobster5,101,262);
        Lobster lobster6 = new Lobster();
        addObject(lobster6,135,475);
        Crab crab2 = new Crab();
        addObject(crab2,286,359);
        Crab crab3 = new Crab();
        addObject(crab3,208,144);
        Crab crab4 = new Crab();
        addObject(crab4,365,137);
        Crab crab5 = new Crab();
        addObject(crab5,520,227);
        Crab crab6 = new Crab();
        addObject(crab6,478,329);
        Crab crab7 = new Crab();
        addObject(crab7,330,335);
    }
}
