package Task4.Q2_Voter;

class Voter {
    private final int voterId;
    private final String name;
    private final int age;

    public Voter(int voterId, String name, int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Voter{" +"voterId=" + voterId +", name='" + name + '\'' +", age=" + age +'}';
    }
}