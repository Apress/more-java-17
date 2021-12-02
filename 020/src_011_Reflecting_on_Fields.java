interface IConstants {
    int DAYS_IN_WEEK = 7;
}
class A implements IConstants {
    private int aPrivate;
    public int aPublic;
    protected int aProtected;
}
class B extends A {
    private int bPrivate;
    public int bPublic;
    protected int bProtected;
}
