public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addVerbal(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sözlü = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sözlü = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sözlü = kimya;
        }

    }
    public void addWritten(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.written = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.written = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.written = kimya;
        }

    }
    
    
//    public void addBulkExamNote(int mat, int fizik, int kimya) {
//
//        if (mat >= 0 && mat <= 100) {
//            this.mat.note = mat;
//        }
//
//        if (fizik >= 0 && fizik <= 100) {
//            this.fizik.note = fizik;
//        }
//
//        if (kimya >= 0 && kimya <= 100) {
//            this.kimya.note = kimya;
//        }
//
//    }

    public void isPass() {
        if (this.mat.written == 0 || this.fizik.written == 0 || this.kimya.written == 0 ||this.mat.sözlü == 0 || this.fizik.sözlü == 0 || this.kimya.sözlü == 0 ) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
    	this.fizik.note = (int) ((this.fizik.written*0.80)+(this.fizik.sözlü*this.fizik.verbalFizik));
    	this.kimya.note = (int) ((this.kimya.written*0.85)+(this.kimya.sözlü*this.kimya.verbalKimya));
    	this.mat.note = (int) ((this.mat.written*0.90)+(this.mat.sözlü*this.mat.verbalMat));
        this.avarage = ( this.fizik.note +this.kimya.written + this.mat.written) / 3;
    }
    
    

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}