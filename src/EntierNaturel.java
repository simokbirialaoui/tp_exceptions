public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) {
        try {
            if (val < 0) throw new NombreNegatifException("le nombre est negative", val);
            this.val = val;
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
        }

    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        try {
            if (val < 0) throw new NombreNegatifException("le nombre est negative", val);
            this.val = val;
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
        }


    }

    public void decrementer() throws NombreNegatifException {
        if (val - 1 < 0) throw new NombreNegatifException("le nombre est negative", val - 1);
        val -= 1;
    }

}
