import 'package:applyflashuser/apis/auth/auth_req_res.dart';
import 'package:applyflashuser/configs/project_config.dart';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:lottie/lottie.dart';
import '../../../../widgets/button_widget.dart';

class LoginVerificationScreenLarge extends StatelessWidget {
  final String email;

  const LoginVerificationScreenLarge({super.key, required this.email});

  @override
  Widget build(BuildContext context) {
    final TextEditingController otpController = TextEditingController();
    return Obx(
      () => Scaffold(
        backgroundColor: themeColors.secondaryBackground,
        body: Row(
          mainAxisSize: MainAxisSize.max,
          children: [
            Container(
              width: MediaQuery.sizeOf(context).width * 0.5,
              height: MediaQuery.sizeOf(context).height,
              decoration: BoxDecoration(
                color: themeColors.secondaryBackground,
              ),
              child: Padding(
                padding: EdgeInsets.all(50),
                child: Lottie.asset(
                  'assets/jsons/verify.json',
                  width: 200,
                  height: 200,
                  fit: BoxFit.contain,
                  animate: true,
                ),
              ),
            ),
            Container(
              width: MediaQuery.sizeOf(context).width * 0.5,
              height: MediaQuery.sizeOf(context).height,
              decoration: BoxDecoration(
                color: themeColors.secondaryBackground,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.max,
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: [
                  Padding(
                    padding: EdgeInsets.all(50),
                    child: Container(
                      width: MediaQuery.sizeOf(context).width * 0.4,
                      decoration: BoxDecoration(
                        color: themeColors.secondaryBackground,
                        borderRadius: BorderRadius.circular(30),
                      ),
                      child: Column(
                        mainAxisSize: MainAxisSize.max,
                        children: [
                          Padding(
                            padding:
                                EdgeInsetsDirectional.fromSTEB(0, 45, 0, 10),
                            child: Text(
                              'Verification Code',
                              style: themeFonts.headlineLarge,
                            ),
                          ),
                          Padding(
                            padding:
                                EdgeInsetsDirectional.fromSTEB(0, 0, 0, 20),
                            child: Text(
                              'We have sent the verification code to \nyour email address.',
                              textAlign: TextAlign.center,
                              style: themeFonts.labelSmall,
                            ),
                          ),
                          Padding(
                            padding: EdgeInsets.all(15),
                            child: Container(
                              decoration: BoxDecoration(
                                borderRadius: BorderRadius.circular(10),
                              ),
                              child: Padding(
                                padding: EdgeInsets.all(7),
                                child: SizedBox(
                                  width: double.infinity,
                                  child: TextFormField(
                                    autofocus: false,
                                    controller: otpController,
                                    obscureText: false,
                                    decoration: InputDecoration(
                                      isDense: true,
                                      labelStyle: themeFonts.titleLarge,
                                      alignLabelWithHint: false,
                                      hintText: 'Enter OTP',
                                      hintStyle: themeFonts.labelLarge,
                                      enabledBorder: OutlineInputBorder(
                                        borderSide: BorderSide(
                                          color: themeColors.secondaryText,
                                          width: 1.0,
                                        ),
                                        borderRadius: BorderRadius.circular(5),
                                      ),
                                      focusedBorder: OutlineInputBorder(
                                        borderSide: BorderSide(
                                          color: themeColors.tertiary,
                                          width: 1.0,
                                        ),
                                        borderRadius: BorderRadius.circular(5),
                                      ),
                                      errorBorder: OutlineInputBorder(
                                        borderSide: BorderSide(
                                          color: themeColors.error,
                                          width: 1.0,
                                        ),
                                        borderRadius: BorderRadius.circular(5),
                                      ),
                                      focusedErrorBorder: OutlineInputBorder(
                                        borderSide: BorderSide(
                                          color: themeColors.error,
                                          width: 1.0,
                                        ),
                                        borderRadius: BorderRadius.circular(5),
                                      ),
                                    ),
                                    style: themeFonts.titleLarge.apply(
                                      color: themeColors.primaryText,
                                    ),
                                    maxLength: 6,
                                    buildCounter: (context,
                                            {required currentLength,
                                            required isFocused,
                                            maxLength}) =>
                                        null,
                                    keyboardType: TextInputType.number,
                                    cursorColor: themeColors.primaryText,
                                  ),
                                ),
                              ),
                            ),
                          ),
                          Padding(
                            padding:
                                EdgeInsetsDirectional.fromSTEB(15, 15, 15, 40),
                            child: Container(
                              width: double.infinity,
                              height: 60,
                              decoration: BoxDecoration(
                                borderRadius: BorderRadius.circular(0),
                              ),
                              child: Padding(
                                padding:
                                    EdgeInsetsDirectional.fromSTEB(7, 0, 7, 0),
                                child: FFButtonWidget(
                                  onPressed: () async {
                                    await verifyOTP(email, otpController.text);
                                  },
                                  text: 'Verify',
                                  enableLoader: true,
                                  loaderController:
                                      authVerifyButtonLoader.isLoading,
                                  options: FFButtonOptions(
                                    height: 40,
                                    loaderColor: themeColors.info,
                                    padding: EdgeInsetsDirectional.fromSTEB(
                                        16, 0, 16, 0),
                                    iconPadding: EdgeInsetsDirectional.fromSTEB(
                                        0, 0, 0, 0),
                                    color: themeColors.accent1,
                                    textStyle: themeFonts.titleSmall,
                                    elevation: 0,
                                    borderRadius: BorderRadius.circular(5),
                                  ),
                                ),
                              ),
                            ),
                          ),
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
