
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (dipinti)
 * @version (06/24/2021)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        if (g==chosenNum){
            return 0;
        }
        if(g>chosenNum){
        return 1;
        }
        return -1;

    }
}