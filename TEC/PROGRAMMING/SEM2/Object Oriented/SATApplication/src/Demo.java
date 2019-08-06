public class Demo {
    public static void main(String[] args) {
        MoralPerson mp = new MoralPerson();
        mp.setBirthdate("29/11/2012");
        mp.setCompanyName("Instituto Tecnologico Estudios Superiores Monterrey");
        PhysicalPerson pp = new PhysicalPerson();
        pp.setCityCode("DF");
        pp.setGender("M");
        pp.setMaternalLastName("VARGAS");
        pp.setName("GOODRA");
        pp.setPaternalLastName("LERR");
        pp.setYear("1999");
        pp.setMonth("12");
        pp.setDay("1");
        System.out.println(mp.calculateRFC());
        System.out.println(pp.calculateRFC());
        System.out.println(pp.calculateCURP());
    }
}
