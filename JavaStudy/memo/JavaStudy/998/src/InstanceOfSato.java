// ※パッケージはなくても結構です

public class InstanceOfSato {

    /** 変数（フィールド変数） */
    private int id = 0;
    /** static 変数（クラス変数） */
    private static int staticVarId = 0;

    /**
     * IDをインクリメント
     */
    public void incrementId() {
        this.id++;
        System.out.println("id: var          = " + this.id);
        InstanceOfSato.staticVarId++;
        System.out.println("id: static var   = " + InstanceOfSato.staticVarId);
    }

    private String firstName;

    public InstanceOfSato(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InstanceOfSato other = (InstanceOfSato) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        return true;
    }

}
