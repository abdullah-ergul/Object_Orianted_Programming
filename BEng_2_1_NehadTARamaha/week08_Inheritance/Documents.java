package BEng_2_1_NehadTARamaha.week08_Inheritance;

import java.sql.Date;


class Document {
    private String[] authors;
    private Date date;
    
    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name) {
        int i;
        String newarr[] = new String[authors.length + 1];
   
       for (i = 0; i < authors.length; i++)
           newarr[i] = authors[i];
   
       newarr[authors.length] = name;
       authors= newarr;
    }

    public Date getDate() {
        return date;
    }
}

class Book extends Document{
    private String title;

    public String getTitle() {
        return title;
    }
}

class EMail extends Document{
    private String subject;
    private String[] to;

    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }
}

public class Documents {
    // ! MAIN SECTION
    public static void main(String[] args) {
        
    }
    // ! MAIN SECTION
}
