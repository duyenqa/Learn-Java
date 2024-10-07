interface AthleticSkills {
    void playSports();
}

interface AcademicSkills {
    void study();
}

class Student implements AthleticSkills, AcademicSkills {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void playSports() {
        System.out.println(name + " is playing sports.");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.playSports(); // Output: Bob is playing sports.
        student.study(); // Output: Bob is studying.
    }
}
