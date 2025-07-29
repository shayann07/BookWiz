-if class com.example.bookfinder.data.model.VolumeInfo
-keepnames class com.example.bookfinder.data.model.VolumeInfo
-if class com.example.bookfinder.data.model.VolumeInfo
-keep class com.example.bookfinder.data.model.VolumeInfoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.bookfinder.data.model.VolumeInfo
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.bookfinder.data.model.VolumeInfo
-keepclassmembers class com.example.bookfinder.data.model.VolumeInfo {
    public synthetic <init>(java.lang.String,java.util.List,java.lang.String,com.example.bookfinder.data.model.ImageLinks,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
