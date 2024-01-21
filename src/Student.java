class Student extends Person {
    private double gpa;
    private static final double STIPEND_AMOUNT = 42189.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND_AMOUNT : 0.0;
    }

    @Override
    public String toString() {
        return String.format("%s earns %.2f tenge", super.toString(), getPaymentAmount());
    }
}
