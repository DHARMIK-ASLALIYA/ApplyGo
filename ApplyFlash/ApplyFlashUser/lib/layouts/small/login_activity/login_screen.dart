import 'package:applyflashuser/configs/project_config.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:get/get.dart';

import '../../../widgets/button_widget.dart';

class AuthenticationScreenSmall extends StatelessWidget {
  const AuthenticationScreenSmall({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Obx(
        () => Container(
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
          child: Column(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.end,
            children: [
              Expanded(
                child: Container(
                  decoration: BoxDecoration(),
                  child: Column(
                    mainAxisSize: MainAxisSize.max,
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Text(
                        'ApplyGo',
                        style: themeFonts.displayMedium,
                      ),
                    ],
                  ),
                ),
              ),
              Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 0, 0, 20),
                child: Container(
                  width: MediaQuery.sizeOf(context).width,
                  decoration: BoxDecoration(
                    color: themeColors.alternate,
                    borderRadius: BorderRadius.circular(30),
                  ),
                  child: Column(
                    mainAxisSize: MainAxisSize.max,
                    mainAxisAlignment: MainAxisAlignment.start,
                    children: [
                      Padding(
                        padding: EdgeInsetsDirectional.fromSTEB(0, 45, 0, 10),
                        child: Text(
                          'Welcome Back',
                          style: themeFonts.headlineSmall,
                        ),
                      ),
                      Padding(
                        padding: EdgeInsetsDirectional.fromSTEB(0, 0, 0, 20),
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
                            border: Border.all(
                              color: themeColors.secondaryText,
                            ),
                          ),
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
                                  hintText: 'UserName',
                                  hintStyle: themeFonts.labelLarge,
                                  enabledBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: Color(0x00000000),
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                  focusedBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: Color(0x00000000),
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                  errorBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: themeColors.error,
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                  focusedErrorBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: themeColors.error,
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                ),
                                style: themeFonts.titleLarge
                                    .apply(color: themeColors.primaryText),
                                cursorColor: themeColors.primaryText,
                              ),
                            ),
                          ),
                        ),
                      ),
                      Padding(
                        padding: EdgeInsetsDirectional.fromSTEB(15, 0, 15, 15),
                        child: Container(
                          decoration: BoxDecoration(
                            borderRadius: BorderRadius.circular(10),
                            border: Border.all(
                              color: themeColors.secondaryText,
                            ),
                          ),
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
                                  hintText: 'E-Mail',
                                  hintStyle: themeFonts.labelLarge,
                                  enabledBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: Color(0x00000000),
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                  focusedBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: Color(0x00000000),
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                  errorBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: themeColors.error,
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                  focusedErrorBorder: OutlineInputBorder(
                                    borderSide: BorderSide(
                                      color: themeColors.error,
                                      width: 1.0,
                                    ),
                                    borderRadius: BorderRadius.circular(20),
                                  ),
                                ),
                                style: themeFonts.titleLarge
                                    .apply(color: themeColors.primaryText),
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
                          child: FFButtonWidget(
                            onPressed: () {},
                            text: 'Request OTP',
                            options: FFButtonOptions(
                              height: 40,
                              padding:
                                  EdgeInsetsDirectional.fromSTEB(16, 0, 16, 0),
                              iconPadding:
                                  EdgeInsetsDirectional.fromSTEB(0, 0, 0, 0),
                              color: themeColors.accent1,
                              textStyle: themeFonts.titleSmall,
                              elevation: 0,
                              borderRadius: BorderRadius.circular(10),
                            ),
                          ),
                        ),
                      ),
                      Padding(
                        padding: EdgeInsets.all(5),
                        child: Text('Or Login with..',
                            style: themeFonts.labelSmall),
                      ),
                      Padding(
                        padding: EdgeInsetsDirectional.fromSTEB(15, 15, 15, 40),
                        child: Container(
                          width: double.infinity,
                          height: 60,
                          decoration: BoxDecoration(
                            borderRadius: BorderRadius.circular(0),
                          ),
                          child: FFButtonWidget(
                            onPressed: () {
                              themeController.changeThemeMode();
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
                              padding:
                                  EdgeInsetsDirectional.fromSTEB(16, 0, 16, 0),
                              iconPadding:
                                  EdgeInsetsDirectional.fromSTEB(0, 0, 0, 0),
                              color: themeColors.alternate,
                              textStyle: themeFonts.bodySmall,
                              elevation: 5,
                              borderSide: BorderSide(
                                color: themeColors.accent1,
                              ),
                              borderRadius: BorderRadius.circular(10),
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
      ),
    );
  }
}
