import java.util.Random;

public class PhysicalPerson extends Person implements IKey {
    private String name, paternalLastName, maternalLastName, cityCode, gender;

    public String calculateRFC() {
        String rfc = "";
        rfc += paternalLastName.substring(0, 2);
        rfc += maternalLastName.charAt(0);
        rfc += name.charAt(0);
        rfc += year.substring(2);
        rfc += month;
        rfc += day;
        return rfc;
    }

    public String calculateCURP() {
        String curp = "";
        curp += calculateRFC();
        curp += getGender();
        curp += getCityCode();

        int conscount = 0;
        for (int i = 0; i < paternalLastName.length(); i++) {
            if (paternalLastName.toLowerCase().charAt(i) != 'a' &&
                    paternalLastName.toLowerCase().charAt(i) != 'i' &&
                    paternalLastName.toLowerCase().charAt(i) != 'u' &&
                    paternalLastName.toLowerCase().charAt(i) != 'e' &&
                    paternalLastName.toLowerCase().charAt(i) != 'o') {
                if (conscount == 0) {
                    conscount++;
                }
                if (conscount > 0) {
                    curp += String.valueOf(paternalLastName.toUpperCase().charAt(i));
                    break;
                }
            }
        }

        conscount = 0;
        for (int i = 0; i < maternalLastName.length(); i++) {
            if (maternalLastName.toLowerCase().charAt(i) != 'a' &&
                    maternalLastName.toLowerCase().charAt(i) != 'i' &&
                    maternalLastName.toLowerCase().charAt(i) != 'u' &&
                    maternalLastName.toLowerCase().charAt(i) != 'e' &&
                    maternalLastName.toLowerCase().charAt(i) != 'o') {
                if (conscount == 0) {
                    conscount++;
                }
                if (conscount == 1) {
                    curp += String.valueOf(paternalLastName.toUpperCase().charAt(i));
                    conscount++;
                }
                if (conscount == 2) {
                    curp += String.valueOf(paternalLastName.toUpperCase().charAt(i));
                    break;
                }
            }
        }
        Random rng = new Random();
        curp+= (rng.nextInt(89)+10);
        return curp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaternalLastName() {
        return paternalLastName;
    }

    public void setPaternalLastName(String paternalLastName) {
        this.paternalLastName = paternalLastName;
    }

    public String getMaternalLastName() {
        return maternalLastName;
    }

    public void setMaternalLastName(String maternalLastName) {
        this.maternalLastName = maternalLastName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
