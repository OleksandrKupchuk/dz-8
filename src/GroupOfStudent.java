import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupOfStudent {
    private Student groupLeader;
    private List<Student> students= new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    private HashMap<Student, List<String>> tasksCompletedByStudent = new HashMap<>();

    public GroupOfStudent(Student groupLeader){
        this.groupLeader = groupLeader;
        addStudent(groupLeader);
    }

    private void changeGroupLeader(Student student){
        this.groupLeader = student;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void renameStudent(Student student, Student newStudent){
        students.set(students.indexOf(student), newStudent);
    }

    public void addTask(String taskName){
        tasks.add(taskName);
    }

    public void setCompletedTaskForStudent(Student student, String taskName){
        List<String> tasks = new ArrayList();
        if (!tasksCompletedByStudent.containsKey(student)){
            tasks.add(taskName);
            tasksCompletedByStudent.put(student, tasks);
            return;
        }

        tasks = tasksCompletedByStudent.get(student);
        if (!tasks.contains(taskName)){
            tasks.add(taskName);
            tasksCompletedByStudent.put(student, tasks);
            return;
        }
        System.out.println(String.format("The student '%s' has already completed the task '%s'", student.getName(), taskName));
    }
}