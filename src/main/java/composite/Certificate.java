package composite;

class Certificate extends ExperienceEntry {

    private final boolean isAchieved;

    public Certificate(String name, boolean isAchieved) {
        this.name = name;
        this.isAchieved = isAchieved;
    }

    @Override
    void show() {
        System.out.println(getSpaces() + "Certificate: " + this.name + " is achieved: " + this.isAchieved);
    }
}
