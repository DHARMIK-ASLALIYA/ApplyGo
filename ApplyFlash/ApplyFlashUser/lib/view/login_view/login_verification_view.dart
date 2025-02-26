import 'package:flutter/material.dart';
import 'package:applyflashuser/layouts/login_activity/large/login_verification_screen.dart';
import 'package:applyflashuser/layouts/login_activity/small/login_verification_screen.dart';

class LoginVerificationScreenView extends StatelessWidget {
  final String email;

  const LoginVerificationScreenView({super.key, required this.email});

  @override
  Widget build(BuildContext context) {
    return MediaQuery.sizeOf(context).width >= 1280 &&
            MediaQuery.sizeOf(context).height >= 700
        ? LoginVerificationScreenLarge(
            email: email,
          )
        : LoginVerificationScreenSmall();
  }
}
