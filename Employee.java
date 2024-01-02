/* Nama : Awalia Mutiara Hikmah
   Nim : 22166001
   Prodi : Sistem Informasi
   Semester : 3
   Matkul : PBO 1
*/

package employee;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " sedang melakukan tugas umum.");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sedang mengelola tim.");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sedang melakukan coding dan pengembangan perangkat lunak.");
    }
}

class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sedang mendesain elemen kreatif.");
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager manager = new Manager("Awalia");
        // Memanggil metode work() pada objek Manager
        manager.work();

        // Membuat objek Developer
        Developer developer = new Developer("Nurul Izzah");
        // Memanggil metode work() pada objek Developer
        developer.work();

        // Membuat objek Designer
        Designer designer = new Designer("Siky Afina");
        // Memanggil metode work() pada objek Designer
        designer.work();
    }
}
