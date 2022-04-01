class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubId(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }

    public void setMaxMarks(int mm){
        maxMarks = mm;
    }
    public void setMaxMarks(int mo){
        marksObtain = mo;
    }
    public void isQualified(){
        return (marksObtain >= maxMarks /10*4);
    }
    public String toString(){
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }
}

// class Student{
//     private String RollNo;
//     private String Name;
//     private String Dept;
//     private String Subject;

//     public String getRollNo
// }
class ArrayOfObject{
    public static void main(String args[]){
        //Creating an array of object
        Subject subs[] = new Subject[3];
        
        // Creating an object of each element of array
        subs[0] = new Subject("s101","DS",100);
        subs[1] = new Subject("s102","CA",100);
        subs[2] = new Subject("s103","Operating System",100);

        for (Subject s: subs)
            System.out.println(s);
    }
}