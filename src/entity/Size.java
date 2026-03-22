package entity;

public class Size {
    private String maSiz;
    private String tenSize;
    private Mon    mon;

    public Size() {}

    public String getMaSiz()           { return maSiz; }
    public void   setMaSiz(String v)   { this.maSiz = v; }
    public String getTenSize()         { return tenSize; }
    public void   setTenSize(String v) { this.tenSize = v; }
    public Mon    getMon()             { return mon; }
    public void   setMon(Mon v)        { this.mon = v; }

    @Override public String toString() { return tenSize; }
}
