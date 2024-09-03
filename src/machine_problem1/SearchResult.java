/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package machine_problem1;

/**
 *
 * @author Jim Aerol
 */
public class SearchResult {
    boolean found;
    int position;

    public SearchResult(boolean found, int position) {
        this.found = found;
        this.position = position;
    }
    
    public boolean isFound() {
        return found;
    }

    public int getPosition() {
        return position;
    }
    
    
}
