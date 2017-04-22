import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Phonebook {
    
    public void add(String name, String number){
       Person person = new Person(name, number);
       phoneBook.add(person);
    }
    
    private ArrayList<Person> phoneBook = new ArrayList<Person>();
    
    public void printAll(){
        for (Person person : phoneBook){
            System.out.println(person);
        
        }
    }
    public String searchNumber(String name){
        for (Person person: phoneBook){
            if (person.getName()== name){
                return person.getNumber();
            }
        }
        return "number not Known";
    }
    
}
