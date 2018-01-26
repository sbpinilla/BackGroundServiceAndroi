 if (Build.VERSION.SDK_INT >= 23) {


   Log.d("Prueba ","Prueba Build.VERSION.SDK_INT >= 23 ");

    Intent intent = new Intent();
    String packageName = context.getPackageName();
    PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
   
    if (pm.isIgnoringBatteryOptimizations(packageName))
        intent.setAction(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS);
    else {
        intent.setAction(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
        intent.setData(Uri.parse("package:" + packageName));
        }
        
        context.startActivity(intent);

}