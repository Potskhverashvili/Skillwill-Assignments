package model;

public class BasicTask extends Task {
    public BasicTask(String userName, String taskName, String description) {
        super(userName, taskName, description);
    }


    @Override
    public String toString() {
        return "\nUser Name: " + userName +
                "\ntasks.Task Name:  " + taskName +
                "\nDescription :  " + description;
    }
}
