import 'package:flutter/material.dart';
import '../../layouts/login_activity/large/login_screen.dart';
import '../../layouts/login_activity/small/login_screen.dart';

class LoginScreenView extends StatelessWidget {
  const LoginScreenView({super.key});

  @override
  Widget build(BuildContext context) {
    return MediaQuery.sizeOf(context).width >= 1280 &&
            MediaQuery.sizeOf(context).height >= 700
        ? LoginScreenLarge()
        : LoginScreenSmall();
  }
}
