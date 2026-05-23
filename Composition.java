class College{
    private String name;
    private int estYear;
    private Department dept;
    public College(String name, int estYear, String deptName, String hod){
        this.name = name;
        this.estYear = estYear;
        dept = new Department(deptName, hod);
    }
    private class Department {
        private String deptName;
        private String hod;
        public Department(String deptName, String hod){
            this.deptName = deptName;
            this.hod = hod;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Department{");
            sb.append("deptName=").append(deptName);
            sb.append(", hod=").append(hod);
            sb.append('}');
            return sb.toString();
        }

    }
    @Override
    public String toString() {
        return "College [name=" + name + ", estYear=" + estYear + ", dept=" + dept + "]";
    }
    
}
public class Composition {
    public static void main(String[] args) {
        College clg = new College("IIT Delhi", 1987, "CSE", "Ajay");
        System.out.println(clg.toString());
    }
}
