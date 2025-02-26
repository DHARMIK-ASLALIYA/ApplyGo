import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:lottie/lottie.dart';

import '../../../configs/project_config.dart';
import '../../../widgets/button_widget.dart';

class LoginVerificationScreenSmall extends StatelessWidget {
  const LoginVerificationScreenSmall({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Obx(() => Container(
            width: double.infinity,
            height: double.infinity,
            decoration: BoxDecoration(
              gradient: LinearGradient(
                colors: [themeColors.primary, themeColors.alternate],
                stops: [0.5, 0.75],
                begin: AlignmentDirectional(0, -1),
                end: AlignmentDirectional(0, 1),
              ),
            ),
            child: // Generated code for this Column Widget...
                Column(
              mainAxisSize: MainAxisSize.max,
              mainAxisAlignment: MainAxisAlignment.end,
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(),
                    child: Lottie.asset(
                      'assets/jsons/verify.json',
                      width: 278.46,
                      height: 200,
                      fit: BoxFit.contain,
                      animate: true,
                    ),
                  ),
                ),
                Padding(
                  padding: EdgeInsetsDirectional.fromSTEB(0, 0, 0, 100),
                  child: Container(
                    decoration: BoxDecoration(
                      color: themeColors.alternate,
                      borderRadius: BorderRadius.circular(30),
                    ),
                    child: Column(
                      mainAxisSize: MainAxisSize.max,
                      children: [
                        Padding(
                          padding: EdgeInsetsDirectional.fromSTEB(0, 45, 0, 10),
                          child: Text(
                            'Verification Code',
                            style: themeFonts.headlineSmall,
                          ),
                        ),
                        Padding(
                          padding: EdgeInsetsDirectional.fromSTEB(0, 0, 0, 20),
                          child: Text(
                            'We have sent the verification code to \nyour email address.',
                            textAlign: TextAlign.center,
                            style: themeFonts.labelSmall,
                          ),
                        ),
                        Padding(
                          padding: EdgeInsets.all(15),
                          child: Container(
                            decoration: BoxDecoration(),
                            child: Padding(
                              padding: EdgeInsets.all(7),
                              child: SizedBox(
                                width: double.infinity,
                                child: TextFormField(
                                  autofocus: false,
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
                                onPressed: () {},
                                text: 'Verify',
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
          )),
    );
  }
}
