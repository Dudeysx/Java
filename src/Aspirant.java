public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    public String getScientificWork() {
        return scientificWork;
    }

    @Override
    public int getScholarship() {
        return (getAverageMark() == 5) ? 10000 : 5500;
    }
}
