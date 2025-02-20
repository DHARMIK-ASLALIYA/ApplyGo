import 'package:applyflashuser/themes/theme_colors.dart';
import 'package:get/get.dart';
import '../themes/theme_fonts.dart';

// Theme Colors Global Instance
ThemeColors themeColors = ThemeColors();

// Theme Fonts Global Instance
ThemeFonts themeFonts = ThemeFonts();

final themeController = Get.put(ThemeController());

class ThemeController extends GetxController {
  RxBool themeMode = Get.isPlatformDarkMode.obs;

  void changeThemeMode() {
    themeMode.value = !themeMode.value;
  }
}
