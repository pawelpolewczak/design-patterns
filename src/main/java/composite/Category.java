package composite;

import java.util.ArrayList;
import java.util.List;

class Category extends ExperienceEntry {

    private final List<ExperienceEntry> childNodes = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    @Override
    void show() {
        System.out.println(getSpaces() + "Category: " + this.name + ", entries:");
        childNodes.forEach(ExperienceEntry::show);
    }

    @Override
    void addChild(ExperienceEntry child) {
        child.setParent(this);
        child.calculateLevel();
        childNodes.add(child);
    }

    @Override
    boolean removeChild(ExperienceEntry child) {
        if (!childNodes.contains(child)) {
            return false;
        }
        child.setParent(null);
        child.resetLevel();
        return childNodes.remove(child);
    }

}
