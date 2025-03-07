import 'package:flutter/material.dart';
import 'package:get/get.dart';

class ThemeController extends GetxController with WidgetsBindingObserver {
  Rx<ThemeMode> themeMode = ThemeMode.system.obs;

  @override
  void onInit() {
    super.onInit();
    WidgetsBinding.instance.addObserver(this);
    updateThemeMode();
  }

  void updateThemeMode() {
    final Brightness brightness =
        WidgetsBinding.instance.platformDispatcher.platformBrightness;
    themeMode.value =
        brightness == Brightness.dark ? ThemeMode.dark : ThemeMode.light;
  }

  @override
  void didChangePlatformBrightness() {
    updateThemeMode();
  }

  @override
  void onClose() {
    WidgetsBinding.instance.removeObserver(this);
    super.onClose();
  }
}
