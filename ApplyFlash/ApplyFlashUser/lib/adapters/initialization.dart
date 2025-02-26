import 'package:applyflashuser/routes/routes.dart';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import '../configs/project_config.dart';

class ApplyFlashUser extends StatelessWidget {
  const ApplyFlashUser({super.key});

  @override
  Widget build(BuildContext context) {
    return GetMaterialApp(
      title: 'ApplyFlashUser',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(scaffoldBackgroundColor: themeColors.primaryBackground),
      initialRoute: Routes.login,
      getPages: Routes.routes,
    );
  }
}
