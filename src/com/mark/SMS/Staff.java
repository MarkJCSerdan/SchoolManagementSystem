package com.mark.SMS;

public class Staff extends Person{
    String assignment;
    String attendancePin;

    public Staff(String name, int age, String birthdate, float height, String gender, String assignment, String attendancePin){
        super(name, age, birthdate, height, gender);
        this.assignment = assignment;
        this.attendancePin = attendancePin;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getAttendancePin() {
        return attendancePin;
    }

    public void setAttendancePin(String attendancePin) {
        this.attendancePin = attendancePin;
    }
}
