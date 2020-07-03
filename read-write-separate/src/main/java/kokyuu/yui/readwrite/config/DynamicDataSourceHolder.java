package kokyuu.yui.readwrite.config;

import kokyuu.yui.readwrite.constants.DynamicDataSourceGlobal;

public final class DynamicDataSourceHolder {
    private static final ThreadLocal<DynamicDataSourceGlobal> holder = new ThreadLocal<>();
    private  DynamicDataSourceHolder(){

    }
    public static void putDataSource(DynamicDataSourceGlobal dynamicDataSourceGlobal){
        holder.set(dynamicDataSourceGlobal);
    }

    public static DynamicDataSourceGlobal getDataSource(){
        return holder.get();
    }

    public static void clearDataSource(){
        holder.remove();
    }
}
