public class Main {
    public static void main(String[] args) {
        EngineerRegistrationForm studentRegistrationForm = new EngineerRegistrationForm();
        studentRegistrationForm.setVisible(true);
    }

    private static void SaveLoad() {
        try{
            //SaveLoadManager.save(engineer);
            Engineer loaded = SaveLoadManager.load();
            System.out.println(loaded);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}