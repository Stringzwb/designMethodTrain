package singlationMethod;
//因为没有加锁，所以不是安全的方案
//public class LazySinglation {
//    private static final LazySinglation lazySinglation;
//    private static final LazySinglation lazy=null;
//    static {
//        lazySinglation = new LazySinglation();
//    }
//
//    public static LazySinglation getLazySinglation() {
//        if(lazySinglation == null){
//            return lazySinglation;
//        }
//        return lazy;
//    }
//}

//单锁
//public class LazySinglation {
//    private static final LazySinglation lazySinglation;
//    private static final LazySinglation lazy=null;
//    static {
//        lazySinglation = new LazySinglation();
//    }
//
//    public synchronized static LazySinglation getLazySinglation() {
//        if(lazySinglation == null){
//            return lazySinglation;
//        }
//        return lazy;
//    }
//}
//双重检查锁
public class LazySinglation {
    private static final LazySinglation lazySinglation;
    private static final LazySinglation lazy=null;
    static {
        lazySinglation = new LazySinglation();
    }
    public synchronized static LazySinglation getLazySinglation() {
        if(lazySinglation == null){
            synchronized (LazySinglation.class){
                if(lazySinglation==null){
                    return lazySinglation;
                }
            }
        }
        return lazy;
    }
}