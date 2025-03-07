import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import '../configs/project_config.dart';

class ThemeFonts {
  TextStyle get displayLarge => GoogleFonts.comfortaa(
        fontSize: 70,
        fontWeight: FontWeight.bold,
        color: themeColors.info,
      );

  TextStyle get displayMedium => GoogleFonts.comfortaa(
        fontSize: 60,
        fontWeight: FontWeight.bold,
        color: themeColors.info,
      );

  TextStyle get displaySmall => GoogleFonts.comfortaa(
        fontSize: 40,
        fontWeight: FontWeight.w600,
        color: themeColors.info,
      );

  TextStyle get headlineLarge => GoogleFonts.outfit(
        fontSize: 40,
        fontWeight: FontWeight.w500,
        color: themeColors.primaryText,
      );

  TextStyle get headlineMedium => GoogleFonts.outfit(
        fontSize: 28,
        fontWeight: FontWeight.w600,
        color: themeColors.primaryText,
      );

  TextStyle get headlineSmall => GoogleFonts.outfit(
        fontSize: 24,
        fontWeight: FontWeight.w600,
        color: themeColors.primaryText,
      );

  TextStyle get titleLarge => GoogleFonts.outfit(
        fontSize: 22,
        fontWeight: FontWeight.w500,
        color: themeColors.secondaryText,
      );

  TextStyle get titleMedium => GoogleFonts.roboto(
        fontSize: 18,
        fontWeight: FontWeight.w500,
        color: themeColors.secondaryText,
      );

  TextStyle get titleSmall => GoogleFonts.outfit(
        fontSize: 18,
        fontWeight: FontWeight.w600,
        color: themeColors.info,
      );

  TextStyle get labelLarge => GoogleFonts.outfit(
        fontSize: 16,
        fontWeight: FontWeight.w500,
        color: themeColors.secondaryText,
      );

  TextStyle get labelMedium => GoogleFonts.outfit(
        fontSize: 16,
        fontWeight: FontWeight.w400,
        color: themeColors.info,
      );

  TextStyle get labelSmall => GoogleFonts.outfit(
        fontSize: 14,
        fontWeight: FontWeight.w500,
        color: themeColors.secondaryText,
      );

  TextStyle get bodyLarge => GoogleFonts.outfit(
        fontSize: 22,
        fontWeight: FontWeight.w600,
        color: themeColors.info,
      );

  TextStyle get bodyMedium => GoogleFonts.outfit(
        fontSize: 22,
        fontWeight: FontWeight.w600,
        color: themeColors.primaryText,
      );

  TextStyle get bodySmall => GoogleFonts.outfit(
        fontSize: 18,
        fontWeight: FontWeight.w600,
        color: themeColors.primaryText,
      );
}
