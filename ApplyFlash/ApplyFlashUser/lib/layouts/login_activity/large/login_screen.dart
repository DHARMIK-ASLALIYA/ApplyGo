import 'package:applyflashuser/apis/auth/auth_req_res.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:get/get.dart';
import '../../../../configs/project_config.dart';
import '../../../../widgets/button_widget.dart';
import '../../../widgets/custom_toast.dart';

class LoginScreenLarge extends StatelessWidget {
  const LoginScreenLarge({super.key});

  @override
  Widget build(BuildContext context) {
    TextEditingController emailController = TextEditingController();
    TextEditingController usernameController = TextEditingController();

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
                child: ClipRRect(
                  borderRadius: BorderRadius.circular(8),
                  child: Image.asset(
                    'assets/images/ttttt-fotor-20250218114759.png',
                    width: 200,
                    height: 200,
                    fit: BoxFit.cover,
                  ),
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
                  Material(
                    color: Colors.transparent,
                    elevation: 0,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(30),
                    ),
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
                                EdgeInsetsDirectional.fromSTEB(0, 20, 0, 10),
                            child: Text(
                              'Welcome to ApplyGo',
                              style: themeFonts.headlineLarge,
                            ),
                          ),
                          Padding(
                            padding:
                                EdgeInsetsDirectional.fromSTEB(0, 0, 0, 20),
                            child: Text(
                              'Enter your email and username to login to\n ApplyGo.',
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
                                    controller: usernameController,
                                    autofocus: false,
                                    obscureText: false,
                                    decoration: InputDecoration(
                                      isDense: true,
                                      labelStyle: themeFonts.titleLarge,
                                      alignLabelWithHint: false,
                                      hintText: 'UserName',
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
                                    cursorColor: themeColors.primaryText,
                                  ),
                                ),
                              ),
                            ),
                          ),
                          Padding(
                            padding:
                                EdgeInsetsDirectional.fromSTEB(15, 0, 15, 15),
                            child: Container(
                              decoration: BoxDecoration(
                                borderRadius: BorderRadius.circular(10),
                              ),
                              child: Padding(
                                padding: EdgeInsets.all(7),
                                child: SizedBox(
                                  width: double.infinity,
                                  child: TextFormField(
                                    controller: emailController,
                                    autofocus: false,
                                    obscureText: false,
                                    decoration: InputDecoration(
                                      isDense: true,
                                      labelStyle: themeFonts.titleLarge,
                                      alignLabelWithHint: false,
                                      hintText: 'E-mail',
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
                                    cursorColor: themeColors.primaryText,
                                  ),
                                ),
                              ),
                            ),
                          ),
                          Padding(
                            padding: EdgeInsets.all(15),
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
                                    await sendOTP(emailController.text);
                                  },
                                  enableLoader: true,
                                  loaderController: authButtonLoader.isLoading,
                                  text: 'Request OTP',
                                  options: FFButtonOptions(
                                    height: 40,
                                    padding: EdgeInsetsDirectional.fromSTEB(
                                        16, 0, 16, 0),
                                    iconPadding: EdgeInsetsDirectional.fromSTEB(
                                        0, 0, 0, 0),
                                    color: themeColors.accent1,
                                    textStyle: themeFonts.titleSmall,
                                    elevation: 0,
                                    borderRadius: BorderRadius.circular(5),
                                    loaderColor: themeColors.info,
                                  ),
                                ),
                              ),
                            ),
                          ),
                          Text(
                            'Or Login with ..',
                            style: themeFonts.labelSmall,
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
                                  onPressed: () {
                                    showCustomToast("Coming Soon");
                                  },
                                  text: ' Login with Google',
                                  icon: Icon(
                                    FontAwesomeIcons.google,
                                    color: themeColors.primaryText,
                                    weight: 500,
                                    size: 22,
                                  ),
                                  options: FFButtonOptions(
                                    height: 40,
                                    padding: EdgeInsetsDirectional.fromSTEB(
                                        16, 0, 16, 0),
                                    iconPadding: EdgeInsetsDirectional.fromSTEB(
                                        0, 0, 0, 0),
                                    color: themeColors.alternate,
                                    textStyle: themeFonts.bodySmall,
                                    elevation: 5,
                                    borderSide: BorderSide(
                                      color: themeColors.accent1,
                                    ),
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
