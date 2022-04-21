import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> personList = new ArrayList<>();
    private String address;
    private int amountOfMenber;

    public Family(String name,int age, String job, int soCMND, String address, int menber) {
        personList.add(new Person(name,age,job,soCMND));
        this.address = address;
        this.amountOfMenber = menber;
    }

    public Family(String address, int menber) {
        this.address = address;
        this.amountOfMenber = menber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMenber() {
        return amountOfMenber;
    }

    public void setMenber(int menber) {
        this.amountOfMenber = menber;
    }

    public void add(Person person){
        personList.add(person);
        this.amountOfMenber++;
    }
    public void edid(int soCMND, Person person){
        if(findOfBySoCMND(soCMND)==-1){
            System.out.println("không có");
        }else{
            personList.set(findOfBySoCMND(soCMND),person);
        }
    }
    public void delete(int soCMND){
        if(findOfBySoCMND(soCMND)==-1){
            System.out.println("không có");
            this.amountOfMenber--;
        }else{
            personList.remove(findOfBySoCMND(soCMND));
        }
    }
    public int findOfBySoCMND(int soCMND){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getSoCMND() == soCMND){
                return i;
            }
        }
        return -1;
    }
    public void findOfByName(String name){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getName().equals(name)){
                System.out.println(personList.get(i));
            }
        }
    }
    public void printSmalllestAge(){
        int minAge=personList.get(0).getAge();
        int indexOfMin = -1;
        for (int i = 0; i < personList.size(); i++) {
            if(minAge> personList.get(i).getAge()){
                minAge = personList.get(i).getAge();
                indexOfMin = i;
            }
        }
        System.out.println(personList.get(indexOfMin));
    }
    public void display(){
        System.out.println("Địa chỉ : " + address +"Số thành viên : " + amountOfMenber);
        for (int i = 0; i <personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
}
