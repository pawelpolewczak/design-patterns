package composite;

class Skill extends ExperienceEntry {

    private final int rate;

    public Skill(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    void show() {
        System.out.println(getSpaces() + "Skill: " + this.name + " rated: " + this.rate);
    }

}
