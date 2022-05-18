package StructuralPatterns.Facade.Package;

public class UrlFacade {
    Level1 level1; Level2 level2;
    Level3 level3; Level4 level4;
    Level5 level5; Level6 level6;
    Level7 level7; Level8 level8;

    public UrlFacade(String URL) {
        level1 = new Level1(URL); level2 = new Level2(URL);
        level3 = new Level3(URL); level4 = new Level4(URL);
        level5 = new Level5(URL); level6 = new Level6(URL);
        level7 = new Level7(URL); level8 = new Level8(URL);
    }
}
