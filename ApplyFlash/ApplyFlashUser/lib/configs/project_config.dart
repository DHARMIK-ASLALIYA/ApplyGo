import 'package:applyflashuser/controllers/auth_controllers/auth_controller.dart';
import 'package:applyflashuser/controllers/dummy_controller.dart';
import 'package:applyflashuser/themes/theme_colors.dart';
import 'package:get/get.dart';
import '../controllers/theme_controllers/theme_controller.dart';
import '../themes/theme_fonts.dart';

// Theme Colors Global Instance
ThemeColors themeColors = ThemeColors();

// Theme Fonts Global Instance
ThemeFonts themeFonts = ThemeFonts();

// Theme Controller Global Instance
final ThemeController themeController = Get.put(ThemeController());

// Api Domain
const String apiDomain = 'http://127.0.0.1:5001';

// Page Controllers Objects
final AuthButtonLoader authButtonLoader = Get.put(AuthButtonLoader());
final DummyController dummyController = Get.put(DummyController());
final AuthVerifyButtonLoader authVerifyButtonLoader =
    Get.put(AuthVerifyButtonLoader());
