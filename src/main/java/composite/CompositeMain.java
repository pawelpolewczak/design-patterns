package composite;

public class CompositeMain {

    public static void main(String[] args) {
        ExperienceEntry rootFolder = new Category("Root folder");
        ExperienceEntry certificates = new Category("Certificates");
        ExperienceEntry otherCerts = new Category("Other certificates");
        ExperienceEntry skills = new Category("Skills");

        ExperienceEntry javaSkill = new Skill("Java", 5);
        ExperienceEntry javaCert = new Certificate("Oracle Java Cert", true);
        ExperienceEntry scrumCert = new Certificate("Scrum certificate", false);

        rootFolder.addChild(certificates);
        rootFolder.addChild(skills);

        certificates.addChild(javaCert);
        certificates.addChild(otherCerts);

        otherCerts.addChild(scrumCert);

        skills.addChild(javaSkill);

        rootFolder.show();

        System.out.println("---------------------------------------------");

        certificates.removeChild(otherCerts);
        rootFolder.show();

    }
}
