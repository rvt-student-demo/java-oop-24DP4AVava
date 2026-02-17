package rvt;
import java.util.ArrayList;

public class ToDoList {
 
    private ArrayList<String> list;
 
    public ToDoList() {
        this.list = new ArrayList<>();
    }
 
    public void add(String task) {
        this.list.add(task);
    }
 
    public void print() {
        for (String job : list) {
            System.out.println((this.list.indexOf(job) + 1) + ": " + job);
        }
    }
 
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
 
// You always go to the parties,
// To pluck the feathers off all the birds,
// On your knees,
// I would not beg you please,
// I want your picture but not your words,
// You know they'd  want it,
// But there's no first,
// On your own,
// You cannot call it your home,

// We always rub our hands too much,
// We know the reasons,but such and such,
// On your own,
// You cannot call me your own,
// Jack of all the trades,
// Master of none,
// Cry all the time,
// 'Cause I'm not having fun,
// you always want to be forgiven,
// The devil does what you ask of him,
// On your knees,
// You cannot,you are not for free.

//  Master of None - Beach House