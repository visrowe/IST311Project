
package ist311project;

public abstract class Task {
    private String taskTitle;
    private String taskPriority;
    private String taskLocation;
    private String taskContact;
    private String taskDesc;
    private String taskDateTime;
    
    Task(String title, String priority, String location, String contact, String desc) {
        this.taskTitle = title;
        this.taskPriority = priority;
        this.taskLocation = location;
        this.taskContact = contact;
        this.taskDesc = desc;
    }
    
    public void printTask() {} //ABSTRACT METHOD?
    
    public String getTitle() {
        return this.taskTitle;
    }
    public String getPriority() {
        return this.taskPriority;
    }
    public String getLocation() {
        return this.taskLocation;
    }
    public String getContact() {
        return this.taskContact;
    }
    public String getDesc() {
        return this.taskDesc;
    }
    public String getDateTime() {
        return this.taskDateTime;
    }
}