package com.heaven7.java.data.mediator.compiler;

/**
 * Created by heaven7 on 2017/9/13 0013.
 */
public final class DataMediatorConstants {

    public static final String DOC = "<p>This class is generated by Data-mediator framework. DON'T EDIT IT!!!</p>\n @author heaven7";

    public static final FieldData FD_SELECTABLE ;

    static {
        FD_SELECTABLE = new FieldData();
        FD_SELECTABLE.setPropertyName("selected");
        FD_SELECTABLE.setTypeCompat(new FieldData.TypeCompat(null, null){
            @Override
            public String toString() {
                return NAME_boolean;
            }
        });
        FD_SELECTABLE.setComplexType(0);
    }

    // some cs of MediatorSharedProperties
    public static final String SIMPLE_NAME_PROPERTY          = "Property";
    public static final String PKG_PROP                      = "com.heaven7.java.data.mediator";
    public static final String PKG_UTIL                      = "com.heaven7.java.data.mediator.util";
    //public static final String PKG_SHARED_PROP               = "com.heaven7.java.data.mediator.internal";
    public static final String PKG_JAVA_BASE_UTIL            = "com.heaven7.java.base.util";
    public static final String PKG_DM_INTERNAL               = "com.heaven7.java.data.mediator.internal";
    public static final String PKG_GSON_SUPPORT              = "com.heaven7.java.data.mediator.support.gson";
    public static final String PKG_DATA_BINDING_ANNO         = "com.heaven7.java.data.mediator.bind";

    //public static final String PKG_GSON                      = "com.google.gson";
    public static final String PKG_GSON_ANNO                 = "com.google.gson.annotations";
    //simple name of JsonAdapter
    public static final String SN_GSON_JSON_ADAPTER          = "JsonAdapter";
    public static final String SN_GSON_SINCE                 = "Since";
    public static final String SN_GSON_UTIL                  = "Until";
    public static final String SN_BASE_TYPE_ADAPTER          = "BaseTypeAdapter";
    public static final String SN_GSON_PROPERTY              = "GsonProperty";
    public static final String SN_TYPE_HANDLER               = "TypeHandler";
    public static final String SN_STATIC_LOADER              = "$StaticLoader";

    public static final String SIMPLE_NAME_THROWABLES        = "Throwables";
    public static final String SIMPLE_NAME_ObJECTS           = "Objects";
    public static final String SIMPLE_NAME_SPARSE_ARRAY      = "SparseArray";

    public static final String SIMPLE_NAME_SHARED_PROP       = "SharedProperties";
    public static final String SIMPLE_NAME_BASE_MEDIATOR     = "BaseMediator";
    public static final String SIMPLE_NAME_LIST_PROP_EDITOR  = "ListPropertyEditor";
    public static final String SIMPLE_NAME_PROP_INTERCEPTOR  = "PropertyInterceptor";
    public static final String SIMPLE_NAME_DATA_POOL         = "DataPools";
    public static final String SIMPLE_NAME_POOLABLE          = "Poolable";
    public static final String SN_GLOBAL_SETTING             = "GlobalSetting";
    public static final String SN_DATA_BINDING               = "DataBinding";
    public static final String SIMPLE_NAME_GPS               = "Gps";
    public static final String SN_EXPRESSION_CONTEXT         = "ExpreContext";
    public static final String SN_SIMPLE_EXPRESSION_CONTEXT  = "SimpleExpreContext";
    public static final String SN_EXPRESSION_EVALUATOR       = "ExpreEvaluator";
    public static final String SN_FGS                        = "Fgs";
    public static final String SN_FAMILY_MANAGER             = "FamilyManager";

    public static final String SIMPLE_NAME_DM_DELEGATE       = "DataMediatorDelegate";
    public static final String SIMPLE_NAME_PARCEL_DELEGATE   = "ParcelDelegate";
    public static final String SIMPLE_NAME_SPARSE_ARRAY_EDITOR = "SparseArrayPropertyEditor";

    public static final String PREFIX_PROP                   = "PROP_";

    //field name of anno
    public static final String STR_PROP_NAME = "propName";
    public static final String STR_SERIA_NAME = "seriaName";
    public static final String STR_FLAGS = "flags";
    public static final String STR_TYPE = "type";
    public static final String STR_COMPLEXT_TYPE = "complexType";
    public static final String STR_SINCE = "since";
    public static final String STR_UNTIL = "until";

    public static final String NAME_PARCELABLE = "android.os.Parcelable";
    public static final String NAME_COPYA = "com.heaven7.java.data.mediator.ICopyable";
    public static final String NAME_RESET = "com.heaven7.java.data.mediator.IResetable";
    public static final String NAME_SHARE = "com.heaven7.java.data.mediator.IShareable";
    public static final String NAME_SNAP  = "com.heaven7.java.data.mediator.ISnapable";
    public static final String NAME_SERIALIZABLE = "java.io.Serializable";
    public static final String NAME_SELECTABLE   = "com.heaven7.adapter.ISelectable";

   // public static final String INTERFACE_SUFFIX = "Module";
    public static final String IMPL_SUFFIX      = "_$Impl";
    public static final String PROXY_SUFFIX     = "_$Proxy";
    public static final String TYPE_ADAPTER_PREFIX  = "$";
    public static final String DATA_BINDING_SUFFIX  = "_$DataBinding";
    public static final String GROUP_PROPERTY_SUFFIX   = "_$GPS";
    public static final String FAMILY_PROPERTY_SUFFIX  = "_$FGS";
    public static final String EXPRE_CONTEXT_SUFFIX    = "_$ExpreContext";

    public static final String SET_PREFIX   = "set";
    public static final String GET_PREFIX   = "get";
    public static final String IS_PREFIX    = "is";

    public static final String BEGIN_PREFIX   = "begin";
    public static final String EDITOR_SUFFIX  = "Editor";

    public static final String NAME_int      = "int";
    public static final String NAME_long     = "long";
    public static final String NAME_short    = "short";
    public static final String NAME_byte     = "byte";
    public static final String NAME_boolean  = "boolean";
    public static final String NAME_float    = "float";
    public static final String NAME_double   = "double";
    public static final String NAME_char     = "char";
    public static final String NAME_void     = "void";

    public static final String NAME_INTEGER    = "java.lang.Integer";
    public static final String NAME_LONG       = "java.lang.Long";
    public static final String NAME_SHORT      = "java.lang.Short";
    public static final String NAME_BYTE       = "java.lang.Byte";
    public static final String NAME_BOOLEAN    = "java.lang.Boolean";
    public static final String NAME_FLOAT      = "java.lang.Float";
    public static final String NAME_DOUBLE     = "java.lang.Double";
    public static final String NAME_CHARACTER  =  "java.lang.Character";

    public static final String NAME_STRING =  "java.lang.String";
    // private static final String NAME_SPARSE_ARRAY =  "android.util.SparseArray";
}
