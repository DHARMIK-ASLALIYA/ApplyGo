import 'package:flutter/material.dart';
import '../configs/project_config.dart';

class ThemeColors {
  Color get primary => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xFF041F5F)
      : const Color(0xFF104FCD);

  Color get secondary => const Color(0xFF06326D);

  Color get tertiary => const Color(0xFF3CC1AD);

  Color get alternate => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xFF1C262D)
      : const Color(0xFFEFEFF2);

  Color get accent => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xFF1C262D)
      : const Color(0xFFEFEFF2);

  Color get accent1 => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xA4354F8C)
      : const Color(0xFF4378DF);

  Color get accent2 => Colors.white;

  Color get accent3 => Colors.white;

  Color get accent4 => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xFF425370)
      : const Color(0xFF97ABCA);

  Color get primaryText => themeController.themeMode.value == ThemeMode.dark
      ? Colors.white
      : Colors.black;

  Color get secondaryText => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xFF77949E)
      : const Color(0xFF57636C);

  Color get primaryBackground =>
      themeController.themeMode.value == ThemeMode.dark
          ? const Color(0xFF080B0E)
          : const Color(0xFFF9F9FA);

  Color get secondaryBackground =>
      themeController.themeMode.value == ThemeMode.dark
          ? const Color(0xFF10151B)
          : Colors.white;

  Color get success => themeController.themeMode.value == ThemeMode.dark
      ? const Color(0xFF7794AB)
      : const Color(0xFFB6BBC4);

  Color get error => const Color(0xFFD1334C);

  Color get warning => Colors.white;

  Color get info => Colors.white;
}
