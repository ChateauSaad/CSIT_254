//stb package proglab01classsummer2018;

/**
 * driver used to test Song class for Programming Lab 1, CISY 254 Data Structures
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class ProgLab01TestSong
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //declare/initialize variables

        //for debugging to display output
        boolean verbose = true;

        // initialize as 0 meaning ok
        int passFailValue = 0;

        // initial values
        String initialSongName = "Life goes on";
        String initialArtist = "The beetles";
        int initialLengthInSeconds = 18;

        // updated values
        String updatedSongName = "Ob-La-Di, Ob-La-Da";
        String updatedArtist = "The Beetles";
        int updatedLengthInSeconds = 165;

        //instantiate mySong object as instance of Song class
        Song mySong = new Song(initialSongName,initialArtist,initialLengthInSeconds);

        if (verbose)
            System.out.println("verbose mode\n");
        if (verbose) // if debgugging, print using getters
        {
            System.out.println("Initially:\n\nSong: " + mySong.getSongTitle());
            System.out.println("Artist: " + mySong.getArtist());
            System.out.println("Length(seconds): " + mySong.getLengthInSeconds());
        }

        // test 1
        if (verbose)
            System.out.print("\nInstantiation/Getters = ");
        if (initialSongName.equals(mySong.getSongTitle()) &&
            initialArtist.equals(mySong.getArtist()) &&
            initialLengthInSeconds == mySong.getLengthInSeconds())
        {
            if (verbose)
                System.out.println("pass");
        }
        else
        {
            passFailValue += 1;
            if (verbose)
                System.out.println("fail");
        }

        // update object
        mySong.setSongTitle(updatedSongName);
        mySong.setArtist(updatedArtist);
        mySong.setLengthInSeconds(updatedLengthInSeconds);

        if (verbose)// if debgugging, print using getters
        {
            System.out.println("\nAfter update:\n\nSong: " + mySong.getSongTitle());
            System.out.println("Artist: " + mySong.getArtist());
            System.out.println("Length(seconds): " + mySong.getLengthInSeconds());
        }

        // test 2
        if (verbose)
            System.out.print("\nSetters/Getters = ");
        if (updatedSongName.equals(mySong.getSongTitle()) &&
            updatedArtist.equals(mySong.getArtist()) &&
            updatedLengthInSeconds == mySong.getLengthInSeconds())
        {
            if (verbose)
                System.out.println("pass\n");
        }
        else
        {
            passFailValue += 1;
            if (verbose)
                System.out.println("fail\n");
        }


        if (passFailValue == 0)
            System.out.println("Song class - all tests: pass");
        else
            System.out.println("Song class - tests: fail");
        System.exit(passFailValue);
    }

}
/*
Sample Run(verbose):

verbose mode

Initially:

Song: Life goes on
Artist: The beetles
Length(seconds): 18

Instantiation/Getters = pass

After update:

Song: Ob-La-Di, Ob-La-Da
Artist: The Beetles
Length(seconds): 165

Setters/Getters = pass

Song class - all tests: pass

*/
