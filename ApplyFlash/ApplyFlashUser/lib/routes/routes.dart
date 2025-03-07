import 'package:applyflashuser/layouts/dummy.dart';
import 'package:applyflashuser/view/login_view/login_screen_view.dart';
import 'package:applyflashuser/view/login_view/login_verification_view.dart';
import 'package:get/get.dart';

class Routes {
  static const String login = '/login';
  static const String loginVerification = '/verification';
  static const String dummy = '/dummy';
  static final routes = [
    GetPage(
        name: login,
        page: () => LoginScreenView(),
        transition: Transition.fadeIn),
    GetPage(
        name: loginVerification,
        page: () => LoginVerificationScreenView(
              email: Get.arguments['email'],
            ),
        transition: Transition.fadeIn),
    GetPage(name: dummy, page: () => Dummy(), transition: Transition.fadeIn),
  ];
}
