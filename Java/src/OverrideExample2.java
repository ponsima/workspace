public class OverrideExample2 {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();
        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "イギリス";
        a.printInfo();
    }
}
