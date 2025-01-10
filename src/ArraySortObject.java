public class ArraySortObject {

    private String[] name;
    private int[] age;
    private String nameTemp;
    private int ageTemp;

    public void sortAgeAsend() {
        for (int i = 0; i < age.length - 1; i++) {
            for (int j = i + 1; j < age.length; j++) {
                if (age[i] > age[j]) {
                    ageTemp = age[i];
                    age[i] = age[j];
                    age[j] = ageTemp;

                }
            }
        }
    }

    public void sortAgeDecend() {
        for (int i = 0; i < age.length - 1; i++) {
            for (int j = i + 1; j < age.length; j++) {
                if (age[i] < age[j]) {
                    ageTemp = age[i];
                    age[i] = age[j];
                    age[j] = ageTemp;

                }
            }
        }
    }

    public void sortNameAsend() {
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].compareToIgnoreCase(name[j]) > 0) {
                    nameTemp = name[i];
                    name[i] = name[j];
                    name[j] = nameTemp;
                }
            }
        }
    }

    public void sortNameDecend() {
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].compareToIgnoreCase(name[j]) < 0) {
                    nameTemp = name[i];
                    name[i] = name[j];
                    name[j] = nameTemp;
                }
            }
        }
    }

}
