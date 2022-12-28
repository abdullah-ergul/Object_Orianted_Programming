package BEng_2_1_KasimOzacar.week07_Examles.University_Example;


enum Branch {
    MATH(101, "IN THIS COURSE, YOU WILL LEARN GAMING FUNDEMANTALS"),
    PHYSICS(102, "this asd ...." ),
    CS (105, "very very important..."),
    CHEMISTRY(107, "this is not that important for cs students");

    private int code;
    private String description;
    
    private Branch(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}