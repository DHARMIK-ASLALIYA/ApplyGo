import 'package:applyflashuser/configs/project_config.dart';
import 'package:flutter/material.dart';
import 'package:get/get.dart';

void showCustomToast(String message) {
  Get.snackbar(
    "ApplyGo", // No title
    message,
    snackPosition: SnackPosition.BOTTOM,
    backgroundColor: themeColors.accent4,
    colorText: themeColors.info,
    borderRadius: 8,
    titleText: SizedBox(
      width: 0,
      height: 0,
    ),
    messageText: Text(message, style: themeFonts.labelMedium),
    margin: EdgeInsets.all(10),
    duration: Duration(seconds: 3),
    isDismissible: true,
    forwardAnimationCurve: Curves.easeInOut,
    maxWidth: 290,
  );
}
