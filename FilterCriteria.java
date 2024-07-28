package Attest_java;

public class FilterCriteria {
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean matches(Notebook notebook) {
        if (ram != null && notebook.getRam() < ram) {
            return false;
        }
        if (hdd != null && notebook.getHdd() < hdd) {
            return false;
        }
        if (os != null && !notebook.getOs().equalsIgnoreCase(os)) {
            return false;
        }
        if (color != null && !notebook.getColor().equalsIgnoreCase(color)) {
            return false;
        }
        return true;
    }
}
