package composite;

abstract class ExperienceEntry {

    protected String name;
    private ExperienceEntry parent;
    private int level = 0;

    abstract void show();

    void addChild(ExperienceEntry child) {
        throw new UnsupportedOperationException("Operation not supported for this object");
    }

    boolean removeChild(ExperienceEntry child) {
        return false;
    }

    void calculateLevel() {
        if (this.parent == null) {
            this.level = 0;
            return;
        }

        if (this.parent.getLevel() != 0) {
            this.level = this.parent.getLevel() + 1;
        }

        ExperienceEntry currentNode = this.parent;
        int counter = 0;
        while (currentNode != null) {
            counter++;
            currentNode = currentNode.getParent();
        }
        this.level = counter;
    }

    void resetLevel() {
        this.level = 0;
    }

    ExperienceEntry getParent() {
        return parent;
    }

    void setParent(ExperienceEntry parent) {
        this.parent = parent;
    }

    String getName() {
        return name;
    }

    int getLevel() {
        return level;
    }

    protected String getFormat() {
        return this.getLevel() > 0 ? "\t%" + this.getLevel() + "s" : "\t%s";
    }

    protected String getSpaces() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.level; i++) {
            sb.append("-");
        }
        return sb.append("|").toString();
    }
}
