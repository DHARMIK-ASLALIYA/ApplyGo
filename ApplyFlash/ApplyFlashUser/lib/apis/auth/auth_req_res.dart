import 'package:applyflashuser/routes/routes.dart';
import 'package:applyflashuser/widgets/custom_toast.dart';
import 'package:get/get.dart';
import '../../configs/project_config.dart';
import '../http_req_res_template.dart';

Future<void> sendOTP(String email) async {
  final url = '$apiDomain/auth/v1/send';
  HttpRequestGeneralTemplate(
    url: url,
    body: {'email': email, 'oneTimePassword': '123456'},
    successCode: 201,
    onStart: () {
      authButtonLoader.setLoading(true);
    },
    onSuccess: () {
      Get.toNamed(Routes.loginVerification, arguments: {'email': email});
    },
    onFinally: () {
      authButtonLoader.setLoading(false);
    },
  ).post();
}

Future<void> verifyOTP(String email, String otp) async {
  final url = '$apiDomain/auth/v1/verify';
  HttpRequestGeneralTemplate(
    url: url,
    body: {'email': email, 'oneTimePassword': otp},
    successCode: 200,
    onStart: () {
      authVerifyButtonLoader.setLoading(true);
    },
    onSuccess: () {
      Get.toNamed(Routes.dummy);
      showCustomToast('Welcome to ApplyGo !!');
    },
    onFinally: () {
      authVerifyButtonLoader.setLoading(false);
    },
  ).post();
}
