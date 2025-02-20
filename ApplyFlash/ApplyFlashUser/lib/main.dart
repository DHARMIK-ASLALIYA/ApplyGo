import 'package:flutter/material.dart';
import 'package:get/get.dart';

import 'layouts/small/login_activity/login_screen.dart';

// Entry Point
main() => runApp(ApplyFlashUser());

class ApplyFlashUser extends StatelessWidget {
  const ApplyFlashUser({super.key});

  @override
  Widget build(BuildContext context) {
    return GetMaterialApp(
      title: 'ApplyFlashUser',
      debugShowCheckedModeBanner: false,
      home: AuthenticationScreenSmall(),
    );
  }
}
